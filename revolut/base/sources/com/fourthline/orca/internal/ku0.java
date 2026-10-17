package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ku0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f30401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30403c;

    private ku0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f30401a = lt0Var;
        this.f30402b = eVar;
        this.f30403c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wv0 get() {
        return a(this.f30401a, (nv0) this.f30402b.get(), (v10) this.f30403c.get());
    }

    public static ku0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new ku0(lt0Var, eVar, eVar2);
    }

    public static wv0 a(lt0 lt0Var, nv0 nv0Var, v10 v10Var) {
        wv0 wv0VarA = lt0Var.a(nv0Var, v10Var);
        vc.s.k(wv0VarA);
        return wv0VarA;
    }
}
