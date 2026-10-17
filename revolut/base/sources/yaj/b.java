package yaj;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f312050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f312051c;
    public final a31.a d;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f312050b = aVar;
        this.f312051c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        ee0.a aVar = (ee0.a) ((phm.a) this.f312050b.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.f312051c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        return new g(cVar, aVar, aVar2);
    }
}
