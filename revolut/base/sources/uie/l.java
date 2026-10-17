package uie;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements qie.b, qie.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qie.b f280400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qie.a f280401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fma.h f280402c;
    public final z73.i d;
    public final ite.a e;
    public final h30.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f280403g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f280404h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f280405j;

    public l(z73.i iVar, qie.b bVar, qie.a aVar, h30.a aVar2, ite.a aVar3, fma.h hVar, jge.k kVar) {
        this.f280400a = bVar;
        this.f280401b = aVar;
        this.f280402c = hVar;
        this.d = iVar;
        this.e = aVar3;
        this.f = aVar2;
        int i = 20;
        this.f280404h = e4m.b.b(new tn3.a(this, 0, i));
        this.i = e4m.b.b(new tn3.a(this, 1, i));
        this.f280405j = e4m.b.b(new tn3.a(this, 2, i));
        e4m.b.b(new tn3.a(this, 3, i));
    }

    @Override // qie.a
    public final vie.h a() {
        vie.h hVarA = this.f280401b.a();
        vc.s.j(hVarA);
        return hVarA;
    }

    @Override // qie.b
    public final vie.i b() {
        vie.i iVarB = this.f280400a.b();
        vc.s.j(iVarB);
        return iVarB;
    }
}
