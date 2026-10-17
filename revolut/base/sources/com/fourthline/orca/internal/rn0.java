package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f32783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32784b;

    private rn0(hn0 hn0Var, e4m.e eVar) {
        this.f32783a = hn0Var;
        this.f32784b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public do0 get() {
        return a(this.f32783a, (gj) this.f32784b.get());
    }

    public static rn0 a(hn0 hn0Var, e4m.e eVar) {
        return new rn0(hn0Var, eVar);
    }

    public static do0 a(hn0 hn0Var, gj gjVar) {
        do0 do0VarA = hn0Var.a(gjVar);
        vc.s.k(do0VarA);
        return do0VarA;
    }
}
