package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class tm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f33804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33805b;

    private tm0(pm0 pm0Var, e4m.e eVar) {
        this.f33804a = pm0Var;
        this.f33805b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cp0 get() {
        return a(this.f33804a, (mp0) this.f33805b.get());
    }

    public static tm0 a(pm0 pm0Var, e4m.e eVar) {
        return new tm0(pm0Var, eVar);
    }

    public static cp0 a(pm0 pm0Var, mp0 mp0Var) {
        cp0 cp0VarA = pm0Var.a(mp0Var);
        vc.s.k(cp0VarA);
        return cp0VarA;
    }
}
