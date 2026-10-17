package dok;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanSwitchToAnnualSavings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {
    private j() {
    }

    public static PricingPlanSwitchToAnnualSavings a(hha.g monthlyBilling, hha.g yearlyBilling) {
        long j2;
        dj0.d dVar = yearlyBilling.f152308c;
        Intrinsics.checkNotNullParameter(monthlyBilling, "monthlyBilling");
        Intrinsics.checkNotNullParameter(yearlyBilling, "yearlyBilling");
        hha.f fVar = monthlyBilling.e;
        long j3 = monthlyBilling.f152308c.f115082a;
        if (fVar != null) {
            Integer num = fVar.f152302a;
            int iMin = Math.min(num != null ? num.intValue() : 12, 12);
            j2 = (j3 * ((long) (12 - iMin))) + (fVar.f152304c.f115082a * ((long) iMin));
        } else {
            j2 = j3 * ((long) 12);
        }
        hha.f fVar2 = yearlyBilling.e;
        long j5 = j2 - (fVar2 != null ? fVar2.f152304c.f115082a : dVar.f115082a);
        if (j5 < 0) {
            j5 = 0;
        }
        return new PricingPlanSwitchToAnnualSavings((((double) 100) * j5) / j2, dj0.d.c(dVar, j5, null, 2));
    }
}
