package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MainThreadAsyncHandler {
    private static volatile Handler sHandler;

    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            try {
                if (sHandler == null) {
                    sHandler = HandlerCompat.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return sHandler;
    }
}
