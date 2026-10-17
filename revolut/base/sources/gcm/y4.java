package gcm;

import io.grpc.StatusRuntimeException;
import java.lang.Thread;

/* JADX INFO: loaded from: classes13.dex */
public final class y4 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th10) {
        throw new StatusRuntimeException(ecm.g2.d(th10).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
