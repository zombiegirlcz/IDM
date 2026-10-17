package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f32933a;

    private s8(m8 m8Var) {
        this.f32933a = m8Var;
    }

    public static bs b(m8 m8Var) {
        bs bsVarE = m8Var.e();
        vc.s.k(bsVarE);
        return bsVarE;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bs get() {
        return b(this.f32933a);
    }

    public static s8 a(m8 m8Var) {
        return new s8(m8Var);
    }
}
