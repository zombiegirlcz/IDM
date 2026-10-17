package androidx.camera.viewfinder.internal.utils.executor;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
final class DirectExecutor implements Executor {
    private static volatile DirectExecutor sDirectExecutor;

    public static Executor getInstance() {
        if (sDirectExecutor != null) {
            return sDirectExecutor;
        }
        synchronized (DirectExecutor.class) {
            try {
                if (sDirectExecutor == null) {
                    sDirectExecutor = new DirectExecutor();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return sDirectExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
