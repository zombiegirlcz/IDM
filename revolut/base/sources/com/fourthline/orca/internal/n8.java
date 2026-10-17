package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f31347a;

    private n8(m8 m8Var) {
        this.f31347a = m8Var;
    }

    public static z b(m8 m8Var) {
        z zVarA = m8Var.a();
        vc.s.k(zVarA);
        return zVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z get() {
        return b(this.f31347a);
    }

    public static n8 a(m8 m8Var) {
        return new n8(m8Var);
    }
}
