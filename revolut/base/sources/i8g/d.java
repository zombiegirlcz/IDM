package i8g;

import zxb.j0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f159534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f159535c;
    public final a31.a d;

    public d(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f159534b = aVar;
        this.f159535c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        ite.a aVar = (ite.a) ((phm.a) this.f159534b.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f159535c.f955b).get();
        j0 j0Var = (j0) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        bVar.getClass();
        j0Var.getClass();
        return new c(bVar, aVar, j0Var);
    }
}
