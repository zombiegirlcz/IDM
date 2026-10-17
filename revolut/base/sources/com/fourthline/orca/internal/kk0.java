package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f30299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30301c;

    private kk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2) {
        this.f30299a = fk0Var;
        this.f30300b = eVar;
        this.f30301c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dl0 get() {
        return a(this.f30299a, (r70) this.f30300b.get(), (vc1) this.f30301c.get());
    }

    public static kk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2) {
        return new kk0(fk0Var, eVar, eVar2);
    }

    public static dl0 a(fk0 fk0Var, r70 r70Var, vc1 vc1Var) {
        dl0 dl0VarA = fk0Var.a(r70Var, vc1Var);
        vc.s.k(dl0VarA);
        return dl0VarA;
    }
}
