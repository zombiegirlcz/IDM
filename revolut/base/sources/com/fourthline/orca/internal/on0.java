package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class on0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f31699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31700b;

    private on0(hn0 hn0Var, e4m.e eVar) {
        this.f31699a = hn0Var;
        this.f31700b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gn0 get() {
        return a(this.f31699a, (l70) this.f31700b.get());
    }

    public static on0 a(hn0 hn0Var, e4m.e eVar) {
        return new on0(hn0Var, eVar);
    }

    public static gn0 a(hn0 hn0Var, l70 l70Var) {
        gn0 gn0VarA = hn0Var.a(l70Var);
        vc.s.k(gn0VarA);
        return gn0VarA;
    }
}
