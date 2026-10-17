package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.w0 f143741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f143743c;
    public final i1 d;
    public final PricingPlanLayoutFooter e;

    public k1(hha.w0 w0Var, String title, i1 i1Var, i1 i1Var2, PricingPlanLayoutFooter pricingPlanLayoutFooter) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143741a = w0Var;
        this.f143742b = title;
        this.f143743c = i1Var;
        this.d = i1Var2;
        this.e = pricingPlanLayoutFooter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return this.f143741a == k1Var.f143741a && Intrinsics.f(this.f143742b, k1Var.f143742b) && Intrinsics.f(this.f143743c, k1Var.f143743c) && Intrinsics.f(this.d, k1Var.d) && Intrinsics.f(this.e, k1Var.e);
    }

    public final int hashCode() {
        hha.w0 w0Var = this.f143741a;
        int iC = p.a.c((w0Var == null ? 0 : w0Var.hashCode()) * 31, 31, this.f143742b);
        i1 i1Var = this.f143743c;
        int iHashCode = (iC + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        i1 i1Var2 = this.d;
        int iHashCode2 = (iHashCode + (i1Var2 == null ? 0 : i1Var2.hashCode())) * 31;
        PricingPlanLayoutFooter pricingPlanLayoutFooter = this.e;
        return iHashCode2 + (pricingPlanLayoutFooter != null ? pricingPlanLayoutFooter.hashCode() : 0);
    }
}
