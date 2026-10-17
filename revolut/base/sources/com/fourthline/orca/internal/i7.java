package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class i7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f29520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29521b;

    private i7(g7 g7Var, e4m.e eVar) {
        this.f29520a = g7Var;
        this.f29521b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u6 get() {
        return a(this.f29520a, (kh1) this.f29521b.get());
    }

    public static i7 a(g7 g7Var, e4m.e eVar) {
        return new i7(g7Var, eVar);
    }

    public static u6 a(g7 g7Var, kh1 kh1Var) {
        u6 u6VarA = g7Var.a(kh1Var);
        vc.s.k(u6VarA);
        return u6VarA;
    }
}
