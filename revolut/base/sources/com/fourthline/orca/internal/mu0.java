package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f31269a;

    private mu0(lt0 lt0Var) {
        this.f31269a = lt0Var;
    }

    public static i21 b(lt0 lt0Var) {
        i21 i21VarC = lt0Var.c();
        vc.s.k(i21VarC);
        return i21VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i21 get() {
        return b(this.f31269a);
    }

    public static mu0 a(lt0 lt0Var) {
        return new mu0(lt0Var);
    }
}
