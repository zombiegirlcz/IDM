package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f34544a;

    private w8(m8 m8Var) {
        this.f34544a = m8Var;
    }

    public static b01 b(m8 m8Var) {
        b01 b01VarH = m8Var.h();
        vc.s.k(b01VarH);
        return b01VarH;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b01 get() {
        return b(this.f34544a);
    }

    public static w8 a(m8 m8Var) {
        return new w8(m8Var);
    }
}
