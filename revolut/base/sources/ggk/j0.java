package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$ClickAction f143735b;

    public j0(String icon, PlansDashboardLayout$ClickAction action) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f143734a = icon;
        this.f143735b = action;
    }

    @Override // ggk.l0
    public final PlansDashboardLayout$ClickAction B() {
        return this.f143735b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f143734a, j0Var.f143734a) && Intrinsics.f(this.f143735b, j0Var.f143735b);
    }

    public final int hashCode() {
        return this.f143735b.hashCode() + (this.f143734a.hashCode() * 31);
    }
}
