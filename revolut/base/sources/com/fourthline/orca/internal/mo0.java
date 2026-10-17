package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mo0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f31236a;

    private mo0(ho0 ho0Var) {
        this.f31236a = ho0Var;
    }

    public static hm0 b(ho0 ho0Var) {
        hm0 hm0VarB = ho0Var.b();
        vc.s.k(hm0VarB);
        return hm0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hm0 get() {
        return b(this.f31236a);
    }

    public static mo0 a(ho0 ho0Var) {
        return new mo0(ho0Var);
    }
}
