package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class iu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f29710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29711b;

    private iu0(lt0 lt0Var, e4m.e eVar) {
        this.f29710a = lt0Var;
        this.f29711b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nv0 get() {
        return a(this.f29710a, (lr0) this.f29711b.get());
    }

    public static iu0 a(lt0 lt0Var, e4m.e eVar) {
        return new iu0(lt0Var, eVar);
    }

    public static nv0 a(lt0 lt0Var, lr0 lr0Var) {
        nv0 nv0VarB = lt0Var.b(lr0Var);
        vc.s.k(nv0VarB);
        return nv0VarB;
    }
}
