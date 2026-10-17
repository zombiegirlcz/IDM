package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lo0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f30717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30718b;

    private lo0(ho0 ho0Var, e4m.e eVar) {
        this.f30717a = ho0Var;
        this.f30718b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wo get() {
        return a(this.f30717a, (gj) this.f30718b.get());
    }

    public static lo0 a(ho0 ho0Var, e4m.e eVar) {
        return new lo0(ho0Var, eVar);
    }

    public static wo a(ho0 ho0Var, gj gjVar) {
        wo woVarA = ho0Var.a(gjVar);
        vc.s.k(woVarA);
        return woVarA;
    }
}
