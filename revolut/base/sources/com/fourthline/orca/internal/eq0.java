package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class eq0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq0 f28225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28227c;
    private final e4m.e d;

    private eq0(dq0 dq0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f28225a = dq0Var;
        this.f28226b = eVar;
        this.f28227c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bq0 get() {
        return a(this.f28225a, (fq0) this.f28226b.get(), (tp0) this.f28227c.get(), (CoroutineScope) this.d.get());
    }

    public static eq0 a(dq0 dq0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new eq0(dq0Var, eVar, eVar2, eVar3);
    }

    public static bq0 a(dq0 dq0Var, fq0 fq0Var, tp0 tp0Var, CoroutineScope coroutineScope) {
        bq0 bq0VarA = dq0Var.a(fq0Var, tp0Var, coroutineScope);
        vc.s.k(bq0VarA);
        return bq0VarA;
    }
}
