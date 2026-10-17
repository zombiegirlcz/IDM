package zdl;

import xf6.a1;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f321601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f321602c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final phm.a f321603g;

    public m(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a1 a1Var) {
        this.f321601b = aVar;
        this.f321602c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f321603g = a1Var;
    }

    @Override // b60.a
    public final Object a() {
        ee0.a aVar = (ee0.a) ((phm.a) this.f321601b.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.f321602c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        ifl.a aVar3 = (ifl.a) ((phm.a) this.e.f955b).get();
        c4f.k kVar = (c4f.k) ((phm.a) this.f.f955b).get();
        c cVar2 = (c) this.f321603g.get();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        kVar.getClass();
        cVar2.getClass();
        return new f(aVar, aVar2, cVar, aVar3, kVar, cVar2);
    }
}
