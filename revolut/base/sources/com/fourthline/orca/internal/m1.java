package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f30918a;

    private m1(l1 l1Var) {
        this.f30918a = l1Var;
    }

    public static jx b(l1 l1Var) {
        jx jxVarA = l1Var.a();
        vc.s.k(jxVarA);
        return jxVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jx get() {
        return b(this.f30918a);
    }

    public static m1 a(l1 l1Var) {
        return new m1(l1Var);
    }
}
