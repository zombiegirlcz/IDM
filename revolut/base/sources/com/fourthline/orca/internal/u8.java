package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class u8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f33974a;

    private u8(m8 m8Var) {
        this.f33974a = m8Var;
    }

    public static yj0 b(m8 m8Var) {
        yj0 yj0VarF = m8Var.f();
        vc.s.k(yj0VarF);
        return yj0VarF;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yj0 get() {
        return b(this.f33974a);
    }

    public static u8 a(m8 m8Var) {
        return new u8(m8Var);
    }
}
