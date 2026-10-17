package glk;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import ffk.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends oki.h implements dli.b {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f144724p;

    public l(PlanDowngradeBlockScreenContract$InputData inputData, cli.n stateMapper, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = pricingPlanInteractor;
        this.f144724p = mra.d.b(this, new g(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), inputData.f103495a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(m70.a.g(this.o.q(), null, new gcc.c(22), 1)), null, null, new gii.b(this, null, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144724p;
    }
}
