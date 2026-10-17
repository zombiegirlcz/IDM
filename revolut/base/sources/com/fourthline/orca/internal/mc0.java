package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f31159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31161c;
    private final e4m.e d;

    private mc0(zb0 zb0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f31159a = zb0Var;
        this.f31160b = eVar;
        this.f31161c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hf0 get() {
        return a(this.f31159a, (gj) this.f31160b.get(), (yj0) this.f31161c.get(), (cd0) this.d.get());
    }

    public static mc0 a(zb0 zb0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new mc0(zb0Var, eVar, eVar2, eVar3);
    }

    public static hf0 a(zb0 zb0Var, gj gjVar, yj0 yj0Var, cd0 cd0Var) {
        hf0 hf0VarA = zb0Var.a(gjVar, yj0Var, cd0Var);
        vc.s.k(hf0VarA);
        return hf0VarA;
    }
}
