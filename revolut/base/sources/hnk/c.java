package hnk;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_price_breakdown.PlanPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements dli.b {
    public final y o;

    public c(n stateMapper, PlanPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new b(inputData.f103625a, inputData.f103626b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
