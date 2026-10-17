package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class p8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f31879a;

    private p8(m8 m8Var) {
        this.f31879a = m8Var;
    }

    public static eb b(m8 m8Var) {
        eb ebVarC = m8Var.c();
        vc.s.k(ebVarC);
        return ebVarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public eb get() {
        return b(this.f31879a);
    }

    public static p8 a(m8 m8Var) {
        return new p8(m8Var);
    }
}
