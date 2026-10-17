package f4g;

/* JADX INFO: loaded from: classes9.dex */
public final class d1 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f132099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f132100c;
    public final a31.a d;

    public d1(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f132099b = aVar;
        this.f132100c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        ite.a aVar = (ite.a) ((phm.a) this.f132099b.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f132100c.f955b).get();
        zxb.j0 j0Var = (zxb.j0) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        bVar.getClass();
        j0Var.getClass();
        return new a1(bVar, aVar, j0Var);
    }
}
