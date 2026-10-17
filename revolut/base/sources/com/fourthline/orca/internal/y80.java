package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y80 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t80 f35191a;

    private y80(t80 t80Var) {
        this.f35191a = t80Var;
    }

    public static r71 b(t80 t80Var) {
        r71 r71VarB = t80Var.b();
        vc.s.k(r71VarB);
        return r71VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r71 get() {
        return b(this.f35191a);
    }

    public static y80 a(t80 t80Var) {
        return new y80(t80Var);
    }
}
