package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class yt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f35439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35440b;

    private yt0(lt0 lt0Var, e4m.e eVar) {
        this.f35439a = lt0Var;
        this.f35440b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zr0 get() {
        return a(this.f35439a, (kt0) this.f35440b.get());
    }

    public static yt0 a(lt0 lt0Var, e4m.e eVar) {
        return new yt0(lt0Var, eVar);
    }

    public static zr0 a(lt0 lt0Var, kt0 kt0Var) {
        zr0 zr0VarA = lt0Var.a(kt0Var);
        vc.s.k(zr0VarA);
        return zr0VarA;
    }
}
