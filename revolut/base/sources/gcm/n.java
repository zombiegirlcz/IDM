package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f142776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f142777b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ecm.g2 f142778c;

    public n(o oVar, i0 i0Var, String str) {
        new m(this);
        this.f142776a = (i0) Preconditions.checkNotNull(i0Var, "delegate");
    }

    @Override // gcm.g1, gcm.s3
    public final void c(ecm.g2 g2Var) {
        Preconditions.checkNotNull(g2Var, "status");
        synchronized (this) {
            try {
                if (this.f142777b.get() < 0) {
                    this.f142778c = g2Var;
                    this.f142777b.addAndGet(Integer.MAX_VALUE);
                    if (this.f142777b.get() != 0) {
                        return;
                    }
                    super.c(g2Var);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // gcm.d0
    public final a0 d(ecm.p1 p1Var, ecm.m1 m1Var, ecm.d dVar, ecm.n[] nVarArr) {
        dVar.getClass();
        return this.f142777b.get() >= 0 ? new c1(this.f142778c, b0.PROCESSED, nVarArr) : this.f142776a.d(p1Var, m1Var, dVar, nVarArr);
    }

    @Override // gcm.g1
    public final i0 e() {
        return this.f142776a;
    }
}
