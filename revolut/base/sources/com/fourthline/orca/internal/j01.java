package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class j01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f01 f29777a;

    private j01(f01 f01Var) {
        this.f29777a = f01Var;
    }

    public static q11 b(f01 f01Var) {
        q11 q11VarD = f01Var.d();
        vc.s.k(q11VarD);
        return q11VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q11 get() {
        return b(this.f29777a);
    }

    public static j01 a(f01 f01Var) {
        return new j01(f01Var);
    }
}
