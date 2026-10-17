package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f34461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34463c;

    private vu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f34461a = lt0Var;
        this.f34462b = eVar;
        this.f34463c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l11 get() {
        return a(this.f34461a, (l70) this.f34462b.get(), (v10) this.f34463c.get());
    }

    public static vu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new vu0(lt0Var, eVar, eVar2);
    }

    public static l11 a(lt0 lt0Var, l70 l70Var, v10 v10Var) {
        l11 l11VarC = lt0Var.c(l70Var, v10Var);
        vc.s.k(l11VarC);
        return l11VarC;
    }
}
