package rlb;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f255009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f255010c;

    public m(a31.a aVar, phm.a aVar2) {
        this.f255009b = aVar2;
        this.f255010c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        tib.b bVar = (tib.b) this.f255009b.get();
        ite.a aVar = (ite.a) ((phm.a) this.f255010c.f955b).get();
        bVar.getClass();
        aVar.getClass();
        return new a(bVar, aVar);
    }
}
