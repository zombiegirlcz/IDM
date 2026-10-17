package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class h60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f29153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29154b;

    private h60(g60 g60Var, e4m.e eVar) {
        this.f29153a = g60Var;
        this.f29154b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wr get() {
        return a(this.f29153a, (CoroutineScope) this.f29154b.get());
    }

    public static h60 a(g60 g60Var, e4m.e eVar) {
        return new h60(g60Var, eVar);
    }

    public static wr a(g60 g60Var, CoroutineScope coroutineScope) {
        wr wrVarA = g60Var.a(coroutineScope);
        vc.s.k(wrVarA);
        return wrVarA;
    }
}
