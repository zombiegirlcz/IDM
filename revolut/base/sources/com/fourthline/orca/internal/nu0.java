package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class nu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f31483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31485c;

    private nu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f31483a = lt0Var;
        this.f31484b = eVar;
        this.f31485c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jw0 get() {
        return a(this.f31483a, (l70) this.f31484b.get(), (v10) this.f31485c.get());
    }

    public static nu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new nu0(lt0Var, eVar, eVar2);
    }

    public static jw0 a(lt0 lt0Var, l70 l70Var, v10 v10Var) {
        jw0 jw0VarB = lt0Var.b(l70Var, v10Var);
        vc.s.k(jw0VarB);
        return jw0VarB;
    }
}
