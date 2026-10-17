package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class de0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f27715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27717c;
    private final e4m.e d;
    private final e4m.e e;

    private de0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f27715a = pd0Var;
        this.f27716b = eVar;
        this.f27717c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f27715a, (md0) this.f27716b.get(), (ry) this.f27717c.get(), (he0) this.d.get(), (ie0) this.e.get());
    }

    public static de0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new de0(pd0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static wd1 a(pd0 pd0Var, md0 md0Var, ry ryVar, he0 he0Var, ie0 ie0Var) {
        wd1 wd1VarB = pd0Var.b(md0Var, ryVar, he0Var, ie0Var);
        vc.s.k(wd1VarB);
        return wd1VarB;
    }
}
