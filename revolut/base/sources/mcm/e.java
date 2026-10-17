package mcm;

import ecm.a1;
import ecm.g2;
import ecm.t0;
import ecm.v0;
import ecm.w0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends a1 {
    public final /* synthetic */ i f;

    public e(i iVar) {
        this.f = iVar;
    }

    @Override // ecm.a1
    public final void c(g2 g2Var) {
        this.f.f204384g.f(ecm.r.TRANSIENT_FAILURE, new t0(v0.a(g2Var)));
    }

    @Override // ecm.a1
    public final void d(w0 w0Var) {
        throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
    }

    @Override // ecm.a1
    public final void f() {
    }
}
