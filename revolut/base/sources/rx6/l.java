package rx6;

import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    private l() {
    }

    public static FreelancerSalesFilters$CompoundFreelancerSalesFilter a(com.revolut.feature.freelancer.api.navigation.c mode) {
        cs6.g gVar;
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = k.f258043a[mode.ordinal()];
        if (i == 1) {
            gVar = cs6.g.INVOICES;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = cs6.g.RECURRING_INVOICES;
        }
        return new FreelancerSalesFilters$CompoundFreelancerSalesFilter(gVar, 254);
    }
}
