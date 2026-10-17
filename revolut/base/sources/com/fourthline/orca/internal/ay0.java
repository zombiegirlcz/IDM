package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ay0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f26936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26938c;

    private ay0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2) {
        this.f26936a = wx0Var;
        this.f26937b = eVar;
        this.f26938c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public is0 get() {
        return a(this.f26936a, (ib0) this.f26937b.get(), (px) this.f26938c.get());
    }

    public static ay0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2) {
        return new ay0(wx0Var, eVar, eVar2);
    }

    public static is0 a(wx0 wx0Var, ib0 ib0Var, px pxVar) {
        is0 is0VarA = wx0Var.a(ib0Var, pxVar);
        vc.s.k(is0VarA);
        return is0VarA;
    }
}
