package bnb;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f17130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f17131c;

    public b(a31.a aVar, phm.a aVar2) {
        this.f17130b = aVar2;
        this.f17131c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        tib.b bVar = (tib.b) this.f17130b.get();
        ndd.b bVar2 = (ndd.b) ((phm.a) this.f17131c.f955b).get();
        bVar.getClass();
        bVar2.getClass();
        return new a(bVar, bVar2);
    }
}
