package t1f;

import zxb.j0;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f267352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f267353c;
    public final a31.a d;

    public s(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f267352b = aVar;
        this.f267353c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        ite.a aVar = (ite.a) ((phm.a) this.f267352b.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f267353c.f955b).get();
        j0 j0Var = (j0) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        bVar.getClass();
        j0Var.getClass();
        return new p(bVar, aVar, j0Var);
    }
}
