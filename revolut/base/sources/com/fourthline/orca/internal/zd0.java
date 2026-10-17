package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f35565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35567c;
    private final e4m.e d;
    private final e4m.e e;

    private zd0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f35565a = pd0Var;
        this.f35566b = eVar;
        this.f35567c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lj0 get() {
        return a(this.f35565a, (md0) this.f35566b.get(), (ry) this.f35567c.get(), (he0) this.d.get(), (ie0) this.e.get());
    }

    public static zd0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new zd0(pd0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static lj0 a(pd0 pd0Var, md0 md0Var, ry ryVar, he0 he0Var, ie0 ie0Var) {
        lj0 lj0VarA = pd0Var.a(md0Var, ryVar, he0Var, ie0Var);
        vc.s.k(lj0VarA);
        return lj0VarA;
    }
}
