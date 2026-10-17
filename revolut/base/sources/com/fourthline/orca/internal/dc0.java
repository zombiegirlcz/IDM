package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class dc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f27700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27701b;

    private dc0(zb0 zb0Var, e4m.e eVar) {
        this.f27700a = zb0Var;
        this.f27701b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qc0 get() {
        return a(this.f27700a, (sg0) this.f27701b.get());
    }

    public static dc0 a(zb0 zb0Var, e4m.e eVar) {
        return new dc0(zb0Var, eVar);
    }

    public static qc0 a(zb0 zb0Var, sg0 sg0Var) {
        qc0 qc0VarA = zb0Var.a(sg0Var);
        vc.s.k(qc0VarA);
        return qc0VarA;
    }
}
