package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class oa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f31622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31624c;
    private final e4m.e d;
    private final e4m.e e;

    private oa1(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f31622a = r91Var;
        this.f31623b = eVar;
        this.f31624c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f31622a, (o81) this.f31623b.get(), (o91) this.f31624c.get(), (ry) this.d.get(), (lz) this.e.get());
    }

    public static oa1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new oa1(r91Var, eVar, eVar2, eVar3, eVar4);
    }

    public static wd1 a(r91 r91Var, o81 o81Var, o91 o91Var, ry ryVar, lz lzVar) {
        wd1 wd1VarA = r91Var.a(o81Var, o91Var, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
