package ta9;

/* JADX INFO: loaded from: classes13.dex */
public final class p0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f269265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f269266c;
    public final a31.a d;
    public final a31.a e;

    public p0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f269265b = aVar;
        this.f269266c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        nj0.a aVar = (nj0.a) ((phm.a) this.f269265b.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.f269266c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        hcb.a aVar3 = (hcb.a) ((phm.a) this.e.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        return new e0(aVar, aVar2, cVar, aVar3);
    }
}
