package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class bm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl0 f27163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27164b;

    private bm0(zl0 zl0Var, e4m.e eVar) {
        this.f27163a = zl0Var;
        this.f27164b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e30 get() {
        return a(this.f27163a, (sg0) this.f27164b.get());
    }

    public static bm0 a(zl0 zl0Var, e4m.e eVar) {
        return new bm0(zl0Var, eVar);
    }

    public static e30 a(zl0 zl0Var, sg0 sg0Var) {
        e30 e30VarA = zl0Var.a(sg0Var);
        vc.s.k(e30VarA);
        return e30VarA;
    }
}
