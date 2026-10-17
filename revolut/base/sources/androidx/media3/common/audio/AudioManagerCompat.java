package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import com.google.common.base.Preconditions;
import d0.c;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AudioManagerCompat {
    private static Context applicationContext;
    private static AudioManager audioManager;

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        try {
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext != applicationContext2) {
                audioManager = null;
            }
            AudioManager audioManager2 = audioManager;
            if (audioManager2 != null) {
                return audioManager2;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                ConditionVariable conditionVariable = new ConditionVariable();
                BackgroundExecutor.get().execute(new c(applicationContext2, conditionVariable, 18));
                conditionVariable.blockUninterruptible();
                return (AudioManager) Preconditions.checkNotNull(audioManager);
            }
            AudioManager audioManager3 = (AudioManager) applicationContext2.getSystemService("audio");
            audioManager = audioManager3;
            return (AudioManager) Preconditions.checkNotNull(audioManager3);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public static int getStreamMaxVolume(AudioManager audioManager2, int i) {
        return audioManager2.getStreamMaxVolume(i);
    }

    public static int getStreamMinVolume(AudioManager audioManager2, int i) {
        return audioManager2.getStreamMinVolume(i);
    }

    public static int getStreamVolume(AudioManager audioManager2, int i) {
        try {
            return audioManager2.getStreamVolume(i);
        } catch (RuntimeException e) {
            Log.w("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager2.getStreamMaxVolume(i);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i) {
        return audioManager2.isStreamMute(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAudioManager$0(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest());
    }
}
