package fa0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f133186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f133187c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    public z(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        this.f133186b = aVar;
        this.f133187c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        vl2.a aVar = (vl2.a) ((phm.a) this.f133186b.f955b).get();
        kf0.c cVar = (kf0.c) ((phm.a) this.f133187c.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
        l70.e eVar = (l70.e) ((phm.a) this.e.f955b).get();
        an0.c cVar2 = (an0.c) ((phm.a) this.f.f955b).get();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        cVar2.getClass();
        return new y(aVar, cVar, aVar2, eVar, cVar2);
    }
}
