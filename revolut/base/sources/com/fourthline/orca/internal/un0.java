package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class un0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f34134a;

    private un0(hn0 hn0Var) {
        this.f34134a = hn0Var;
    }

    public static mp0 b(hn0 hn0Var) {
        mp0 mp0VarB = hn0Var.b();
        vc.s.k(mp0VarB);
        return mp0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mp0 get() {
        return b(this.f34134a);
    }

    public static un0 a(hn0 hn0Var) {
        return new un0(hn0Var);
    }
}
