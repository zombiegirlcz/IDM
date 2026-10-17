package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class o10 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l10 f31525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31527c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f31528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f31529h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f31530j;
    private final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e4m.e f31531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e4m.e f31532m;

    private o10(l10 l10Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9, e4m.e eVar10, e4m.e eVar11, e4m.e eVar12) {
        this.f31525a = l10Var;
        this.f31526b = eVar;
        this.f31527c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f31528g = eVar6;
        this.f31529h = eVar7;
        this.i = eVar8;
        this.f31530j = eVar9;
        this.k = eVar10;
        this.f31531l = eVar11;
        this.f31532m = eVar12;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wc1 get() {
        return a(this.f31525a, (Context) this.f31526b.get(), (r70) this.f31527c.get(), (Function0) this.d.get(), (ib0) this.e.get(), (sb1) this.f.get(), this.f31528g, (kh1) this.f31529h.get(), (tb0) this.i.get(), (c6) this.f31530j.get(), (t9) this.k.get(), (jz) this.f31531l.get(), (jx) this.f31532m.get());
    }

    public static o10 a(l10 l10Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9, e4m.e eVar10, e4m.e eVar11, e4m.e eVar12) {
        return new o10(l10Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12);
    }

    public static wc1 a(l10 l10Var, Context context, r70 r70Var, Function0 function0, ib0 ib0Var, sb1 sb1Var, phm.a aVar, kh1 kh1Var, tb0 tb0Var, c6 c6Var, t9 t9Var, jz jzVar, jx jxVar) {
        wc1 wc1VarA = l10Var.a(context, r70Var, function0, ib0Var, sb1Var, aVar, kh1Var, tb0Var, c6Var, t9Var, jzVar, jxVar);
        vc.s.k(wc1VarA);
        return wc1VarA;
    }
}
