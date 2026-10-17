package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements flk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanCancelFlowContract$InputData f246311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f246313c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246315h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246316j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f246317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f246318m;

    public x(i0 i0Var, ViewController viewController, PlanCancelFlowContract$InputData planCancelFlowContract$InputData) {
        this.f246312b = i0Var;
        this.f246311a = planCancelFlowContract$InputData;
        this.d = e4m.b.b(new w(i0Var, this, 1));
        this.e = e4m.b.b(new w(i0Var, this, 0));
        this.f = e4m.b.b(new w(i0Var, this, 3));
        this.f246314g = e4m.b.b(new w(i0Var, this, 2));
        this.f246315h = e4m.b.b(new w(i0Var, this, 5));
        this.i = e4m.b.b(e4m.c.a(viewController));
        this.f246316j = e4m.b.b(new w(i0Var, this, 6));
        this.k = e4m.b.b(new w(i0Var, this, 4));
        this.f246317l = e4m.b.b(new w(i0Var, this, 7));
        this.f246318m = e4m.b.b(new w(i0Var, this, 8));
    }

    @Override // hlk.b
    public final r2 b() {
        return new r2(this.f246312b, this.f246313c, 1);
    }

    @Override // klk.b
    public final t2 c() {
        return new t2(this.f246312b, this.f246313c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.d.get(), (yji.n) this.f246314g.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    public final clk.c j() {
        i0 i0Var = this.f246312b;
        gte.a aVarB = i0Var.f246011c.b();
        vc.s.j(aVarB);
        efk.a aVar = i0Var.f246013h;
        ffk.t tVarF = aVar.f();
        vc.s.j(tVarF);
        xoj.a aVarA = i0Var.S.a();
        vc.s.j(aVarA);
        fn2.c cVarB = i0Var.M.b();
        fk3.a aVarA2 = i0Var.f246022t.a();
        vc.s.j(aVarA2);
        bd3.a aVarA3 = i0Var.T.a();
        vc.s.j(aVarA3);
        dha.c cVarI = aVar.i();
        vc.s.j(cVarI);
        pfk.x xVarD = aVar.d();
        vc.s.j(xVarD);
        return new clk.c(aVarB, tVarF, aVarA, cVarB, aVarA2, aVarA3, cVarI, xVarD, i0Var.f246010b.b());
    }

    @Override // nlk.c
    public final nlk.a q() {
        return new x2(this.f246312b, this.f246313c, 0);
    }
}
