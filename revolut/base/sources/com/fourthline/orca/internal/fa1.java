package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f28406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28407b;

    private fa1(r91 r91Var, e4m.e eVar) {
        this.f28406a = r91Var;
        this.f28407b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b31 get() {
        return a(this.f28406a, (gj) this.f28407b.get());
    }

    public static fa1 a(r91 r91Var, e4m.e eVar) {
        return new fa1(r91Var, eVar);
    }

    public static b31 a(r91 r91Var, gj gjVar) {
        b31 b31VarD = r91Var.d(gjVar);
        vc.s.k(b31VarD);
        return b31VarD;
    }
}
