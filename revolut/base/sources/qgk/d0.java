package qgk;

import bmk.b;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f245912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f245913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245914c;

    public d0(i0 i0Var, e0 e0Var, int i) {
        this.f245912a = i0Var;
        this.f245913b = e0Var;
        this.f245914c = i;
    }

    @Override // phm.a
    public final Object get() {
        i0 i0Var = this.f245912a;
        efk.a aVar = i0Var.f246013h;
        i3 i3Var = i0Var.f246010b;
        e0 e0Var = this.f245913b;
        int i = this.f245914c;
        if (i != 0) {
            if (i == 1) {
                vhk.b.Companion.getClass();
                return b.a.C0115b.f16849a;
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData = e0Var.f245933a;
            egk.d dVarA = i3Var.a();
            vc.s.j(dVarA);
            ffk.t tVarF = aVar.f();
            vc.s.j(tVarF);
            return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a(planDowngradeFlowContract$InputData, dVarA, tVarF, (bmk.b) e0Var.e.get());
        }
        b.a aVar2 = (b.a) e0Var.d.get();
        gte.a aVarB = i0Var.f246011c.b();
        vc.s.j(aVarB);
        pfk.x xVarD = aVar.d();
        vc.s.j(xVarD);
        whk.g gVar = new whk.g(new whk.a(), new umk.n(new tjk.d()));
        ffk.t tVarF2 = aVar.f();
        vc.s.j(tVarF2);
        mre.c cVarB = i0Var.D.b();
        vc.s.j(cVarB);
        jgk.v vVarD = i3Var.d();
        vc.s.j(vVarD);
        return new bmk.q(aVar2, aVarB, xVarD, gVar, tVarF2, cVarB, vVarD, ((s41.a) i0Var.k).d(), i3Var.f(), i0Var.f246024x.a());
    }
}
