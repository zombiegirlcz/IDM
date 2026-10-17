package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f32049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32050b;

    private pu0(lt0 lt0Var, e4m.e eVar) {
        this.f32049a = lt0Var;
        this.f32050b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nw0 get() {
        return a(this.f32049a, (sg0) this.f32050b.get());
    }

    public static pu0 a(lt0 lt0Var, e4m.e eVar) {
        return new pu0(lt0Var, eVar);
    }

    public static nw0 a(lt0 lt0Var, sg0 sg0Var) {
        nw0 nw0VarE = lt0Var.e(sg0Var);
        vc.s.k(nw0VarE);
        return nw0VarE;
    }
}
