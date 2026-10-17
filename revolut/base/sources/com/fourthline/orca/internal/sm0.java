package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f33061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33062b;

    private sm0(pm0 pm0Var, e4m.e eVar) {
        this.f33061a = pm0Var;
        this.f33062b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ox get() {
        return a(this.f33061a, (g8) this.f33062b.get());
    }

    public static sm0 a(pm0 pm0Var, e4m.e eVar) {
        return new sm0(pm0Var, eVar);
    }

    public static ox a(pm0 pm0Var, g8 g8Var) {
        ox oxVarA = pm0Var.a(g8Var);
        vc.s.k(oxVarA);
        return oxVarA;
    }
}
