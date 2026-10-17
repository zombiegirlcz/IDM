package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class x8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f34917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34918b;

    private x8(m8 m8Var, e4m.e eVar) {
        this.f34917a = m8Var;
        this.f34918b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r01 get() {
        return a(this.f34917a, (b01) this.f34918b.get());
    }

    public static x8 a(m8 m8Var, e4m.e eVar) {
        return new x8(m8Var, eVar);
    }

    public static r01 a(m8 m8Var, b01 b01Var) {
        r01 r01VarA = m8Var.a(b01Var);
        vc.s.k(r01VarA);
        return r01VarA;
    }
}
