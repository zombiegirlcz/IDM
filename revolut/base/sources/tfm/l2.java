package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class l2 extends efm.b implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f270608c;

    public l2(efm.r rVar, kfm.o oVar, boolean z) {
        this.f270606a = rVar;
        this.f270607b = oVar;
        this.f270608c = z;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new j2(this.f270606a, this.f270607b, this.f270608c, 0);
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        this.f270606a.subscribe(new k2(dVar, this.f270607b, this.f270608c));
    }
}
