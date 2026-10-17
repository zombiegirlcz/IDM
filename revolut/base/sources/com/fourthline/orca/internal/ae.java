package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class ae implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f26771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26772b;

    private ae(xd xdVar, e4m.e eVar) {
        this.f26771a = xdVar;
        this.f26772b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f26771a, (r70) this.f26772b.get());
    }

    public static ae a(xd xdVar, e4m.e eVar) {
        return new ae(xdVar, eVar);
    }

    public static Function0 a(xd xdVar, r70 r70Var) {
        Function0 function0A = xdVar.a(r70Var);
        vc.s.k(function0A);
        return function0A;
    }
}
