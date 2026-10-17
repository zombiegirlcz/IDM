package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class c3 extends ecm.t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f142600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.v1 f142601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3 f142602c;

    public c3(k3 k3Var, b3 b3Var, i1 i1Var) {
        this.f142602c = k3Var;
        this.f142600a = (b3) Preconditions.checkNotNull(b3Var, "helperImpl");
        this.f142601b = (ecm.v1) Preconditions.checkNotNull(i1Var, "resolver");
    }

    @Override // ecm.t1
    public final void a(ecm.g2 g2Var) {
        Preconditions.checkArgument(!g2Var.e(), "the error status must not be OK");
        this.f142602c.f142719n.execute(new au0.x5(15, (Object) this, false, (Object) g2Var));
    }

    @Override // ecm.t1
    public final void b(ecm.u1 u1Var) {
        this.f142602c.f142719n.execute(new ch.p(14, this, false, u1Var));
    }
}
