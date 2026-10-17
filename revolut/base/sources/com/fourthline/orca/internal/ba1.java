package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ba1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f27065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27066b;

    private ba1(r91 r91Var, e4m.e eVar) {
        this.f27065a = r91Var;
        this.f27066b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tm get() {
        return a(this.f27065a, (v10) this.f27066b.get());
    }

    public static ba1 a(r91 r91Var, e4m.e eVar) {
        return new ba1(r91Var, eVar);
    }

    public static tm a(r91 r91Var, v10 v10Var) {
        tm tmVarA = r91Var.a(v10Var);
        vc.s.k(tmVarA);
        return tmVarA;
    }
}
