package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s91 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f32955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32956b;

    private s91(r91 r91Var, e4m.e eVar) {
        this.f32955a = r91Var;
        this.f32956b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o81 get() {
        return a(this.f32955a, (r70) this.f32956b.get());
    }

    public static s91 a(r91 r91Var, e4m.e eVar) {
        return new s91(r91Var, eVar);
    }

    public static o81 a(r91 r91Var, r70 r70Var) {
        o81 o81VarA = r91Var.a(r70Var);
        vc.s.k(o81VarA);
        return o81VarA;
    }
}
