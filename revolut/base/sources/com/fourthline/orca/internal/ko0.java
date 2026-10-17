package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ko0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f30349a;

    private ko0(ho0 ho0Var) {
        this.f30349a = ho0Var;
    }

    public static uo b(ho0 ho0Var) {
        uo uoVarA = ho0Var.a();
        vc.s.k(uoVarA);
        return uoVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uo get() {
        return b(this.f30349a);
    }

    public static ko0 a(ho0 ho0Var) {
        return new ko0(ho0Var);
    }
}
