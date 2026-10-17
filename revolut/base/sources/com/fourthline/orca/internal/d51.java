package com.fourthline.orca.internal;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes23.dex */
public final class d51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f27648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27650c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f27652h;
    private final e4m.e i;

    private d51(v41 v41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        this.f27648a = v41Var;
        this.f27649b = eVar;
        this.f27650c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27651g = eVar6;
        this.f27652h = eVar7;
        this.i = eVar8;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u41 get() {
        return a(this.f27648a, (wf) this.f27649b.get(), (fl) this.f27650c.get(), (t1) this.d.get(), (i1) this.e.get(), (ah) this.f.get(), (aq0) this.f27651g.get(), (Optional) this.f27652h.get(), (sg0) this.i.get());
    }

    public static d51 a(v41 v41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        return new d51(v41Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static u41 a(v41 v41Var, wf wfVar, fl flVar, t1 t1Var, i1 i1Var, ah ahVar, aq0 aq0Var, Optional optional, sg0 sg0Var) {
        u41 u41VarA = v41Var.a(wfVar, flVar, t1Var, i1Var, ahVar, aq0Var, optional, sg0Var);
        vc.s.k(u41VarA);
        return u41VarA;
    }
}
