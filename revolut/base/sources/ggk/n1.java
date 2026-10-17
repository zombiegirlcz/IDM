package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanAction f143761c;

    public n1(String icon, String accessibilityLabel, PricingPlanAction action) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(accessibilityLabel, "accessibilityLabel");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f143759a = icon;
        this.f143760b = accessibilityLabel;
        this.f143761c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f143759a, n1Var.f143759a) && Intrinsics.f(this.f143760b, n1Var.f143760b) && Intrinsics.f(this.f143761c, n1Var.f143761c);
    }

    public final int hashCode() {
        return this.f143761c.hashCode() + p.a.c(this.f143759a.hashCode() * 31, 31, this.f143760b);
    }
}
