package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f28411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28412b;

    private fc0(zb0 zb0Var, e4m.e eVar) {
        this.f28411a = zb0Var;
        this.f28412b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n9 get() {
        return a(this.f28411a, (gj) this.f28412b.get());
    }

    public static fc0 a(zb0 zb0Var, e4m.e eVar) {
        return new fc0(zb0Var, eVar);
    }

    public static n9 a(zb0 zb0Var, gj gjVar) {
        n9 n9VarB = zb0Var.b(gjVar);
        vc.s.k(n9VarB);
        return n9VarB;
    }
}
