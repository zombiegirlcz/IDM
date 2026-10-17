package skm;

/* JADX INFO: loaded from: classes13.dex */
public final class k1 extends i1 {
    public final r1 e;
    public final l1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f263985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f263986h;

    public k1(r1 r1Var, l1 l1Var, p pVar, Object obj2) {
        this.e = r1Var;
        this.f = l1Var;
        this.f263985g = pVar;
        this.f263986h = obj2;
    }

    @Override // skm.i1
    public final boolean i() {
        return false;
    }

    @Override // skm.i1
    public final void j(Throwable th10) {
        p pVar = this.f263985g;
        p pVarX = r1.X(pVar);
        r1 r1Var = this.e;
        l1 l1Var = this.f;
        Object obj2 = this.f263986h;
        if (pVarX == null || !r1Var.g0(l1Var, pVarX, obj2)) {
            l1Var.f263991a.c(new zkm.i(2), 2);
            p pVarX2 = r1.X(pVar);
            if (pVarX2 == null || !r1Var.g0(l1Var, pVarX2, obj2)) {
                r1Var.w(r1Var.H(l1Var, obj2));
            }
        }
    }
}
