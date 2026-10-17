package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class r51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p51 f32635a;

    private r51(p51 p51Var) {
        this.f32635a = p51Var;
    }

    public static rp0 b(p51 p51Var) {
        rp0 rp0VarB = p51Var.b();
        vc.s.k(rp0VarB);
        return rp0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rp0 get() {
        return b(this.f32635a);
    }

    public static r51 a(p51 p51Var) {
        return new r51(p51Var);
    }
}
