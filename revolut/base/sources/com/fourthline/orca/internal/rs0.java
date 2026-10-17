package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rs0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f32822a;

    private rs0(ms0 ms0Var) {
        this.f32822a = ms0Var;
    }

    public static xr0 b(ms0 ms0Var) {
        xr0 xr0VarA = ms0Var.a();
        vc.s.k(xr0VarA);
        return xr0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xr0 get() {
        return b(this.f32822a);
    }

    public static rs0 a(ms0 ms0Var) {
        return new rs0(ms0Var);
    }
}
