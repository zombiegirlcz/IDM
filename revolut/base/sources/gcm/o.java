package gcm;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f142787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f142788b;

    public o(hcm.l lVar, a3 a3Var) {
        this.f142787a = (f0) Preconditions.checkNotNull(lVar, "delegate");
        this.f142788b = (Executor) Preconditions.checkNotNull(a3Var, "appExecutor");
    }

    @Override // gcm.f0
    public final i0 E5(SocketAddress socketAddress, e0 e0Var, f2 f2Var) {
        return new n(this, this.f142787a.E5(socketAddress, e0Var, f2Var), e0Var.f142621a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f142787a.close();
    }

    @Override // gcm.f0
    public final ScheduledExecutorService getScheduledExecutorService() {
        return this.f142787a.getScheduledExecutorService();
    }
}
