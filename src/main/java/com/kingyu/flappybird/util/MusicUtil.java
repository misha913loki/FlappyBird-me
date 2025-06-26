package com.kingyu.flappybird.util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * 音乐工具类
 *
 * @author Kingyu
 * wav音频：JDK提供的类可直接解码 mp3音频：JDK没有提供支持，需要使用第三方的工具包
 */
public class MusicUtil {

    private static Clip fly;
    private static Clip crash;
    private static Clip score;

    public static void playFlySound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(MusicUtil.class.getResource("/fly.wav"));
            fly = AudioSystem.getClip();
            fly.open(audioInputStream);
            fly.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playCrashSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(MusicUtil.class.getResource("/crash.wav"));
            crash = AudioSystem.getClip();
            crash.open(audioInputStream);
            crash.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playScoreSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(MusicUtil.class.getResource("/score.wav"));
            score = AudioSystem.getClip();
            score.open(audioInputStream);
            score.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
