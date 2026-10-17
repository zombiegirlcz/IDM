package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class q51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p51 f32205a;

    private q51(p51 p51Var) {
        this.f32205a = p51Var;
    }

    public static v3 b(p51 p51Var) {
        v3 v3VarA = p51Var.a();
        vc.s.k(v3VarA);
        return v3VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v3 get() {
        return b(this.f32205a);
    }

    public static q51 a(p51 p51Var) {
        return new q51(p51Var);
    }
}
