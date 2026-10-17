package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ud0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f34053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34054b;

    private ud0(pd0 pd0Var, e4m.e eVar) {
        this.f34053a = pd0Var;
        this.f34054b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ke0 get() {
        return a(this.f34053a, (sg0) this.f34054b.get());
    }

    public static ud0 a(pd0 pd0Var, e4m.e eVar) {
        return new ud0(pd0Var, eVar);
    }

    public static ke0 a(pd0 pd0Var, sg0 sg0Var) {
        ke0 ke0VarA = pd0Var.a(sg0Var);
        vc.s.k(ke0VarA);
        return ke0VarA;
    }
}
