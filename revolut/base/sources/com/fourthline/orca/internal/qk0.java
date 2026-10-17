package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f32468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32470c;
    private final e4m.e d;
    private final e4m.e e;

    private qk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f32468a = fk0Var;
        this.f32469b = eVar;
        this.f32470c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f32468a, (ak0) this.f32469b.get(), (ry) this.f32470c.get(), (cl0) this.d.get(), (lz) this.e.get());
    }

    public static qk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new qk0(fk0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static wd1 a(fk0 fk0Var, ak0 ak0Var, ry ryVar, cl0 cl0Var, lz lzVar) {
        wd1 wd1VarA = fk0Var.a(ak0Var, ryVar, cl0Var, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
