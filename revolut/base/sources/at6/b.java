package at6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f9004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f9005c;
    public final a31.a d;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f9004b = aVar;
        this.f9005c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        ee0.a aVar = (ee0.a) ((phm.a) this.f9004b.f955b).get();
        c21.e eVar = (c21.e) ((phm.a) this.f9005c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        eVar.getClass();
        cVar.getClass();
        return new a(new c(), aVar, eVar, cVar);
    }
}
