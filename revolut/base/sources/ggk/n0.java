package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f143758c;
    public final String d;
    public final boolean e;
    public final PlansDashboardLayout$PlanPageLayout$BottomSheet f;

    public n0(String title, String str, u0 u0Var, String str2, boolean z, PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143756a = title;
        this.f143757b = str;
        this.f143758c = u0Var;
        this.d = str2;
        this.e = z;
        this.f = plansDashboardLayout$PlanPageLayout$BottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f143756a, n0Var.f143756a) && Intrinsics.f(this.f143757b, n0Var.f143757b) && Intrinsics.f(this.f143758c, n0Var.f143758c) && Intrinsics.f(this.d, n0Var.d) && this.e == n0Var.e && Intrinsics.f(this.f, n0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f143756a.hashCode() * 31;
        String str = this.f143757b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u0 u0Var = this.f143758c;
        int iHashCode3 = (iHashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        String str2 = this.d;
        int iC = j6.a.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet = this.f;
        return iC + (plansDashboardLayout$PlanPageLayout$BottomSheet != null ? plansDashboardLayout$PlanPageLayout$BottomSheet.hashCode() : 0);
    }
}
