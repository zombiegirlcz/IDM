package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 extends efm.d0 implements nfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.i f245407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245408b;

    public f0(efm.i iVar, Boolean bool) {
        this.f245407a = iVar;
        this.f245408b = bool;
    }

    @Override // nfm.b
    public final efm.i b() {
        return new b0(this.f245407a, this.f245408b, true);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        this.f245407a.n(new e0(f0Var, this.f245408b));
    }
}
