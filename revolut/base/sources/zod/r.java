package zod;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f324027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f324028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f324029c;
    public final ind.b0 d;

    public r(AnalyticsSpendingPeriod$Interval interval, e0 chartDetails, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, ind.b0 b0Var) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(chartDetails, "chartDetails");
        this.f324027a = interval;
        this.f324028b = chartDetails;
        this.f324029c = analyticsSpendingPeriod$Interval;
        this.d = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f324027a, rVar.f324027a) && Intrinsics.f(this.f324028b, rVar.f324028b) && Intrinsics.f(this.f324029c, rVar.f324029c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f324028b.hashCode() + (this.f324027a.hashCode() * 31)) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f324029c;
        int iHashCode2 = (iHashCode + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode())) * 31;
        ind.b0 b0Var = this.d;
        return iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }
}
