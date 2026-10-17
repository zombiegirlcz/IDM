package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ok0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f31679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31680b;

    private ok0(fk0 fk0Var, e4m.e eVar) {
        this.f31679a = fk0Var;
        this.f31680b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i80 get() {
        return a(this.f31679a, (p71) this.f31680b.get());
    }

    public static ok0 a(fk0 fk0Var, e4m.e eVar) {
        return new ok0(fk0Var, eVar);
    }

    public static i80 a(fk0 fk0Var, p71 p71Var) {
        i80 i80VarA = fk0Var.a(p71Var);
        vc.s.k(i80VarA);
        return i80VarA;
    }
}
