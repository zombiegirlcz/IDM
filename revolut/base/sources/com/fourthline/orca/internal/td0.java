package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class td0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f33750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33752c;

    private td0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2) {
        this.f33750a = pd0Var;
        this.f33751b = eVar;
        this.f33752c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ie0 get() {
        return a(this.f33750a, (Function0) this.f33751b.get(), (lz) this.f33752c.get());
    }

    public static td0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2) {
        return new td0(pd0Var, eVar, eVar2);
    }

    public static ie0 a(pd0 pd0Var, Function0 function0, lz lzVar) {
        ie0 ie0VarA = pd0Var.a(function0, lzVar);
        vc.s.k(ie0VarA);
        return ie0VarA;
    }
}
