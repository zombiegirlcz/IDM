package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class o8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f31605a;

    private o8(m8 m8Var) {
        this.f31605a = m8Var;
    }

    public static d3 b(m8 m8Var) {
        d3 d3VarB = m8Var.b();
        vc.s.k(d3VarB);
        return d3VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d3 get() {
        return b(this.f31605a);
    }

    public static o8 a(m8 m8Var) {
        return new o8(m8Var);
    }
}
