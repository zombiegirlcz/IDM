package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class rk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f32759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32760b;

    private rk(rj rjVar, e4m.e eVar) {
        this.f32759a = rjVar;
        this.f32760b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f32759a, (gj) this.f32760b.get());
    }

    public static rk a(rj rjVar, e4m.e eVar) {
        return new rk(rjVar, eVar);
    }

    public static Function0 a(rj rjVar, gj gjVar) {
        Function0 function0B = rjVar.b(gjVar);
        vc.s.k(function0B);
        return function0B;
    }
}
