package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class f3 extends efm.b implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270455a;

    public f3(efm.r rVar) {
        this.f270455a = rVar;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new x0(this.f270455a, 2);
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        this.f270455a.subscribe(new d3(dVar, 1));
    }
}
