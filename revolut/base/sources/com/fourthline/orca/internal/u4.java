package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class u4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f33948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33950c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private u4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f33948a = e4Var;
        this.f33949b = eVar;
        this.f33950c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x6 get() {
        return a(this.f33948a, (Function0) this.f33949b.get(), (g6) this.f33950c.get(), (d3) this.d.get(), (aq0) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static u4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new u4(e4Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static x6 a(e4 e4Var, Function0 function0, g6 g6Var, d3 d3Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        x6 x6VarA = e4Var.a(function0, g6Var, d3Var, aq0Var, coroutineScope);
        vc.s.k(x6VarA);
        return x6VarA;
    }
}
