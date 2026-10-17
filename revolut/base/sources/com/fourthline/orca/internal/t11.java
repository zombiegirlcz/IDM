package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class t11 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s11 f33178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33179b;

    private t11(s11 s11Var, e4m.e eVar) {
        this.f33178a = s11Var;
        this.f33179b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n31 get() {
        return a(this.f33178a, (o80) this.f33179b.get());
    }

    public static t11 a(s11 s11Var, e4m.e eVar) {
        return new t11(s11Var, eVar);
    }

    public static n31 a(s11 s11Var, o80 o80Var) {
        n31 n31VarA = s11Var.a(o80Var);
        vc.s.k(n31VarA);
        return n31VarA;
    }
}
