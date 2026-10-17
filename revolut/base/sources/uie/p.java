package uie;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f280415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f280416c;

    public p(a31.a aVar, a31.a aVar2) {
        this.f280415b = aVar;
        this.f280416c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        uq3.b bVar = (uq3.b) ((phm.a) this.f280415b.f955b).get();
        ite.a aVar = (ite.a) ((phm.a) this.f280416c.f955b).get();
        bVar.getClass();
        aVar.getClass();
        return new m(bVar, aVar);
    }
}
