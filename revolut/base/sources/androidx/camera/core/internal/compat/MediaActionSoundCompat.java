package androidx.camera.core.internal.compat;

import android.os.Build;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MediaActionSoundCompat {
    public static boolean mustPlayShutterSound() {
        return Build.VERSION.SDK_INT >= 33 ? MediaActionSoundCompatApi33Impl.mustPlayShutterSound() : MediaActionSoundCompatBaseImpl.mustPlayShutterSound();
    }
}
