package gp8;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f145330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f145331c;
    public final a31.a d;
    public final a31.a e;

    public o(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f145330b = aVar;
        this.f145331c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        ee0.a aVar = (ee0.a) ((phm.a) this.f145330b.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.f145331c.f955b).get();
        c21.e eVar = (c21.e) ((phm.a) this.d.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.e.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        cVar.getClass();
        return new b(new p(), aVar, aVar2, eVar, cVar);
    }
}
