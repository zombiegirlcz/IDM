package gp6;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f145277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f145278c;
    public final a31.a d;

    public h(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f145277b = aVar;
        this.f145278c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        zp6.a aVar = (zp6.a) ((phm.a) this.f145277b.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.f145278c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        return new a(aVar, aVar2, cVar);
    }
}
