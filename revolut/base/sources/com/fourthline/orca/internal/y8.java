package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f35190a;

    private y8(m8 m8Var) {
        this.f35190a = m8Var;
    }

    public static m81 b(m8 m8Var) {
        m81 m81VarI = m8Var.i();
        vc.s.k(m81VarI);
        return m81VarI;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m81 get() {
        return b(this.f35190a);
    }

    public static y8 a(m8 m8Var) {
        return new y8(m8Var);
    }
}
