package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class du0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f27920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27922c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f27924h;
    private final e4m.e i;

    private du0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        this.f27920a = lt0Var;
        this.f27921b = eVar;
        this.f27922c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27923g = eVar6;
        this.f27924h = eVar7;
        this.i = eVar8;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jt0 get() {
        return a(this.f27920a, (o80) this.f27921b.get(), (fw0) this.f27922c.get(), (hw0) this.d.get(), (ur0) this.e.get(), (tv0) this.f.get(), (sw0) this.f27923g.get(), (bq0) this.f27924h.get(), (v10) this.i.get());
    }

    public static du0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8) {
        return new du0(lt0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static jt0 a(lt0 lt0Var, o80 o80Var, fw0 fw0Var, hw0 hw0Var, ur0 ur0Var, tv0 tv0Var, sw0 sw0Var, bq0 bq0Var, v10 v10Var) {
        jt0 jt0VarA = lt0Var.a(o80Var, fw0Var, hw0Var, ur0Var, tv0Var, sw0Var, bq0Var, v10Var);
        vc.s.k(jt0VarA);
        return jt0VarA;
    }
}
