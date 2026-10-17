package fuk;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f138251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f138252c;
    public final vrk.g d;
    public final Object e;
    public final j0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f138253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MoneyClause.Format f138254h;

    public l0(String listIdPrefix, j0 barChart, j0 j0Var, vrk.g barSelection, Object parcel, j0 j0Var2, k0 yearsLegendStyle, MoneyClause.Format moneyLegendFormatting) {
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        Intrinsics.checkNotNullParameter(barChart, "barChart");
        Intrinsics.checkNotNullParameter(barSelection, "barSelection");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(yearsLegendStyle, "yearsLegendStyle");
        Intrinsics.checkNotNullParameter(moneyLegendFormatting, "moneyLegendFormatting");
        this.f138250a = listIdPrefix;
        this.f138251b = barChart;
        this.f138252c = j0Var;
        this.d = barSelection;
        this.e = parcel;
        this.f = j0Var2;
        this.f138253g = yearsLegendStyle;
        this.f138254h = moneyLegendFormatting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f138250a, l0Var.f138250a) && Intrinsics.f(this.f138251b, l0Var.f138251b) && Intrinsics.f(this.f138252c, l0Var.f138252c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f) && this.f138253g == l0Var.f138253g && Intrinsics.f(this.f138254h, l0Var.f138254h);
    }

    public final int hashCode() {
        int iHashCode = (this.f138251b.hashCode() + (this.f138250a.hashCode() * 31)) * 31;
        j0 j0Var = this.f138252c;
        int iB = p.a.b((this.d.hashCode() + ((iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31)) * 31, 31, this.e);
        j0 j0Var2 = this.f;
        return this.f138254h.hashCode() + ((this.f138253g.hashCode() + ((iB + (j0Var2 != null ? j0Var2.hashCode() : 0)) * 31)) * 31);
    }
}
