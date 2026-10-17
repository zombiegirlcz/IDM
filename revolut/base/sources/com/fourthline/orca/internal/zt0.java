package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f35717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35718b;

    private zt0(lt0 lt0Var, e4m.e eVar) {
        this.f35717a = lt0Var;
        this.f35718b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bs0 get() {
        return a(this.f35717a, (kt0) this.f35718b.get());
    }

    public static zt0 a(lt0 lt0Var, e4m.e eVar) {
        return new zt0(lt0Var, eVar);
    }

    public static bs0 a(lt0 lt0Var, kt0 kt0Var) {
        bs0 bs0VarB = lt0Var.b(kt0Var);
        vc.s.k(bs0VarB);
        return bs0VarB;
    }
}
