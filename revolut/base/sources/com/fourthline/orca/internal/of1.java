package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class of1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f31660a;

    private of1(hf1 hf1Var) {
        this.f31660a = hf1Var;
    }

    public static cg1 b(hf1 hf1Var) {
        cg1 cg1VarA = hf1Var.a();
        vc.s.k(cg1VarA);
        return cg1VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg1 get() {
        return b(this.f31660a);
    }

    public static of1 a(hf1 hf1Var) {
        return new of1(hf1Var);
    }
}
