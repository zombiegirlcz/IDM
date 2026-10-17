package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ou0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f31771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31772b;

    private ou0(lt0 lt0Var, e4m.e eVar) {
        this.f31771a = lt0Var;
        this.f31772b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw0 get() {
        return a(this.f31771a, (kt0) this.f31772b.get());
    }

    public static ou0 a(lt0 lt0Var, e4m.e eVar) {
        return new ou0(lt0Var, eVar);
    }

    public static lw0 a(lt0 lt0Var, kt0 kt0Var) {
        lw0 lw0VarC = lt0Var.c(kt0Var);
        vc.s.k(lw0VarC);
        return lw0VarC;
    }
}
