package zkk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$BillingOptionItem f323073b;

    public k(String planId, PlansDashboardLayout$PlanPageLayout$BillingOptionItem selectedBillingOption) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(selectedBillingOption, "selectedBillingOption");
        this.f323072a = planId;
        this.f323073b = selectedBillingOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f323072a, kVar.f323072a) && Intrinsics.f(this.f323073b, kVar.f323073b);
    }

    public final int hashCode() {
        return this.f323073b.hashCode() + (this.f323072a.hashCode() * 31);
    }
}
