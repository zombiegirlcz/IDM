package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class i50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h50 f29507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29509c;

    private i50(h50 h50Var, e4m.e eVar, e4m.e eVar2) {
        this.f29507a = h50Var;
        this.f29508b = eVar;
        this.f29509c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ie get() {
        return a(this.f29507a, (r70) this.f29508b.get(), (sc1) this.f29509c.get());
    }

    public static i50 a(h50 h50Var, e4m.e eVar, e4m.e eVar2) {
        return new i50(h50Var, eVar, eVar2);
    }

    public static ie a(h50 h50Var, r70 r70Var, sc1 sc1Var) {
        ie ieVarA = h50Var.a(r70Var, sc1Var);
        vc.s.k(ieVarA);
        return ieVarA;
    }
}
