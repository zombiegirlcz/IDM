package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f31342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31343b;

    private n7(g7 g7Var, e4m.e eVar) {
        this.f31342a = g7Var;
        this.f31343b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b7 get() {
        return a(this.f31342a, (ib0) this.f31343b.get());
    }

    public static n7 a(g7 g7Var, e4m.e eVar) {
        return new n7(g7Var, eVar);
    }

    public static b7 a(g7 g7Var, ib0 ib0Var) {
        b7 b7VarD = g7Var.d(ib0Var);
        vc.s.k(b7VarD);
        return b7VarD;
    }
}
