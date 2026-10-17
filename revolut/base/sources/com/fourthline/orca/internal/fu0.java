package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f28666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28667b;

    private fu0(lt0 lt0Var, e4m.e eVar) {
        this.f28666a = lt0Var;
        this.f28667b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j30 get() {
        return a(this.f28666a, (sg0) this.f28667b.get());
    }

    public static fu0 a(lt0 lt0Var, e4m.e eVar) {
        return new fu0(lt0Var, eVar);
    }

    public static j30 a(lt0 lt0Var, sg0 sg0Var) {
        j30 j30VarC = lt0Var.c(sg0Var);
        vc.s.k(j30VarC);
        return j30VarC;
    }
}
