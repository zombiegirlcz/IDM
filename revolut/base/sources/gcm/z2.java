package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class z2 implements r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f143008a;

    public z2(k3 k3Var) {
        this.f143008a = k3Var;
    }

    @Override // gcm.r3
    public final void a(ecm.g2 g2Var) {
        Preconditions.checkState(this.f143008a.G.get(), "Channel must have been shut down");
    }

    @Override // gcm.r3
    public final void b() {
    }

    @Override // gcm.r3
    public final ecm.b c(ecm.b bVar) {
        return bVar;
    }

    @Override // gcm.r3
    public final void d() {
        k3 k3Var = this.f143008a;
        Preconditions.checkState(k3Var.G.get(), "Channel must have been shut down");
        k3Var.H = true;
        k3Var.n(false);
        k3Var.getClass();
        k3.i(k3Var);
    }

    @Override // gcm.r3
    public final void e(boolean z) {
        k3 k3Var = this.f143008a;
        k3Var.f142710a0.n(k3Var.E, z);
        if (z) {
            k3Var.k();
        }
    }
}
