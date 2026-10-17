package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class st0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f33130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33131b;

    private st0(lt0 lt0Var, e4m.e eVar) {
        this.f33130a = lt0Var;
        this.f33131b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e70 get() {
        return a(this.f33130a, (l70) this.f33131b.get());
    }

    public static st0 a(lt0 lt0Var, e4m.e eVar) {
        return new st0(lt0Var, eVar);
    }

    public static e70 a(lt0 lt0Var, l70 l70Var) {
        e70 e70VarB = lt0Var.b(l70Var);
        vc.s.k(e70VarB);
        return e70VarB;
    }
}
