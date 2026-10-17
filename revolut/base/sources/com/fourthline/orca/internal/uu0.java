package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class uu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f34192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34194c;
    private final e4m.e d;
    private final e4m.e e;

    private uu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34192a = lt0Var;
        this.f34193b = eVar;
        this.f34194c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fw0 get() {
        return a(this.f34192a, (o80) this.f34193b.get(), (sj0) this.f34194c.get(), (bq0) this.d.get(), (l70) this.e.get());
    }

    public static uu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new uu0(lt0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static fw0 a(lt0 lt0Var, o80 o80Var, sj0 sj0Var, bq0 bq0Var, l70 l70Var) {
        fw0 fw0VarA = lt0Var.a(o80Var, sj0Var, bq0Var, l70Var);
        vc.s.k(fw0VarA);
        return fw0VarA;
    }
}
