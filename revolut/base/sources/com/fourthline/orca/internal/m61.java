package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l61 f31015a;

    private m61(l61 l61Var) {
        this.f31015a = l61Var;
    }

    public static bw0 b(l61 l61Var) {
        bw0 bw0VarA = l61Var.a();
        vc.s.k(bw0VarA);
        return bw0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bw0 get() {
        return b(this.f31015a);
    }

    public static m61 a(l61 l61Var) {
        return new m61(l61Var);
    }
}
