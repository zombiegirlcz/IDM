package x98;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f303644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f303645c;
    public final a31.a d;

    public s(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f303644b = aVar;
        this.f303645c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        nj0.a aVar = (nj0.a) ((phm.a) this.f303644b.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.f303645c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        return new b(new v(), aVar2, aVar, cVar);
    }
}
