package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class ug1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tg1 f34089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34090b;

    private ug1(tg1 tg1Var, e4m.e eVar) {
        this.f34089a = tg1Var;
        this.f34090b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f34089a, (r70) this.f34090b.get());
    }

    public static ug1 a(tg1 tg1Var, e4m.e eVar) {
        return new ug1(tg1Var, eVar);
    }

    public static Function0 a(tg1 tg1Var, r70 r70Var) {
        Function0 function0A = tg1Var.a(r70Var);
        vc.s.k(function0A);
        return function0A;
    }
}
