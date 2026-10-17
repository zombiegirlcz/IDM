package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ju0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f30043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30044b;

    private ju0(lt0 lt0Var, e4m.e eVar) {
        this.f30043a = lt0Var;
        this.f30044b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pv0 get() {
        return a(this.f30043a, (sg0) this.f30044b.get());
    }

    public static ju0 a(lt0 lt0Var, e4m.e eVar) {
        return new ju0(lt0Var, eVar);
    }

    public static pv0 a(lt0 lt0Var, sg0 sg0Var) {
        pv0 pv0VarD = lt0Var.d(sg0Var);
        vc.s.k(pv0VarD);
        return pv0VarD;
    }
}
