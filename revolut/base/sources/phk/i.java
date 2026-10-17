package phk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedBillingPlan f236323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xfa.b f236324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$BillingOptions f236325c;
    public final xfa.a d;

    public i(SelectedBillingPlan selectedPlan, xfa.b source, PlansDashboardLayout$PlanPageLayout$BillingOptions billingOptions, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(billingOptions, "billingOptions");
        this.f236323a = selectedPlan;
        this.f236324b = source;
        this.f236325c = billingOptions;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236323a, iVar.f236323a) && this.f236324b == iVar.f236324b && Intrinsics.f(this.f236325c, iVar.f236325c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f236325c.hashCode() + v1.c.c(this.f236324b, this.f236323a.hashCode() * 31, 31)) * 31;
        xfa.a aVar = this.d;
        return iHashCode + (aVar == null ? 0 : aVar.f305202a.hashCode());
    }
}
