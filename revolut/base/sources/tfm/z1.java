package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class z1 extends efm.k implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270986b;

    public z1(efm.r rVar, long j2) {
        this.f270985a = rVar;
        this.f270986b = j2;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new x1(this.f270985a, this.f270986b, null, false);
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        this.f270985a.subscribe(new y1(lVar, this.f270986b));
    }
}
