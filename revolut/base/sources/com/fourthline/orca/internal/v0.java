package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f34227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34228b;

    private v0(p0 p0Var, e4m.e eVar) {
        this.f34227a = p0Var;
        this.f34228b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return a(this.f34227a, (r70) this.f34228b.get());
    }

    public static v0 a(p0 p0Var, e4m.e eVar) {
        return new v0(p0Var, eVar);
    }

    public static m0 a(p0 p0Var, r70 r70Var) {
        m0 m0VarA = p0Var.a(r70Var);
        vc.s.k(m0VarA);
        return m0VarA;
    }
}
