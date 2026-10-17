package ql7;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f247287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f247288c;

    public e2(a31.a aVar, a31.a aVar2) {
        this.f247287b = aVar;
        this.f247288c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        ee0.a aVar = (ee0.a) ((phm.a) this.f247287b.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f247288c.f955b).get();
        aVar.getClass();
        cVar.getClass();
        return new a(aVar, cVar);
    }
}
