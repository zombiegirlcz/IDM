package fuk;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f138256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f138257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f138258c;
    public final vrk.g d;
    public final MoneyClause.Format e;

    public m0(j0 barChartInfo, j0 j0Var, j0 j0Var2, vrk.g selectedBar, MoneyClause.Format moneyLegendFormatting) {
        Intrinsics.checkNotNullParameter(barChartInfo, "barChartInfo");
        Intrinsics.checkNotNullParameter(selectedBar, "selectedBar");
        Intrinsics.checkNotNullParameter(moneyLegendFormatting, "moneyLegendFormatting");
        this.f138256a = barChartInfo;
        this.f138257b = j0Var;
        this.f138258c = j0Var2;
        this.d = selectedBar;
        this.e = moneyLegendFormatting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f138256a, m0Var.f138256a) && Intrinsics.f(this.f138257b, m0Var.f138257b) && Intrinsics.f(this.f138258c, m0Var.f138258c) && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f138256a.hashCode() * 31;
        j0 j0Var = this.f138257b;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        j0 j0Var2 = this.f138258c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (j0Var2 != null ? j0Var2.hashCode() : 0)) * 31)) * 31);
    }
}
