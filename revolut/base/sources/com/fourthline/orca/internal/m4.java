package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f30978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30979b;

    private m4(e4 e4Var, e4m.e eVar) {
        this.f30978a = e4Var;
        this.f30979b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j30 get() {
        return a(this.f30978a, (sg0) this.f30979b.get());
    }

    public static m4 a(e4 e4Var, e4m.e eVar) {
        return new m4(e4Var, eVar);
    }

    public static j30 a(e4 e4Var, sg0 sg0Var) {
        j30 j30VarB = e4Var.b(sg0Var);
        vc.s.k(j30VarB);
        return j30VarB;
    }
}
