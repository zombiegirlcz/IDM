package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class f3 extends p0 {
    public final ecm.v k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ecm.p1 f142638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ecm.d f142639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f142640n;
    public final /* synthetic */ g3 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public f3(g3 g3Var, ecm.v vVar, ecm.p1 p1Var, ecm.d dVar) {
        this.o = g3Var;
        k3 k3Var = g3Var.d;
        Logger logger = k3.f142706d0;
        Executor executor = dVar.f124791b;
        super(executor == null ? k3Var.i : executor, k3Var.f142715h, dVar.f124790a);
        this.k = vVar;
        this.f142638l = p1Var;
        this.f142639m = dVar;
        k3Var.Z.getClass();
        this.f142640n = System.nanoTime();
    }

    public final void i() {
        k0 k0Var;
        ecm.v vVarA = this.k.a();
        try {
            ecm.d dVar = this.f142639m;
            ecm.c cVar = ecm.n.d;
            this.o.d.Z.getClass();
            ecm.i iVarG = this.o.g(this.f142638l, dVar.c(cVar, Long.valueOf(System.nanoTime() - this.f142640n)));
            synchronized (this) {
                try {
                    if (this.f != null) {
                        k0Var = null;
                    } else {
                        ecm.i iVar = (ecm.i) Preconditions.checkNotNull(iVarG, "call");
                        ecm.i iVar2 = this.f;
                        Preconditions.checkState(iVar2 == null, "realCall already set to %s", iVar2);
                        ScheduledFuture scheduledFuture = this.f142803a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f = iVar;
                        k0Var = new k0(this, this.f142805c);
                    }
                } finally {
                }
            }
            if (k0Var == null) {
                this.o.d.f142719n.execute(new com.bumptech.glide.k(this, 5));
                return;
            }
            k3 k3Var = this.o.d;
            Executor executor = this.f142639m.f124791b;
            if (executor == null) {
                executor = k3Var.i;
            }
            executor.execute(new ch.p(16, this, false, k0Var));
        } finally {
            this.k.c(vVarA);
        }
    }
}
