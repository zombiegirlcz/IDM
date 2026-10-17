package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ut0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f34180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34182c;
    private final e4m.e d;
    private final e4m.e e;

    private ut0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34180a = lt0Var;
        this.f34181b = eVar;
        this.f34182c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f34180a, (bq0) this.f34181b.get(), (fh0) this.f34182c.get(), (l70) this.d.get(), (v10) this.e.get());
    }

    public static ut0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new ut0(lt0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static aq0 a(lt0 lt0Var, bq0 bq0Var, fh0 fh0Var, l70 l70Var, v10 v10Var) {
        aq0 aq0VarA = lt0Var.a(bq0Var, fh0Var, l70Var, v10Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
