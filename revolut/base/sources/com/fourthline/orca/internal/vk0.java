package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f34386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34387b;

    private vk0(fk0 fk0Var, e4m.e eVar) {
        this.f34386a = fk0Var;
        this.f34387b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ol0 get() {
        return a(this.f34386a, (sg0) this.f34387b.get());
    }

    public static vk0 a(fk0 fk0Var, e4m.e eVar) {
        return new vk0(fk0Var, eVar);
    }

    public static ol0 a(fk0 fk0Var, sg0 sg0Var) {
        ol0 ol0VarB = fk0Var.b(sg0Var);
        vc.s.k(ol0VarB);
        return ol0VarB;
    }
}
