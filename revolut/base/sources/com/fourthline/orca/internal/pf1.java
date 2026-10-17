package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class pf1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f31953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31955c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f31956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f31957h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f31958j;

    private pf1(hf1 hf1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        this.f31953a = hf1Var;
        this.f31954b = eVar;
        this.f31955c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f31956g = eVar6;
        this.f31957h = eVar7;
        this.i = eVar8;
        this.f31958j = eVar9;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dg1 get() {
        return a(this.f31953a, (zf1) this.f31954b.get(), (r70) this.f31955c.get(), (ij0) this.d.get(), (cg1) this.e.get(), (fg1) this.f.get(), (aq0) this.f31956g.get(), (tf1) this.f31957h.get(), (ff1) this.i.get(), (CoroutineScope) this.f31958j.get());
    }

    public static pf1 a(hf1 hf1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        return new pf1(hf1Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static dg1 a(hf1 hf1Var, zf1 zf1Var, r70 r70Var, ij0 ij0Var, cg1 cg1Var, fg1 fg1Var, aq0 aq0Var, tf1 tf1Var, ff1 ff1Var, CoroutineScope coroutineScope) {
        dg1 dg1VarA = hf1Var.a(zf1Var, r70Var, ij0Var, cg1Var, fg1Var, aq0Var, tf1Var, ff1Var, coroutineScope);
        vc.s.k(dg1VarA);
        return dg1VarA;
    }
}
