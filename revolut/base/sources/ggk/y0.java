package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Description;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Subtitle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$Subtitle f143803c;
    public final PlansDashboardLayout$PlanPageLayout$Description d;
    public final PlanPageLayoutAsset e;

    public y0(String title, List badges, PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle, PlansDashboardLayout$PlanPageLayout$Description plansDashboardLayout$PlanPageLayout$Description, PlanPageLayoutAsset planPageLayoutAsset) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f143801a = title;
        this.f143802b = badges;
        this.f143803c = plansDashboardLayout$PlanPageLayout$Subtitle;
        this.d = plansDashboardLayout$PlanPageLayout$Description;
        this.e = planPageLayoutAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f143801a, y0Var.f143801a) && Intrinsics.f(this.f143802b, y0Var.f143802b) && Intrinsics.f(this.f143803c, y0Var.f143803c) && Intrinsics.f(this.d, y0Var.d) && Intrinsics.f(this.e, y0Var.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f143801a.hashCode() * 31, 31, this.f143802b);
        PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = this.f143803c;
        int iHashCode = (iD + (plansDashboardLayout$PlanPageLayout$Subtitle == null ? 0 : plansDashboardLayout$PlanPageLayout$Subtitle.hashCode())) * 31;
        PlansDashboardLayout$PlanPageLayout$Description plansDashboardLayout$PlanPageLayout$Description = this.d;
        int iHashCode2 = (iHashCode + (plansDashboardLayout$PlanPageLayout$Description == null ? 0 : plansDashboardLayout$PlanPageLayout$Description.hashCode())) * 31;
        PlanPageLayoutAsset planPageLayoutAsset = this.e;
        return iHashCode2 + (planPageLayoutAsset != null ? planPageLayoutAsset.hashCode() : 0);
    }
}
