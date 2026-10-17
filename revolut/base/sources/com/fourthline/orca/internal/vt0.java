package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f34452a;

    private vt0(lt0 lt0Var) {
        this.f34452a = lt0Var;
    }

    public static lr0 b(lt0 lt0Var) {
        lr0 lr0VarB = lt0Var.b();
        vc.s.k(lr0VarB);
        return lr0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lr0 get() {
        return b(this.f34452a);
    }

    public static vt0 a(lt0 lt0Var) {
        return new vt0(lt0Var);
    }
}
