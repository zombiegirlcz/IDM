package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class u51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p51 f33963a;

    private u51(p51 p51Var) {
        this.f33963a = p51Var;
    }

    public static b7 b(p51 p51Var) {
        b7 b7VarE = p51Var.e();
        vc.s.k(b7VarE);
        return b7VarE;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b7 get() {
        return b(this.f33963a);
    }

    public static u51 a(p51 p51Var) {
        return new u51(p51Var);
    }
}
