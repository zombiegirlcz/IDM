package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class n4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f31323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31325c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private n4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f31323a = e4Var;
        this.f31324b = eVar;
        this.f31325c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m5 get() {
        return a(this.f31323a, (Function0) this.f31324b.get(), (d3) this.f31325c.get(), (g6) this.d.get(), (aq0) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static n4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new n4(e4Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static m5 a(e4 e4Var, Function0 function0, d3 d3Var, g6 g6Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        m5 m5VarA = e4Var.a(function0, d3Var, g6Var, aq0Var, coroutineScope);
        vc.s.k(m5VarA);
        return m5VarA;
    }
}
