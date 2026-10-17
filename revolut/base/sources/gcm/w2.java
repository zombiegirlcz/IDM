package gcm;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class w2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f142915a;

    public w2(k3 k3Var) {
        this.f142915a = k3Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th10) {
        Logger logger = k3.f142706d0;
        Level level = Level.SEVERE;
        StringBuilder sb6 = new StringBuilder("[");
        k3 k3Var = this.f142915a;
        sb6.append(k3Var.f142709a);
        sb6.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb6.toString(), th10);
        if (k3Var.z) {
            return;
        }
        k3Var.z = true;
        k3Var.j(true);
        k3Var.n(false);
        k3Var.E.g(new t2(th10));
        k3Var.P.h(null);
        k3Var.N.a(ecm.f.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        k3Var.f142723s.c(ecm.r.TRANSIENT_FAILURE);
    }
}
