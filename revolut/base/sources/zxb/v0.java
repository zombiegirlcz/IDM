package zxb;

/* JADX INFO: loaded from: classes6.dex */
public final class v0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f326302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f326303c;
    public final a31.a d;
    public final a31.a e;

    public v0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f326302b = aVar;
        this.f326303c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        ite.a aVar = (ite.a) ((phm.a) this.f326302b.f955b).get();
        bpj.a aVar2 = (bpj.a) ((phm.a) this.f326303c.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.d.f955b).get();
        whc.c cVar = (whc.c) ((phm.a) this.e.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        cVar.getClass();
        return new j0(aVar, aVar2, bVar, cVar);
    }
}
