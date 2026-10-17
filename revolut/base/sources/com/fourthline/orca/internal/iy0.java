package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class iy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f29754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29756c;
    private final e4m.e d;

    private iy0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29754a = wx0Var;
        this.f29755b = eVar;
        this.f29756c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kx0 get() {
        return a(this.f29754a, (ls0) this.f29755b.get(), (ib0) this.f29756c.get(), (yv0) this.d.get());
    }

    public static iy0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new iy0(wx0Var, eVar, eVar2, eVar3);
    }

    public static kx0 a(wx0 wx0Var, ls0 ls0Var, ib0 ib0Var, yv0 yv0Var) {
        kx0 kx0VarA = wx0Var.a(ls0Var, ib0Var, yv0Var);
        vc.s.k(kx0VarA);
        return kx0VarA;
    }
}
