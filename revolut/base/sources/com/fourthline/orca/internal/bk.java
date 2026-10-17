package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class bk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f27143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27145c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f27147h;

    private bk(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f27143a = rjVar;
        this.f27144b = eVar;
        this.f27145c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27146g = eVar6;
        this.f27147h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fj get() {
        return a(this.f27143a, (o80) this.f27144b.get(), (Function0) this.f27145c.get(), (zc0) this.d.get(), (sj0) this.e.get(), (aq0) this.f.get(), (c80) this.f27146g.get(), (gj) this.f27147h.get());
    }

    public static bk a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new bk(rjVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static fj a(rj rjVar, o80 o80Var, Function0 function0, zc0 zc0Var, sj0 sj0Var, aq0 aq0Var, c80 c80Var, gj gjVar) {
        fj fjVarA = rjVar.a(o80Var, function0, zc0Var, sj0Var, aq0Var, c80Var, gjVar);
        vc.s.k(fjVarA);
        return fjVarA;
    }
}
