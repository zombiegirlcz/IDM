package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f34727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34729c;
    private final e4m.e d;

    private wk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f34727a = fk0Var;
        this.f34728b = eVar;
        this.f34729c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tl0 get() {
        return a(this.f34727a, (r70) this.f34728b.get(), (gj) this.f34729c.get(), (yj0) this.d.get());
    }

    public static wk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new wk0(fk0Var, eVar, eVar2, eVar3);
    }

    public static tl0 a(fk0 fk0Var, r70 r70Var, gj gjVar, yj0 yj0Var) {
        tl0 tl0VarA = fk0Var.a(r70Var, gjVar, yj0Var);
        vc.s.k(tl0VarA);
        return tl0VarA;
    }
}
