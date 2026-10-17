package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p51 f32912a;

    private s51(p51 p51Var) {
        this.f32912a = p51Var;
    }

    public static a6 b(p51 p51Var) {
        a6 a6VarC = p51Var.c();
        vc.s.k(a6VarC);
        return a6VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a6 get() {
        return b(this.f32912a);
    }

    public static s51 a(p51 p51Var) {
        return new s51(p51Var);
    }
}
