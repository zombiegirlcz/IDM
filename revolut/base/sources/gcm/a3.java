package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class a3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6 f142558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f142559b;

    public a3(d6 d6Var) {
        this.f142558a = (d6) Preconditions.checkNotNull(d6Var, "executorPool");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f142559b == null) {
                    this.f142559b = (Executor) Preconditions.checkNotNull((Executor) c6.a(this.f142558a.f142618a), "%s.getObject()", this.f142559b);
                }
                executor = this.f142559b;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        executor.execute(runnable);
    }
}
