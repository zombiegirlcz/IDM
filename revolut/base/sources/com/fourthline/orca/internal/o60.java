package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class o60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f31591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31593c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f31594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f31595h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f31596j;

    private o60(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        this.f31591a = g60Var;
        this.f31592b = eVar;
        this.f31593c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f31594g = eVar6;
        this.f31595h = eVar7;
        this.i = eVar8;
        this.f31596j = eVar9;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f70 get() {
        return a(this.f31591a, (e70) this.f31592b.get(), (wr) this.f31593c.get(), (f60) this.d.get(), (wd1) this.e.get(), (LocationProvider) this.f.get(), (c70) this.f31594g.get(), (x60) this.f31595h.get(), (aq0) this.i.get(), (CoroutineScope) this.f31596j.get());
    }

    public static o60 a(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        return new o60(g60Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static f70 a(g60 g60Var, e70 e70Var, wr wrVar, f60 f60Var, wd1 wd1Var, LocationProvider locationProvider, c70 c70Var, x60 x60Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        f70 f70VarA = g60Var.a(e70Var, wrVar, f60Var, wd1Var, locationProvider, c70Var, x60Var, aq0Var, coroutineScope);
        vc.s.k(f70VarA);
        return f70VarA;
    }
}
