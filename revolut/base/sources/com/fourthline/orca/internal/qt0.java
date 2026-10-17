package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f32535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32536b;

    private qt0(lt0 lt0Var, e4m.e eVar) {
        this.f32535a = lt0Var;
        this.f32536b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x60 get() {
        return a(this.f32535a, (sg0) this.f32536b.get());
    }

    public static qt0 a(lt0 lt0Var, e4m.e eVar) {
        return new qt0(lt0Var, eVar);
    }

    public static x60 a(lt0 lt0Var, sg0 sg0Var) {
        x60 x60VarA = lt0Var.a(sg0Var);
        vc.s.k(x60VarA);
        return x60VarA;
    }
}
