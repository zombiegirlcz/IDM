package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class o1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f31523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31524b;

    private o1(l1 l1Var, e4m.e eVar) {
        this.f31523a = l1Var;
        this.f31524b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sg0 get() {
        return a(this.f31523a, (jx) this.f31524b.get());
    }

    public static o1 a(l1 l1Var, e4m.e eVar) {
        return new o1(l1Var, eVar);
    }

    public static sg0 a(l1 l1Var, jx jxVar) {
        sg0 sg0VarA = l1Var.a(jxVar);
        vc.s.k(sg0VarA);
        return sg0VarA;
    }
}
