package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f29406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29408c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f29409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f29410h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f29411j;
    private final e4m.e k;

    private hu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9, e4m.e eVar10) {
        this.f29406a = lt0Var;
        this.f29407b = eVar;
        this.f29408c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f29409g = eVar6;
        this.f29410h = eVar7;
        this.i = eVar8;
        this.f29411j = eVar9;
        this.k = eVar10;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f70 get() {
        return a(this.f29406a, (c70) this.f29407b.get(), (e70) this.f29408c.get(), (bq0) this.d.get(), (jt0) this.e.get(), (wd1) this.f.get(), (LocationProvider) this.f29409g.get(), (x60) this.f29410h.get(), (CoroutineScope) this.i.get(), (l70) this.f29411j.get(), (v10) this.k.get());
    }

    public static hu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9, e4m.e eVar10) {
        return new hu0(lt0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10);
    }

    public static f70 a(lt0 lt0Var, c70 c70Var, e70 e70Var, bq0 bq0Var, jt0 jt0Var, wd1 wd1Var, LocationProvider locationProvider, x60 x60Var, CoroutineScope coroutineScope, l70 l70Var, v10 v10Var) {
        f70 f70VarA = lt0Var.a(c70Var, e70Var, bq0Var, jt0Var, wd1Var, locationProvider, x60Var, coroutineScope, l70Var, v10Var);
        vc.s.k(f70VarA);
        return f70VarA;
    }
}
