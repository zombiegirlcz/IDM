package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ec0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f28104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28105b;

    private ec0(zb0 zb0Var, e4m.e eVar) {
        this.f28104a = zb0Var;
        this.f28105b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l9 get() {
        return a(this.f28104a, (gj) this.f28105b.get());
    }

    public static ec0 a(zb0 zb0Var, e4m.e eVar) {
        return new ec0(zb0Var, eVar);
    }

    public static l9 a(zb0 zb0Var, gj gjVar) {
        l9 l9VarA = zb0Var.a(gjVar);
        vc.s.k(l9VarA);
        return l9VarA;
    }
}
