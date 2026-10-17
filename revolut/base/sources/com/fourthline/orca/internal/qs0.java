package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class qs0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f32527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32529c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private qs0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f32527a = ms0Var;
        this.f32528b = eVar;
        this.f32529c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f32527a, (xr0) this.f32528b.get(), (yr0) this.f32529c.get(), (fq0) this.d.get(), (uw) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static qs0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new qs0(ms0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static kw a(ms0 ms0Var, xr0 xr0Var, yr0 yr0Var, fq0 fq0Var, uw uwVar, CoroutineScope coroutineScope) {
        kw kwVarA = ms0Var.a(xr0Var, yr0Var, fq0Var, uwVar, coroutineScope);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
