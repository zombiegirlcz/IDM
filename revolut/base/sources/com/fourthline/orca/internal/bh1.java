package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class bh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zg1 f27131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27132b;

    private bh1(zg1 zg1Var, e4m.e eVar) {
        this.f27131a = zg1Var;
        this.f27132b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f27131a, (gf1) this.f27132b.get());
    }

    public static bh1 a(zg1 zg1Var, e4m.e eVar) {
        return new bh1(zg1Var, eVar);
    }

    public static Function0 a(zg1 zg1Var, gf1 gf1Var) {
        Function0 function0C = zg1Var.c(gf1Var);
        vc.s.k(function0C);
        return function0C;
    }
}
