package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends efm.b implements nfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f245389a;

    public d1(a aVar) {
        this.f245389a = aVar;
    }

    @Override // nfm.b
    public final efm.i b() {
        return new b1(this.f245389a, 0);
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        this.f245389a.n(new c1(dVar));
    }
}
