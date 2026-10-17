package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7 f34539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34540b;

    private w7(u7 u7Var, e4m.e eVar) {
        this.f34539a = u7Var;
        this.f34540b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yw get() {
        return a(this.f34539a, (v10) this.f34540b.get());
    }

    public static w7 a(u7 u7Var, e4m.e eVar) {
        return new w7(u7Var, eVar);
    }

    public static yw a(u7 u7Var, v10 v10Var) {
        yw ywVarA = u7Var.a(v10Var);
        vc.s.k(ywVarA);
        return ywVarA;
    }
}
