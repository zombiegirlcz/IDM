package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f143753c;
    public final boolean d;
    public final PlansDashboardLayout$PlanPageLayout$BottomSheet e;

    public m0(String title, String str, u0 u0Var, boolean z, PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143751a = title;
        this.f143752b = str;
        this.f143753c = u0Var;
        this.d = z;
        this.e = plansDashboardLayout$PlanPageLayout$BottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f143751a, m0Var.f143751a) && Intrinsics.f(this.f143752b, m0Var.f143752b) && Intrinsics.f(this.f143753c, m0Var.f143753c) && this.d == m0Var.d && Intrinsics.f(this.e, m0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f143751a.hashCode() * 31;
        String str = this.f143752b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u0 u0Var = this.f143753c;
        int iC = j6.a.c((iHashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31, 31, this.d);
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet = this.e;
        return iC + (plansDashboardLayout$PlanPageLayout$BottomSheet != null ? plansDashboardLayout$PlanPageLayout$BottomSheet.hashCode() : 0);
    }
}
