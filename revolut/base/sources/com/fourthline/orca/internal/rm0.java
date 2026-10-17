package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class rm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f32775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32777c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f32778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f32779h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f32780j;

    private rm0(pm0 pm0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        this.f32775a = pm0Var;
        this.f32776b = eVar;
        this.f32777c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f32778g = eVar6;
        this.f32779h = eVar7;
        this.i = eVar8;
        this.f32780j = eVar9;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fp0 get() {
        return a(this.f32775a, (ob1) this.f32776b.get(), (bn0) this.f32777c.get(), (g8) this.d.get(), (qx) this.e.get(), (cp0) this.f.get(), (vo0) this.f32778g.get(), (aq0) this.f32779h.get(), (ox) this.i.get(), (CoroutineScope) this.f32780j.get());
    }

    public static rm0 a(pm0 pm0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        return new rm0(pm0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static fp0 a(pm0 pm0Var, ob1 ob1Var, bn0 bn0Var, g8 g8Var, qx qxVar, cp0 cp0Var, vo0 vo0Var, aq0 aq0Var, ox oxVar, CoroutineScope coroutineScope) {
        fp0 fp0VarA = pm0Var.a(ob1Var, bn0Var, g8Var, qxVar, cp0Var, vo0Var, aq0Var, oxVar, coroutineScope);
        vc.s.k(fp0VarA);
        return fp0VarA;
    }
}
