package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class tp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f33819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33821c;
    private final e4m.e d;

    private tp(hp hpVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f33819a = hpVar;
        this.f33820b = eVar;
        this.f33821c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public iq get() {
        return a(this.f33819a, (Function0) this.f33820b.get(), (zc0) this.f33821c.get(), (gj) this.d.get());
    }

    public static tp a(hp hpVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new tp(hpVar, eVar, eVar2, eVar3);
    }

    public static iq a(hp hpVar, Function0 function0, zc0 zc0Var, gj gjVar) {
        iq iqVarA = hpVar.a(function0, zc0Var, gjVar);
        vc.s.k(iqVarA);
        return iqVarA;
    }
}
