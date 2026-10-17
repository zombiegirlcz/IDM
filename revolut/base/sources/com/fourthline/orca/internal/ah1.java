package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class ah1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zg1 f26802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26803b;

    private ah1(zg1 zg1Var, e4m.e eVar) {
        this.f26802a = zg1Var;
        this.f26803b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f26802a, (gf1) this.f26803b.get());
    }

    public static ah1 a(zg1 zg1Var, e4m.e eVar) {
        return new ah1(zg1Var, eVar);
    }

    public static Function0 a(zg1 zg1Var, gf1 gf1Var) {
        Function0 function0A = zg1Var.a(gf1Var);
        vc.s.k(function0A);
        return function0A;
    }
}
