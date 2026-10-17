package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class q50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l50 f32203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32204b;

    private q50(l50 l50Var, e4m.e eVar) {
        this.f32203a = l50Var;
        this.f32204b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f32203a, (eh0) this.f32204b.get());
    }

    public static q50 a(l50 l50Var, e4m.e eVar) {
        return new q50(l50Var, eVar);
    }

    public static Function0 a(l50 l50Var, eh0 eh0Var) {
        Function0 function0A = l50Var.a(eh0Var);
        vc.s.k(function0A);
        return function0A;
    }
}
