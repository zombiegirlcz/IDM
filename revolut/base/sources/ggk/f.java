package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f143712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143713c;
    public final y0 d;
    public final PlansDashboardLayout$PlanPageLayout$BillingOptions e;
    public final x0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f143714g;

    public f(String id10, i0 i0Var, String title, y0 y0Var, PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions, x0 buttons, ArrayList benefitCategories) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(benefitCategories, "benefitCategories");
        this.f143711a = id10;
        this.f143712b = i0Var;
        this.f143713c = title;
        this.d = y0Var;
        this.e = plansDashboardLayout$PlanPageLayout$BillingOptions;
        this.f = buttons;
        this.f143714g = benefitCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f143711a, fVar.f143711a) && Intrinsics.f(this.f143712b, fVar.f143712b) && Intrinsics.f(this.f143713c, fVar.f143713c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f.equals(fVar.f) && this.f143714g.equals(fVar.f143714g);
    }

    public final int hashCode() {
        int iHashCode = this.f143711a.hashCode() * 31;
        i0 i0Var = this.f143712b;
        int iC = p.a.c((iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31, this.f143713c);
        y0 y0Var = this.d;
        int iHashCode2 = (iC + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = this.e;
        return this.f143714g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (plansDashboardLayout$PlanPageLayout$BillingOptions != null ? plansDashboardLayout$PlanPageLayout$BillingOptions.hashCode() : 0)) * 31)) * 31);
    }
}
