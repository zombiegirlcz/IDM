package androidx.core.os;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class HandlerCompat {

    public static class Api28Impl {
        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean postDelayed(Handler handler, Runnable runnable, Object obj2, long j2) {
            return handler.postDelayed(runnable, obj2, j2);
        }
    }

    public static Handler createAsync(Looper looper) {
        return Api28Impl.createAsync(looper);
    }

    public static boolean postDelayed(Handler handler, Runnable runnable, Object obj2, long j2) {
        return Api28Impl.postDelayed(handler, runnable, obj2, j2);
    }
}
