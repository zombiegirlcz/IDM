package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f31260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31261b;

    private mt0(lt0 lt0Var, e4m.e eVar) {
        this.f31260a = lt0Var;
        this.f31261b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public iv0 get() {
        return a(this.f31260a, (l70) this.f31261b.get());
    }

    public static mt0 a(lt0 lt0Var, e4m.e eVar) {
        return new mt0(lt0Var, eVar);
    }

    public static iv0 a(lt0 lt0Var, l70 l70Var) {
        iv0 iv0VarA = lt0Var.a(l70Var);
        vc.s.k(iv0VarA);
        return iv0VarA;
    }
}
