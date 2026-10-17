package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class s extends efm.b implements nfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.k f253976a;

    public s(efm.k kVar) {
        this.f253976a = kVar;
    }

    @Override // nfm.c
    public final efm.k c() {
        return new r(this.f253976a, 0);
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        this.f253976a.i(new q(dVar, 2));
    }
}
