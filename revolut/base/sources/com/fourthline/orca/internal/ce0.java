package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ce0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f27446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27448c;
    private final e4m.e d;

    private ce0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f27446a = pd0Var;
        this.f27447b = eVar;
        this.f27448c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hf0 get() {
        return a(this.f27446a, (gj) this.f27447b.get(), (yj0) this.f27448c.get(), (cd0) this.d.get());
    }

    public static ce0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ce0(pd0Var, eVar, eVar2, eVar3);
    }

    public static hf0 a(pd0 pd0Var, gj gjVar, yj0 yj0Var, cd0 cd0Var) {
        hf0 hf0VarA = pd0Var.a(gjVar, yj0Var, cd0Var);
        vc.s.k(hf0VarA);
        return hf0VarA;
    }
}
