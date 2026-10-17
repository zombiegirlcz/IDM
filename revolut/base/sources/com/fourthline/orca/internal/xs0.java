package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class xs0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f35083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35085c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private xs0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f35083a = ms0Var;
        this.f35084b = eVar;
        this.f35085c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f35083a, (vw0) this.f35084b.get(), (ww0) this.f35085c.get(), (fq0) this.d.get(), (uw) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static xs0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new xs0(ms0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static kw a(ms0 ms0Var, vw0 vw0Var, ww0 ww0Var, fq0 fq0Var, uw uwVar, CoroutineScope coroutineScope) {
        kw kwVarA = ms0Var.a(vw0Var, ww0Var, fq0Var, uwVar, coroutineScope);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
