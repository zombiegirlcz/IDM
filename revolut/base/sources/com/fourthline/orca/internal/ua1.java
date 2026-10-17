package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ua1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f33986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33988c;
    private final e4m.e d;

    private ua1(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f33986a = r91Var;
        this.f33987b = eVar;
        this.f33988c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40 get() {
        return a(this.f33986a, (j30) this.f33987b.get(), (k91) this.f33988c.get(), (l70) this.d.get());
    }

    public static ua1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ua1(r91Var, eVar, eVar2, eVar3);
    }

    public static e40 a(r91 r91Var, j30 j30Var, k91 k91Var, l70 l70Var) {
        e40 e40VarA = r91Var.a(j30Var, k91Var, l70Var);
        vc.s.k(e40VarA);
        return e40VarA;
    }
}
