package ulk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreenContract$InputData;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import uj6.v;
import vkm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends oki.h implements dli.b {
    public final PlanChangeConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f281047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f281048q;

    public q(cli.n stateMapper, PlanChangeConfirmationScreenContract$InputData inputData, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = inputData;
        this.f281047p = pricingPlanInteractor;
        this.f281048q = mra.d.b(this, new g(new Data(null, null, true, 3, null), new Data(inputData.f103516b, null, false, 6, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        PlanChangeConfirmationScreenContract$InputData planChangeConfirmationScreenContract$InputData = this.o;
        String str = planChangeConfirmationScreenContract$InputData.f103515a;
        t tVar = this.f281047p;
        yji.l.a1(this, rd0.e.b(tVar.r(str)), null, null, new p(this, null, 1), 3);
        yji.l.a1(this, rd0.e.b(tVar.v(w4l.h.f294642c)), null, null, new p(this, null, 0), 3);
        yji.l.a1(this, new q0(boh.f.e(vkm.q.s(rd0.e.b(tVar.r(planChangeConfirmationScreenContract$InputData.f103515a)), new v(17), vkm.q.f290100b), new o(this, 0)), new uf0.d(new o(this, 1), null, 14), 1), null, null, new p(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f281048q;
    }
}
