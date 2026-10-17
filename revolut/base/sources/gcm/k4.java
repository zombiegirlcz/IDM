package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class k4 implements ecm.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142730c;

    public /* synthetic */ k4(Object obj2, Object obj3, int i) {
        this.f142728a = i;
        this.f142730c = obj2;
        this.f142729b = obj3;
    }

    @Override // ecm.z0
    public final void a(ecm.s sVar) {
        ecm.y0 h4Var;
        ecm.y0 n4Var;
        switch (this.f142728a) {
            case 0:
                o4 o4Var = (o4) this.f142730c;
                ecm.u0 u0Var = o4Var.f;
                ecm.x0 x0Var = (ecm.x0) this.f142729b;
                ecm.r rVar = sVar.f124871a;
                if (rVar == ecm.r.SHUTDOWN) {
                    return;
                }
                ecm.r rVar2 = ecm.r.TRANSIENT_FAILURE;
                if (rVar == rVar2 || rVar == ecm.r.IDLE) {
                    u0Var.e();
                }
                if (o4Var.f142797h == rVar2) {
                    if (rVar == ecm.r.CONNECTING) {
                        return;
                    }
                    if (rVar == ecm.r.IDLE) {
                        o4Var.e();
                        return;
                    }
                }
                int i = l4.f142761a[rVar.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        n4Var = new n4(ecm.v0.e);
                    } else if (i == 3) {
                        h4Var = new n4(ecm.v0.b(x0Var, null));
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Unsupported state:" + rVar);
                        }
                        n4Var = new n4(ecm.v0.a(sVar.f124872b));
                    }
                    o4Var.f142797h = rVar;
                    u0Var.f(rVar, n4Var);
                    return;
                }
                h4Var = new h4(o4Var, x0Var);
                n4Var = h4Var;
                o4Var.f142797h = rVar;
                u0Var.f(rVar, n4Var);
                return;
            case 1:
                ((ecm.z0) this.f142729b).a(sVar);
                ((mcm.j) this.f142730c).f204391b.a(sVar);
                return;
            default:
                mcm.w wVar = (mcm.w) this.f142730c;
                wVar.d = sVar;
                if (wVar.f204419c) {
                    return;
                }
                ((ecm.z0) this.f142729b).a(sVar);
                return;
        }
    }
}
