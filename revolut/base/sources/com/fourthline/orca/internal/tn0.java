package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class tn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f33808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33809b;

    private tn0(hn0 hn0Var, e4m.e eVar) {
        this.f33808a = hn0Var;
        this.f33809b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lp0 get() {
        return a(this.f33808a, (r70) this.f33809b.get());
    }

    public static tn0 a(hn0 hn0Var, e4m.e eVar) {
        return new tn0(hn0Var, eVar);
    }

    public static lp0 a(hn0 hn0Var, r70 r70Var) {
        lp0 lp0VarA = hn0Var.a(r70Var);
        vc.s.k(lp0VarA);
        return lp0VarA;
    }
}
