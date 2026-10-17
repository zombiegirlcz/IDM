package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 extends efm.b implements nfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.i f245519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f245520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245521c;

    public r0(efm.i iVar, kfm.o oVar, int i) {
        this.f245519a = iVar;
        this.f245520b = oVar;
        this.f245521c = i;
    }

    @Override // nfm.b
    public final efm.i b() {
        return new p0(this.f245519a, this.f245520b, this.f245521c);
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        this.f245519a.n(new q0(dVar, this.f245520b, this.f245521c));
    }
}
