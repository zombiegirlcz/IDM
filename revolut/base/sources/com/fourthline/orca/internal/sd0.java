package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class sd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f32987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32989c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f32990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f32991h;

    private sd0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f32987a = pd0Var;
        this.f32988b = eVar;
        this.f32989c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f32990g = eVar6;
        this.f32991h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public he0 get() {
        return a(this.f32987a, (Function0) this.f32988b.get(), (gj) this.f32989c.get(), (yj0) this.d.get(), (m81) this.e.get(), (vc1) this.f.get(), (vc1) this.f32990g.get(), (vc1) this.f32991h.get());
    }

    public static sd0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new sd0(pd0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static he0 a(pd0 pd0Var, Function0 function0, gj gjVar, yj0 yj0Var, m81 m81Var, vc1 vc1Var, vc1 vc1Var2, vc1 vc1Var3) {
        he0 he0VarA = pd0Var.a(function0, gjVar, yj0Var, m81Var, vc1Var, vc1Var2, vc1Var3);
        vc.s.k(he0VarA);
        return he0VarA;
    }
}
