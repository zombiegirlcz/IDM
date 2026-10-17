package dmc;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f115949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f115950c;

    public g0(a31.a aVar, phm.a aVar2) {
        this.f115949b = aVar;
        this.f115950c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        zdl.f fVar = (zdl.f) ((phm.a) this.f115949b.f955b).get();
        a aVar = (a) this.f115950c.get();
        fVar.getClass();
        aVar.getClass();
        return new c(fVar, aVar);
    }
}
