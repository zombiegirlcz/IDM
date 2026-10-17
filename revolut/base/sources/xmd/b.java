package xmd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f307159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f307160c;
    public final ArrayList d;
    public final AnalyticsSpendingPeriod$Interval e;
    public final List f;

    public b(dj0.d averageSpendingAmount, dj0.d recurringPaymentsAmount, dj0.d budgetSuggestedAmount, ArrayList recurringPayments, AnalyticsSpendingPeriod$Interval budgetInterval, List suggestionBands) {
        Intrinsics.checkNotNullParameter(averageSpendingAmount, "averageSpendingAmount");
        Intrinsics.checkNotNullParameter(recurringPaymentsAmount, "recurringPaymentsAmount");
        Intrinsics.checkNotNullParameter(budgetSuggestedAmount, "budgetSuggestedAmount");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(budgetInterval, "budgetInterval");
        Intrinsics.checkNotNullParameter(suggestionBands, "suggestionBands");
        this.f307158a = averageSpendingAmount;
        this.f307159b = recurringPaymentsAmount;
        this.f307160c = budgetSuggestedAmount;
        this.d = recurringPayments;
        this.e = budgetInterval;
        this.f = suggestionBands;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f307158a.equals(bVar.f307158a) && this.f307159b.equals(bVar.f307159b) && this.f307160c.equals(bVar.f307160c) && this.d.equals(bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, v7.c(v7.c(this.f307158a.hashCode() * 31, 31, this.f307159b), 31, this.f307160c), 31)) * 31);
    }
}
