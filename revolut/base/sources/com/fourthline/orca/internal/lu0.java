package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f30753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30755c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f30756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f30757h;

    private lu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f30753a = lt0Var;
        this.f30754b = eVar;
        this.f30755c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f30756g = eVar6;
        this.f30757h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xv0 get() {
        return a(this.f30753a, (wv0) this.f30754b.get(), (jt0) this.f30755c.get(), (nv0) this.d.get(), (kx) this.e.get(), (lx) this.f.get(), (oj0) this.f30756g.get(), (pv0) this.f30757h.get());
    }

    public static lu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new lu0(lt0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static xv0 a(lt0 lt0Var, wv0 wv0Var, jt0 jt0Var, nv0 nv0Var, kx kxVar, lx lxVar, oj0 oj0Var, pv0 pv0Var) {
        xv0 xv0VarA = lt0Var.a(wv0Var, jt0Var, nv0Var, kxVar, lxVar, oj0Var, pv0Var);
        vc.s.k(xv0VarA);
        return xv0VarA;
    }
}
