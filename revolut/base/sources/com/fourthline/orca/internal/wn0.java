package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f34747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34749c;
    private final e4m.e d;
    private final e4m.e e;

    private wn0(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34747a = hn0Var;
        this.f34748b = eVar;
        this.f34749c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f34747a, (lp0) this.f34748b.get(), (en0) this.f34749c.get(), (ry) this.d.get(), (lz) this.e.get());
    }

    public static wn0 a(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new wn0(hn0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static wd1 a(hn0 hn0Var, lp0 lp0Var, en0 en0Var, ry ryVar, lz lzVar) {
        wd1 wd1VarA = hn0Var.a(lp0Var, en0Var, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
