package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class cv0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f27562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27563b;

    private cv0(lt0 lt0Var, e4m.e eVar) {
        this.f27562a = lt0Var;
        this.f27563b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fe1 get() {
        return a(this.f27562a, (jt0) this.f27563b.get());
    }

    public static cv0 a(lt0 lt0Var, e4m.e eVar) {
        return new cv0(lt0Var, eVar);
    }

    public static fe1 a(lt0 lt0Var, jt0 jt0Var) {
        fe1 fe1VarA = lt0Var.a(jt0Var);
        vc.s.k(fe1VarA);
        return fe1VarA;
    }
}
