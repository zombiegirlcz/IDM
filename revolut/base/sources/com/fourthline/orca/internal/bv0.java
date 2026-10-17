package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class bv0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f27238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27240c;

    private bv0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f27238a = lt0Var;
        this.f27239b = eVar;
        this.f27240c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f27238a, (fx0) this.f27239b.get(), (cx0) this.f27240c.get());
    }

    public static bv0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new bv0(lt0Var, eVar, eVar2);
    }

    public static wd1 a(lt0 lt0Var, fx0 fx0Var, cx0 cx0Var) {
        wd1 wd1VarA = lt0Var.a(fx0Var, cx0Var);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
