package vjb;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f289696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f289697c;
    public final a31.a d;
    public final a31.a e;

    public h(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f289696b = aVar;
        this.f289697c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        an0.c cVar = (an0.c) ((phm.a) this.f289696b.f955b).get();
        ee0.a aVar = (ee0.a) ((phm.a) this.f289697c.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.d.f955b).get();
        rg0.e eVar = (rg0.e) ((phm.a) this.e.f955b).get();
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        return new b(cVar, aVar, aVar2, eVar);
    }
}
