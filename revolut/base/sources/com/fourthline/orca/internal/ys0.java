package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ys0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f35430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35431b;

    private ys0(ms0 ms0Var, e4m.e eVar) {
        this.f35430a = ms0Var;
        this.f35431b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vw0 get() {
        return a(this.f35430a, (fh0) this.f35431b.get());
    }

    public static ys0 a(ms0 ms0Var, e4m.e eVar) {
        return new ys0(ms0Var, eVar);
    }

    public static vw0 a(ms0 ms0Var, fh0 fh0Var) {
        vw0 vw0VarB = ms0Var.b(fh0Var);
        vc.s.k(vw0VarB);
        return vw0VarB;
    }
}
