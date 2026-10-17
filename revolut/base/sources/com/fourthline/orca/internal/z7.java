package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class z7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7 f35535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35537c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private z7(y7 y7Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f35535a = y7Var;
        this.f35536b = eVar;
        this.f35537c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f35535a, (ww) this.f35536b.get(), (fq0) this.f35537c.get(), (yw) this.d.get(), (uw) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static z7 a(y7 y7Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new z7(y7Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static kw a(y7 y7Var, ww wwVar, fq0 fq0Var, yw ywVar, uw uwVar, CoroutineScope coroutineScope) {
        kw kwVarA = y7Var.a(wwVar, fq0Var, ywVar, uwVar, coroutineScope);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
