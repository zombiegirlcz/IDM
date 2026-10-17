package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f32898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32900c;

    private s4(e4 e4Var, e4m.e eVar, e4m.e eVar2) {
        this.f32898a = e4Var;
        this.f32899b = eVar;
        this.f32900c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f32898a, (r70) this.f32899b.get(), (lz) this.f32900c.get());
    }

    public static s4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2) {
        return new s4(e4Var, eVar, eVar2);
    }

    public static wd1 a(e4 e4Var, r70 r70Var, lz lzVar) {
        wd1 wd1VarA = e4Var.a(r70Var, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
