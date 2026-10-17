package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class h7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f29155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29156b;

    private h7(g7 g7Var, e4m.e eVar) {
        this.f29155a = g7Var;
        this.f29156b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z5 get() {
        return a(this.f29155a, (ib0) this.f29156b.get());
    }

    public static h7 a(g7 g7Var, e4m.e eVar) {
        return new h7(g7Var, eVar);
    }

    public static z5 a(g7 g7Var, ib0 ib0Var) {
        z5 z5VarA = g7Var.a(ib0Var);
        vc.s.k(z5VarA);
        return z5VarA;
    }
}
