package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class i01 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f01 f29462a;

    private i01(f01 f01Var) {
        this.f29462a = f01Var;
    }

    public static sy b(f01 f01Var) {
        sy syVarC = f01Var.c();
        vc.s.k(syVarC);
        return syVarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sy get() {
        return b(this.f29462a);
    }

    public static i01 a(f01 f01Var) {
        return new i01(f01Var);
    }
}
