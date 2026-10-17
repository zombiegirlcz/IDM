package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class dk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f27800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27802c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f27804h;

    private dk(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f27800a = rjVar;
        this.f27801b = eVar;
        this.f27802c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27803g = eVar6;
        this.f27804h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public al get() {
        return a(this.f27800a, (Function0) this.f27801b.get(), (gj) this.f27802c.get(), (yj0) this.d.get(), (m81) this.e.get(), (vc1) this.f.get(), (vc1) this.f27803g.get(), (vc1) this.f27804h.get());
    }

    public static dk a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new dk(rjVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static al a(rj rjVar, Function0 function0, gj gjVar, yj0 yj0Var, m81 m81Var, vc1 vc1Var, vc1 vc1Var2, vc1 vc1Var3) {
        al alVarA = rjVar.a(function0, gjVar, yj0Var, m81Var, vc1Var, vc1Var2, vc1Var3);
        vc.s.k(alVarA);
        return alVarA;
    }
}
