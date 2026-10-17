package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class da1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f27684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27686c;

    private da1(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        this.f27684a = r91Var;
        this.f27685b = eVar;
        this.f27686c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ya1 get() {
        return a(this.f27684a, (r70) this.f27685b.get(), (f31) this.f27686c.get());
    }

    public static da1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        return new da1(r91Var, eVar, eVar2);
    }

    public static ya1 a(r91 r91Var, r70 r70Var, f31 f31Var) {
        ya1 ya1VarA = r91Var.a(r70Var, f31Var);
        vc.s.k(ya1VarA);
        return ya1VarA;
    }
}
