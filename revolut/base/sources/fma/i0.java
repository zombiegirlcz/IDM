package fma;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f136163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f136164c;
    public final a31.a d;

    public i0(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f136163b = aVar;
        this.f136164c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        p8l.a aVar = (p8l.a) ((phm.a) this.f136163b.f955b).get();
        cri.b bVar = (cri.b) ((phm.a) this.f136164c.f955b).get();
        cri.a aVar2 = (cri.a) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        return new l(aVar, bVar, aVar2);
    }
}
