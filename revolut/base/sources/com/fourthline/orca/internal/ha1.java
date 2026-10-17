package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ha1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f29201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29202b;

    private ha1(r91 r91Var, e4m.e eVar) {
        this.f29201a = r91Var;
        this.f29202b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f31 get() {
        return a(this.f29201a, (vc1) this.f29202b.get());
    }

    public static ha1 a(r91 r91Var, e4m.e eVar) {
        return new ha1(r91Var, eVar);
    }

    public static f31 a(r91 r91Var, vc1 vc1Var) {
        f31 f31VarA = r91Var.a(vc1Var);
        vc.s.k(f31VarA);
        return f31VarA;
    }
}
