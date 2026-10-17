package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zs0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f35706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35707b;

    private zs0(ms0 ms0Var, e4m.e eVar) {
        this.f35706a = ms0Var;
        this.f35707b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ww0 get() {
        return a(this.f35706a, (v10) this.f35707b.get());
    }

    public static zs0 a(ms0 ms0Var, e4m.e eVar) {
        return new zs0(ms0Var, eVar);
    }

    public static ww0 a(ms0 ms0Var, v10 v10Var) {
        ww0 ww0VarD = ms0Var.d(v10Var);
        vc.s.k(ww0VarD);
        return ww0VarD;
    }
}
