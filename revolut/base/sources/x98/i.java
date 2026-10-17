package x98;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f303619b;

    public /* synthetic */ i(o oVar, int i) {
        this.f303618a = i;
        this.f303619b = oVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f303618a) {
            case 0:
                ha8.j jVar = new ha8.j();
                o oVar = this.f303619b;
                hj8.a aVarA = oVar.d.a();
                vc.s.j(aVarA);
                ybl.k kVarD = oVar.f303628a.d();
                vc.s.j(kVarD);
                return new ha8.i(jVar, aVarA, kVarD, oVar.f303631g.b(), oVar.f303632h.f(), oVar.c());
            default:
                za8.l lVar = new za8.l();
                o oVar2 = this.f303619b;
                hj8.a aVarA2 = oVar2.d.a();
                vc.s.j(aVarA2);
                return new za8.k(lVar, aVarA2, oVar2.f303632h.f(), oVar2.c(), oVar2.f303634l.e());
        }
    }
}
