package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class av0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f26915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26917c;

    private av0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f26915a = lt0Var;
        this.f26916b = eVar;
        this.f26917c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f26915a, (r70) this.f26916b.get(), (lz) this.f26917c.get());
    }

    public static av0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new av0(lt0Var, eVar, eVar2);
    }

    public static wd1 a(lt0 lt0Var, r70 r70Var, lz lzVar) {
        wd1 wd1VarB = lt0Var.b(r70Var, lzVar);
        vc.s.k(wd1VarB);
        return wd1VarB;
    }
}
