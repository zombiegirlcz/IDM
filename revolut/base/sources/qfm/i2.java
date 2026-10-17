package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class i2 extends efm.d0 implements nfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f245425a;

    public i2(j0 j0Var) {
        this.f245425a = j0Var;
    }

    @Override // nfm.b
    public final efm.i b() {
        return new g2(this.f245425a);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        this.f245425a.n(new h2(f0Var));
    }
}
