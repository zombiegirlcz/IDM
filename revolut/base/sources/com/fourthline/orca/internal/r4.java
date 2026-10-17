package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class r4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f32626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32627b;

    private r4(e4 e4Var, e4m.e eVar) {
        this.f32626a = e4Var;
        this.f32627b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s6 get() {
        return a(this.f32626a, (l70) this.f32627b.get());
    }

    public static r4 a(e4 e4Var, e4m.e eVar) {
        return new r4(e4Var, eVar);
    }

    public static s6 a(e4 e4Var, l70 l70Var) {
        s6 s6VarB = e4Var.b(l70Var);
        vc.s.k(s6VarB);
        return s6VarB;
    }
}
