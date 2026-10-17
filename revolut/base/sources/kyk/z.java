package kyk;

import zu8.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f191005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f191006c;

    public z(a31.a aVar, a31.a aVar2) {
        this.f191005b = aVar;
        this.f191006c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        zdl.f fVar = (zdl.f) ((phm.a) this.f191005b.f955b).get();
        c0 c0Var = (c0) ((phm.a) this.f191006c.f955b).get();
        fVar.getClass();
        c0Var.getClass();
        return new x(fVar, c0Var);
    }
}
