package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f28921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28923c;
    private final e4m.e d;

    private gk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f28921a = fk0Var;
        this.f28922b = eVar;
        this.f28923c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e8 get() {
        return a(this.f28921a, (yj0) this.f28922b.get(), (v10) this.f28923c.get(), (sg0) this.d.get());
    }

    public static gk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new gk0(fk0Var, eVar, eVar2, eVar3);
    }

    public static e8 a(fk0 fk0Var, yj0 yj0Var, v10 v10Var, sg0 sg0Var) {
        e8 e8VarA = fk0Var.a(yj0Var, v10Var, sg0Var);
        vc.s.k(e8VarA);
        return e8VarA;
    }
}
