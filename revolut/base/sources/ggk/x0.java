package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlansDashboardLayout$Button f143796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$Button f143797b;

    public x0(PlansDashboardLayout$Button plansDashboardLayout$Button, PlansDashboardLayout$Button plansDashboardLayout$Button2) {
        this.f143796a = plansDashboardLayout$Button;
        this.f143797b = plansDashboardLayout$Button2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f143796a, x0Var.f143796a) && Intrinsics.f(this.f143797b, x0Var.f143797b);
    }

    public final int hashCode() {
        PlansDashboardLayout$Button plansDashboardLayout$Button = this.f143796a;
        int iHashCode = (plansDashboardLayout$Button == null ? 0 : plansDashboardLayout$Button.hashCode()) * 31;
        PlansDashboardLayout$Button plansDashboardLayout$Button2 = this.f143797b;
        return iHashCode + (plansDashboardLayout$Button2 != null ? plansDashboardLayout$Button2.hashCode() : 0);
    }
}
