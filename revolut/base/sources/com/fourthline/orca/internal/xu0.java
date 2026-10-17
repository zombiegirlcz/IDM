package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f35094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35095b;

    private xu0(lt0 lt0Var, e4m.e eVar) {
        this.f35094a = lt0Var;
        this.f35095b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y11 get() {
        return a(this.f35094a, (sg0) this.f35095b.get());
    }

    public static xu0 a(lt0 lt0Var, e4m.e eVar) {
        return new xu0(lt0Var, eVar);
    }

    public static y11 a(lt0 lt0Var, sg0 sg0Var) {
        y11 y11VarG = lt0Var.g(sg0Var);
        vc.s.k(y11VarG);
        return y11VarG;
    }
}
