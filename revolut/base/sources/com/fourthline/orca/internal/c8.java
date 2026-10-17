package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class c8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7 f27397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27399c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f27401h;

    private c8(y7 y7Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f27397a = y7Var;
        this.f27398b = eVar;
        this.f27399c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27400g = eVar6;
        this.f27401h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m21 get() {
        return a(this.f27397a, (i21) this.f27398b.get(), (fe1) this.f27399c.get(), (wd1) this.d.get(), (l21) this.e.get(), (kw) this.f.get(), (y11) this.f27400g.get(), (CoroutineScope) this.f27401h.get());
    }

    public static c8 a(y7 y7Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new c8(y7Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static m21 a(y7 y7Var, i21 i21Var, fe1 fe1Var, wd1 wd1Var, l21 l21Var, kw kwVar, y11 y11Var, CoroutineScope coroutineScope) {
        m21 m21VarA = y7Var.a(i21Var, fe1Var, wd1Var, l21Var, kwVar, y11Var, coroutineScope);
        vc.s.k(m21VarA);
        return m21VarA;
    }
}
