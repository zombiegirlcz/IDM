package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f29215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29217c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f29218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f29219h;
    private final e4m.e i;

    private hc(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        this.f29215a = ecVar;
        this.f29216b = eVar;
        this.f29217c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f29218g = eVar6;
        this.f29219h = eVar7;
        this.i = eVar8;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yb get() {
        return a(this.f29215a, (gb) this.f29216b.get(), (oc) this.f29217c.get(), (rx) this.d.get(), (dc) this.e.get(), (wd1) this.f.get(), (hb) this.f29218g.get(), (aq0) this.f29219h.get(), (CoroutineScope) this.i.get());
    }

    public static hc a(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        return new hc(ecVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static yb a(ec ecVar, gb gbVar, oc ocVar, rx rxVar, dc dcVar, wd1 wd1Var, hb hbVar, aq0 aq0Var, CoroutineScope coroutineScope) {
        yb ybVarA = ecVar.a(gbVar, ocVar, rxVar, dcVar, wd1Var, hbVar, aq0Var, coroutineScope);
        vc.s.k(ybVarA);
        return ybVarA;
    }
}
