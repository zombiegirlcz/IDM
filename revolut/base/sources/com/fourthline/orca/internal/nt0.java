package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class nt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f31479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31481c;

    private nt0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f31479a = lt0Var;
        this.f31480b = eVar;
        this.f31481c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f31479a, (r70) this.f31480b.get(), (lz) this.f31481c.get());
    }

    public static nt0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new nt0(lt0Var, eVar, eVar2);
    }

    public static wd1 a(lt0 lt0Var, r70 r70Var, lz lzVar) {
        wd1 wd1VarA = lt0Var.a(r70Var, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
