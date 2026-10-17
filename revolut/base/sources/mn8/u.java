package mn8;

/* JADX INFO: loaded from: classes13.dex */
public final class u extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f207483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f207484c;
    public final a31.a d;
    public final a31.a e;

    public u(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f207483b = aVar;
        this.f207484c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        nj0.a aVar = (nj0.a) ((phm.a) this.f207483b.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.f207484c.f955b).get();
        mj8.b bVar = (mj8.b) ((phm.a) this.d.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.e.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        cVar.getClass();
        return new b(new v(), aVar2, aVar, bVar, cVar);
    }
}
