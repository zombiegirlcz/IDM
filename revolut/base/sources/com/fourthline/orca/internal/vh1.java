package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class vh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f34362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34363b;

    private vh1(oh1 oh1Var, e4m.e eVar) {
        this.f34362a = oh1Var;
        this.f34363b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f34362a, (gf1) this.f34363b.get());
    }

    public static vh1 a(oh1 oh1Var, e4m.e eVar) {
        return new vh1(oh1Var, eVar);
    }

    public static Function0 a(oh1 oh1Var, gf1 gf1Var) {
        Function0 function0B = oh1Var.b(gf1Var);
        vc.s.k(function0B);
        return function0B;
    }
}
