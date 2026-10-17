package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f30344a;

    private kn0(hn0 hn0Var) {
        this.f30344a = hn0Var;
    }

    public static an0 b(hn0 hn0Var) {
        an0 an0VarA = hn0Var.a();
        vc.s.k(an0VarA);
        return an0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public an0 get() {
        return b(this.f30344a);
    }

    public static kn0 a(hn0 hn0Var) {
        return new kn0(hn0Var);
    }
}
