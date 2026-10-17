package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f34269a;

    private v8(m8 m8Var) {
        this.f34269a = m8Var;
    }

    public static yz0 b(m8 m8Var) {
        yz0 yz0VarG = m8Var.g();
        vc.s.k(yz0VarG);
        return yz0VarG;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz0 get() {
        return b(this.f34269a);
    }

    public static v8 a(m8 m8Var) {
        return new v8(m8Var);
    }
}
