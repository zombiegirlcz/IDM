package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f35722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35724c;

    private zu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f35722a = lt0Var;
        this.f35723b = eVar;
        this.f35724c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f35722a, (lw0) this.f35723b.get(), (kx0) this.f35724c.get());
    }

    public static zu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new zu0(lt0Var, eVar, eVar2);
    }

    public static wd1 a(lt0 lt0Var, lw0 lw0Var, kx0 kx0Var) {
        wd1 wd1VarA = lt0Var.a(lw0Var, kx0Var);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
