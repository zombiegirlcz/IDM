package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$ClickAction f143740b;

    public k0(String label, PlansDashboardLayout$ClickAction action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f143739a = label;
        this.f143740b = action;
    }

    @Override // ggk.l0
    public final PlansDashboardLayout$ClickAction B() {
        return this.f143740b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f143739a, k0Var.f143739a) && Intrinsics.f(this.f143740b, k0Var.f143740b);
    }

    public final int hashCode() {
        return this.f143740b.hashCode() + (this.f143739a.hashCode() * 31);
    }
}
