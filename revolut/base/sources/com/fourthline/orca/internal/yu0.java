package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class yu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f35441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35443c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f35444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f35445h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f35446j;

    private yu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        this.f35441a = lt0Var;
        this.f35442b = eVar;
        this.f35443c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f35444g = eVar6;
        this.f35445h = eVar7;
        this.i = eVar8;
        this.f35446j = eVar9;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m21 get() {
        return a(this.f35441a, (jw0) this.f35442b.get(), (i21) this.f35443c.get(), (wd1) this.d.get(), (kw) this.e.get(), (jt0) this.f.get(), (y11) this.f35444g.get(), (bq0) this.f35445h.get(), (CoroutineScope) this.i.get(), (v10) this.f35446j.get());
    }

    public static yu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        return new yu0(lt0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static m21 a(lt0 lt0Var, jw0 jw0Var, i21 i21Var, wd1 wd1Var, kw kwVar, jt0 jt0Var, y11 y11Var, bq0 bq0Var, CoroutineScope coroutineScope, v10 v10Var) {
        m21 m21VarA = lt0Var.a(jw0Var, i21Var, wd1Var, kwVar, jt0Var, y11Var, bq0Var, coroutineScope, v10Var);
        vc.s.k(m21VarA);
        return m21VarA;
    }
}
