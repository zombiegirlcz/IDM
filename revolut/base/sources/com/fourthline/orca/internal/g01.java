package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class g01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f01 f28707a;

    private g01(f01 f01Var) {
        this.f28707a = f01Var;
    }

    public static r70 b(f01 f01Var) {
        r70 r70VarA = f01Var.a();
        vc.s.k(r70VarA);
        return r70VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r70 get() {
        return b(this.f28707a);
    }

    public static g01 a(f01 f01Var) {
        return new g01(f01Var);
    }
}
