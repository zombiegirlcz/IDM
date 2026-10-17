package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f32393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32394b;

    private qd0(pd0 pd0Var, e4m.e eVar) {
        this.f32393a = pd0Var;
        this.f32394b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public md0 get() {
        return a(this.f32393a, (r70) this.f32394b.get());
    }

    public static qd0 a(pd0 pd0Var, e4m.e eVar) {
        return new qd0(pd0Var, eVar);
    }

    public static md0 a(pd0 pd0Var, r70 r70Var) {
        md0 md0VarA = pd0Var.a(r70Var);
        vc.s.k(md0VarA);
        return md0VarA;
    }
}
