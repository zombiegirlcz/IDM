package androidx.camera.viewfinder.internal.utils;

import android.os.Looper;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Threads {
    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
