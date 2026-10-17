package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f35089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35090b;

    private xt0(lt0 lt0Var, e4m.e eVar) {
        this.f35089a = lt0Var;
        this.f35090b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public or0 get() {
        return a(this.f35089a, (sg0) this.f35090b.get());
    }

    public static xt0 a(lt0 lt0Var, e4m.e eVar) {
        return new xt0(lt0Var, eVar);
    }

    public static or0 a(lt0 lt0Var, sg0 sg0Var) {
        or0 or0VarB = lt0Var.b(sg0Var);
        vc.s.k(or0VarB);
        return or0VarB;
    }
}
