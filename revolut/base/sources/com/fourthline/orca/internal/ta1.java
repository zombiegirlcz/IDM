package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ta1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f33268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33269b;

    private ta1(r91 r91Var, e4m.e eVar) {
        this.f33268a = r91Var;
        this.f33269b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j30 get() {
        return a(this.f33268a, (sg0) this.f33269b.get());
    }

    public static ta1 a(r91 r91Var, e4m.e eVar) {
        return new ta1(r91Var, eVar);
    }

    public static j30 a(r91 r91Var, sg0 sg0Var) {
        j30 j30VarB = r91Var.b(sg0Var);
        vc.s.k(j30VarB);
        return j30VarB;
    }
}
