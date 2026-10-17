package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class f20 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c20 f28320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28322c;
    private final e4m.e d;
    private final e4m.e e;

    private f20(c20 c20Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f28320a = c20Var;
        this.f28321b = eVar;
        this.f28322c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f28320a, (m01) this.f28321b.get(), (d11) this.f28322c.get(), (ry) this.d.get(), (lz) this.e.get());
    }

    public static f20 a(c20 c20Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new f20(c20Var, eVar, eVar2, eVar3, eVar4);
    }

    public static wd1 a(c20 c20Var, m01 m01Var, d11 d11Var, ry ryVar, lz lzVar) {
        wd1 wd1VarA = c20Var.a(m01Var, d11Var, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
