package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class au0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f26912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26914c;

    private au0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f26912a = lt0Var;
        this.f26913b = eVar;
        this.f26914c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public es0 get() {
        return a(this.f26912a, (l70) this.f26913b.get(), (v10) this.f26914c.get());
    }

    public static au0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new au0(lt0Var, eVar, eVar2);
    }

    public static es0 a(lt0 lt0Var, l70 l70Var, v10 v10Var) {
        es0 es0VarA = lt0Var.a(l70Var, v10Var);
        vc.s.k(es0VarA);
        return es0VarA;
    }
}
