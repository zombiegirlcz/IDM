package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ln0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f30683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30685c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f30686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f30687h;
    private final e4m.e i;

    private ln0(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        this.f30683a = hn0Var;
        this.f30684b = eVar;
        this.f30685c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f30686g = eVar6;
        this.f30687h = eVar7;
        this.i = eVar8;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public go0 get() {
        return a(this.f30683a, (fo0) this.f30684b.get(), (fm0) this.f30685c.get(), (bn0) this.d.get(), (wd1) this.e.get(), (co0) this.f.get(), (do0) this.f30686g.get(), (aq0) this.f30687h.get(), (CoroutineScope) this.i.get());
    }

    public static ln0 a(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        return new ln0(hn0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static go0 a(hn0 hn0Var, fo0 fo0Var, fm0 fm0Var, bn0 bn0Var, wd1 wd1Var, co0 co0Var, do0 do0Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        go0 go0VarA = hn0Var.a(fo0Var, fm0Var, bn0Var, wd1Var, co0Var, do0Var, aq0Var, coroutineScope);
        vc.s.k(go0VarA);
        return go0VarA;
    }
}
