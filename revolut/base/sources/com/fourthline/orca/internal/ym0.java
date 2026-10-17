package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ym0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f35387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35389c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f35390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f35391h;

    private ym0(pm0 pm0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f35387a = pm0Var;
        this.f35388b = eVar;
        this.f35389c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f35390g = eVar6;
        this.f35391h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ob1 get() {
        return a(this.f35387a, (bn0) this.f35388b.get(), (ep0) this.f35389c.get(), (lb1) this.d.get(), (aq0) this.e.get(), (qp0) this.f.get(), (sg0) this.f35390g.get(), (CoroutineScope) this.f35391h.get());
    }

    public static ym0 a(pm0 pm0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new ym0(pm0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static ob1 a(pm0 pm0Var, bn0 bn0Var, ep0 ep0Var, lb1 lb1Var, aq0 aq0Var, qp0 qp0Var, sg0 sg0Var, CoroutineScope coroutineScope) {
        ob1 ob1VarA = pm0Var.a(bn0Var, ep0Var, lb1Var, aq0Var, qp0Var, sg0Var, coroutineScope);
        vc.s.k(ob1VarA);
        return ob1VarA;
    }
}
