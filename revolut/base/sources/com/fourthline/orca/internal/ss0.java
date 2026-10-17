package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ss0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f33126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33127b;

    private ss0(ms0 ms0Var, e4m.e eVar) {
        this.f33126a = ms0Var;
        this.f33127b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yr0 get() {
        return a(this.f33126a, (v10) this.f33127b.get());
    }

    public static ss0 a(ms0 ms0Var, e4m.e eVar) {
        return new ss0(ms0Var, eVar);
    }

    public static yr0 a(ms0 ms0Var, v10 v10Var) {
        yr0 yr0VarB = ms0Var.b(v10Var);
        vc.s.k(yr0VarB);
        return yr0VarB;
    }
}
