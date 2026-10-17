package tf5;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f270224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f270225c;
    public final a31.a d;
    public final a31.a e;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f270224b = aVar;
        this.f270225c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        c21.e eVar = (c21.e) ((phm.a) this.f270224b.f955b).get();
        ee0.a aVar = (ee0.a) ((phm.a) this.f270225c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        efk.a aVar2 = (efk.a) ((phm.a) this.e.f955b).get();
        eVar.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        return new l(eVar, aVar, cVar, aVar2);
    }
}
