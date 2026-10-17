package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class t51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p51 f33210a;

    private t51(p51 p51Var) {
        this.f33210a = p51Var;
    }

    public static g6 b(p51 p51Var) {
        g6 g6VarD = p51Var.d();
        vc.s.k(g6VarD);
        return g6VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g6 get() {
        return b(this.f33210a);
    }

    public static t51 a(p51 p51Var) {
        return new t51(p51Var);
    }
}
