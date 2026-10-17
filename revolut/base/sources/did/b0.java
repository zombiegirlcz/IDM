package did;

import zxb.j0;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f114987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f114988c;
    public final a31.a d;

    public b0(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f114987b = aVar;
        this.f114988c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        ite.a aVar = (ite.a) ((phm.a) this.f114987b.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f114988c.f955b).get();
        j0 j0Var = (j0) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        bVar.getClass();
        j0Var.getClass();
        return new q(bVar, aVar, j0Var);
    }
}
