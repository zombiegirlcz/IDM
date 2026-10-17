package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f32543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32544b;

    private qu0(lt0 lt0Var, e4m.e eVar) {
        this.f32543a = lt0Var;
        this.f32544b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xw0 get() {
        return a(this.f32543a, (kt0) this.f32544b.get());
    }

    public static qu0 a(lt0 lt0Var, e4m.e eVar) {
        return new qu0(lt0Var, eVar);
    }

    public static xw0 a(lt0 lt0Var, kt0 kt0Var) {
        xw0 xw0VarD = lt0Var.d(kt0Var);
        vc.s.k(xw0VarD);
        return xw0VarD;
    }
}
