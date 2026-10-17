package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f32493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32494b;

    private qn0(hn0 hn0Var, e4m.e eVar) {
        this.f32493a = hn0Var;
        this.f32494b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public co0 get() {
        return a(this.f32493a, (mp0) this.f32494b.get());
    }

    public static qn0 a(hn0 hn0Var, e4m.e eVar) {
        return new qn0(hn0Var, eVar);
    }

    public static co0 a(hn0 hn0Var, mp0 mp0Var) {
        co0 co0VarA = hn0Var.a(mp0Var);
        vc.s.k(co0VarA);
        return co0VarA;
    }
}
