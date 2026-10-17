package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends efm.d0 implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270956a;

    public y0(efm.r rVar) {
        this.f270956a = rVar;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new x0(this.f270956a, 0);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        this.f270956a.subscribe(new w0(f0Var, 1));
    }
}
