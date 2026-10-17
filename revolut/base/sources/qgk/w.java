package qgk;

import bmk.b;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f246301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f246302c;

    public w(i0 i0Var, x xVar, int i) {
        this.f246300a = i0Var;
        this.f246301b = xVar;
        this.f246302c = i;
    }

    @Override // phm.a
    public final Object get() {
        i0 i0Var = this.f246300a;
        ite.a aVar = i0Var.f246011c;
        i3 i3Var = i0Var.f246010b;
        efk.a aVar2 = i0Var.f246013h;
        x xVar = this.f246301b;
        int i = this.f246302c;
        switch (i) {
            case 0:
                pfk.x xVarD = aVar2.d();
                vc.s.j(xVarD);
                clk.c cVarJ = xVar.j();
                sf0.h hVarB = i0Var.U.b();
                vc.s.j(hVarB);
                return new elk.f(xVarD, cVarJ, hVarB, new elk.g(), (bgk.a) xVar.d.get());
            case 1:
                ohk.a factory = i0Var.u.d();
                vc.s.j(factory);
                flk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 2:
                b.a aVar3 = (b.a) xVar.f.get();
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                pfk.x xVarD2 = aVar2.d();
                vc.s.j(xVarD2);
                whk.g gVar = new whk.g(new whk.a(), new umk.n(new tjk.d()));
                ffk.t tVarF = aVar2.f();
                vc.s.j(tVarF);
                mre.c cVarB = i0Var.D.b();
                vc.s.j(cVarB);
                jgk.v vVarD = i3Var.d();
                vc.s.j(vVarD);
                return new bmk.q(aVar3, aVarB, xVarD2, gVar, tVarF, cVarB, vVarD, ((s41.a) i0Var.k).d(), i3Var.f(), i0Var.f246024x.a());
            case 3:
                flk.b.Companion.getClass();
                return b.a.C0114a.f16848a;
            case 4:
                ffk.t pricingPlanInteractor = aVar2.f();
                vc.s.j(pricingPlanInteractor);
                wjk.b cancelFreePlanDialogFactory = (wjk.b) xVar.f246315h.get();
                j60.a bottomExpandableExtension = (j60.a) xVar.f246316j.get();
                xjk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
                Intrinsics.checkNotNullParameter(cancelFreePlanDialogFactory, "cancelFreePlanDialogFactory");
                Intrinsics.checkNotNullParameter(bottomExpandableExtension, "bottomExpandableExtension");
                return new wjk.f(pricingPlanInteractor, cancelFreePlanDialogFactory, bottomExpandableExtension, new LargeActionButtonDelegate());
            case 5:
                return new wjk.g();
            case 6:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) xVar.i.get();
                he2.b dialogHostFinder = ehe.n.r();
                xjk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, new rp0.m(), dialogHostFinder);
            case 7:
                PlanCancelFlowContract$InputData planCancelFlowContract$InputData = xVar.f246311a;
                qlk.a aVar4 = new qlk.a();
                ffk.t tVarF2 = aVar2.f();
                vc.s.j(tVarF2);
                clk.c cVarJ2 = xVar.j();
                elk.a aVar5 = (elk.a) xVar.e.get();
                dlk.r rVar = new dlk.r();
                egk.d dVarA = i3Var.a();
                vc.s.j(dVarA);
                bgk.a aVar6 = (bgk.a) xVar.d.get();
                bmk.b bVar = (bmk.b) xVar.f246314g.get();
                wjk.e eVar = (wjk.e) xVar.k.get();
                ajk.f fVarH = i3Var.h();
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e(planCancelFlowContract$InputData, aVar4, tVarF2, cVarJ2, aVar5, rVar, dVarA, aVar6, bVar, eVar, fVarH, aVarB2);
            case 8:
                Object impl = (j60.a) xVar.f246316j.get();
                xjk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                vc.s.k(dVar);
                return dVar;
            default:
                throw new AssertionError(i);
        }
    }
}
