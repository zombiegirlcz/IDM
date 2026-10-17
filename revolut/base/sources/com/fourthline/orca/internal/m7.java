package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f31016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31017b;

    private m7(g7 g7Var, e4m.e eVar) {
        this.f31016a = g7Var;
        this.f31017b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g6 get() {
        return a(this.f31016a, (ib0) this.f31017b.get());
    }

    public static m7 a(g7 g7Var, e4m.e eVar) {
        return new m7(g7Var, eVar);
    }

    public static g6 a(g7 g7Var, ib0 ib0Var) {
        g6 g6VarC = g7Var.c(ib0Var);
        vc.s.k(g6VarC);
        return g6VarC;
    }
}
