package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class po0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f32011a;

    private po0(ho0 ho0Var) {
        this.f32011a = ho0Var;
    }

    public static im0 b(ho0 ho0Var) {
        im0 im0VarC = ho0Var.c();
        vc.s.k(im0VarC);
        return im0VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public im0 get() {
        return b(this.f32011a);
    }

    public static po0 a(ho0 ho0Var) {
        return new po0(ho0Var);
    }
}
