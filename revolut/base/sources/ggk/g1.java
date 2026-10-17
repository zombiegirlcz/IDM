package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143720c;
    public final y0 d;
    public final e1 e;
    public final b1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f143721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f143722h;
    public final d1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0 f143723j;
    public final PlansDashboardLayout$PlanPageLayout$BillingOptions k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PlanPageLayoutTerms f143724l;

    public g1(String id10, String title, String str, y0 y0Var, e1 e1Var, b1 specialBanner, b1 highlightedBenefits, List benefitCategories, d1 d1Var, x0 buttons, PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions, PlanPageLayoutTerms planPageLayoutTerms) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(specialBanner, "specialBanner");
        Intrinsics.checkNotNullParameter(highlightedBenefits, "highlightedBenefits");
        Intrinsics.checkNotNullParameter(benefitCategories, "benefitCategories");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f143718a = id10;
        this.f143719b = title;
        this.f143720c = str;
        this.d = y0Var;
        this.e = e1Var;
        this.f = specialBanner;
        this.f143721g = highlightedBenefits;
        this.f143722h = benefitCategories;
        this.i = d1Var;
        this.f143723j = buttons;
        this.k = plansDashboardLayout$PlanPageLayout$BillingOptions;
        this.f143724l = planPageLayoutTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f143718a, g1Var.f143718a) && Intrinsics.f(this.f143719b, g1Var.f143719b) && Intrinsics.f(this.f143720c, g1Var.f143720c) && Intrinsics.f(this.d, g1Var.d) && Intrinsics.f(this.e, g1Var.e) && Intrinsics.f(this.f, g1Var.f) && Intrinsics.f(this.f143721g, g1Var.f143721g) && Intrinsics.f(this.f143722h, g1Var.f143722h) && Intrinsics.f(this.i, g1Var.i) && Intrinsics.f(this.f143723j, g1Var.f143723j) && Intrinsics.f(this.k, g1Var.k) && Intrinsics.f(this.f143724l, g1Var.f143724l);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f143718a.hashCode() * 31, 31, this.f143719b);
        String str = this.f143720c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        y0 y0Var = this.d;
        int iHashCode2 = (iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        e1 e1Var = this.e;
        int iD = p.a.d((this.f143721g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (e1Var == null ? 0 : e1Var.f143710a.hashCode())) * 31)) * 31)) * 31, 31, this.f143722h);
        d1 d1Var = this.i;
        int iHashCode3 = (this.f143723j.hashCode() + ((iD + (d1Var == null ? 0 : d1Var.hashCode())) * 31)) * 31;
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = this.k;
        int iHashCode4 = (iHashCode3 + (plansDashboardLayout$PlanPageLayout$BillingOptions == null ? 0 : plansDashboardLayout$PlanPageLayout$BillingOptions.hashCode())) * 31;
        PlanPageLayoutTerms planPageLayoutTerms = this.f143724l;
        return iHashCode4 + (planPageLayoutTerms != null ? planPageLayoutTerms.hashCode() : 0);
    }
}
