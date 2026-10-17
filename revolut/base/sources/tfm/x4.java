package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 extends agm.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final agm.a f270934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final efm.r f270935h;

    public x4(agm.a aVar, efm.r rVar) {
        this.f270934g = aVar;
        this.f270935h = rVar;
    }

    @Override // agm.a
    public final void d(kfm.g gVar) {
        this.f270934g.d(gVar);
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270935h.subscribe(yVar);
    }
}
