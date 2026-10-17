package androidx.media3.common.util;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BackgroundExecutor {
    private static Executor staticInstance;

    public static synchronized Executor get() {
        try {
            if (staticInstance == null) {
                staticInstance = Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return staticInstance;
    }
}
