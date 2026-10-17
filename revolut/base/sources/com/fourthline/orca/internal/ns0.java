package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ns0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f31473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31475c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private ns0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f31473a = ms0Var;
        this.f31474b = eVar;
        this.f31475c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f31473a, (ww) this.f31474b.get(), (f21) this.f31475c.get(), (fq0) this.d.get(), (uw) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static ns0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new ns0(ms0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static kw a(ms0 ms0Var, ww wwVar, f21 f21Var, fq0 fq0Var, uw uwVar, CoroutineScope coroutineScope) {
        kw kwVarA = ms0Var.a(wwVar, f21Var, fq0Var, uwVar, coroutineScope);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
