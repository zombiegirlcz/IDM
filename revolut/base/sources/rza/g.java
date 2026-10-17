package rza;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements b60.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f258579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f258580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f258581c;
    public final a31.a d;
    public final a31.a e;
    public final phm.a f;

    public g(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ibh.a aVar6) {
        this.f258579a = aVar;
        this.f258580b = aVar2;
        this.f258581c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    @Override // b60.d
    public final Object a() {
        poi.b bVar = (poi.b) ((phm.a) this.f258579a.f955b).get();
        lqi.a aVar = (lqi.a) ((phm.a) this.f258580b.f955b).get();
        cri.b bVar2 = (cri.b) ((phm.a) this.f258581c.f955b).get();
        l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
        w3e.b bVar3 = (w3e.b) ((phm.a) this.e.f955b).get();
        jza.f fVar = (jza.f) this.f.get();
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        eVar.getClass();
        bVar3.getClass();
        fVar.getClass();
        return new b(new hri.b(), bVar, aVar, bVar2, eVar, bVar3, fVar);
    }
}
