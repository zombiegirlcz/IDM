package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ea1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f28096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28097b;

    private ea1(r91 r91Var, e4m.e eVar) {
        this.f28096a = r91Var;
        this.f28097b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public no get() {
        return a(this.f28096a, (v10) this.f28097b.get());
    }

    public static ea1 a(r91 r91Var, e4m.e eVar) {
        return new ea1(r91Var, eVar);
    }

    public static no a(r91 r91Var, v10 v10Var) {
        no noVarB = r91Var.b(v10Var);
        vc.s.k(noVarB);
        return noVarB;
    }
}
