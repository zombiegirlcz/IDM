package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class tu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f33881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33882b;

    private tu0(lt0 lt0Var, e4m.e eVar) {
        this.f33881a = lt0Var;
        this.f33882b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f11 get() {
        return a(this.f33881a, (sg0) this.f33882b.get());
    }

    public static tu0 a(lt0 lt0Var, e4m.e eVar) {
        return new tu0(lt0Var, eVar);
    }

    public static f11 a(lt0 lt0Var, sg0 sg0Var) {
        f11 f11VarF = lt0Var.f(sg0Var);
        vc.s.k(f11VarF);
        return f11VarF;
    }
}
