package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class dl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bl f27811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27813c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27814g;

    private dl(bl blVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f27811a = blVar;
        this.f27812b = eVar;
        this.f27813c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27814g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f27811a, (qo) this.f27812b.get(), (zc0) this.f27813c.get(), (lq) this.d.get(), (gj) this.e.get(), (yj0) this.f.get(), (Context) this.f27814g.get());
    }

    public static dl a(bl blVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new dl(blVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static Function0 a(bl blVar, qo qoVar, zc0 zc0Var, lq lqVar, gj gjVar, yj0 yj0Var, Context context) {
        Function0 function0A = blVar.a(qoVar, zc0Var, lqVar, gjVar, yj0Var, context);
        vc.s.k(function0A);
        return function0A;
    }
}
