package n0d;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f211015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f211016c;
    public final a31.a d;
    public final a31.a e;

    public e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f211015b = aVar;
        this.f211016c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        nj0.a aVar = (nj0.a) ((phm.a) this.f211015b.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.f211016c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        se8.a aVar3 = (se8.a) ((phm.a) this.e.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        return new a(aVar, aVar2, cVar, aVar3);
    }
}
