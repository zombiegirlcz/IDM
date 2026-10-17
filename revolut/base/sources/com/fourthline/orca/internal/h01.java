package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class h01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f01 f29086a;

    private h01(f01 f01Var) {
        this.f29086a = f01Var;
    }

    public static zq0 b(f01 f01Var) {
        zq0 zq0VarB = f01Var.b();
        vc.s.k(zq0VarB);
        return zq0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zq0 get() {
        return b(this.f29086a);
    }

    public static h01 a(f01 f01Var) {
        return new h01(f01Var);
    }
}
