package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f34790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34791b;

    private wt0(lt0 lt0Var, e4m.e eVar) {
        this.f34790a = lt0Var;
        this.f34791b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mr0 get() {
        return a(this.f34790a, (lr0) this.f34791b.get());
    }

    public static wt0 a(lt0 lt0Var, e4m.e eVar) {
        return new wt0(lt0Var, eVar);
    }

    public static mr0 a(lt0 lt0Var, lr0 lr0Var) {
        mr0 mr0VarA = lt0Var.a(lr0Var);
        vc.s.k(mr0VarA);
        return mr0VarA;
    }
}
