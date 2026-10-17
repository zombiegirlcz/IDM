package zod;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.i f324012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f324013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ind.b0 f324014c;
    public final AnalyticsSpendingPeriod$Interval d;
    public final ind.b0 e;
    public final e0 f;

    public o(lzi.i periodType, AnalyticsSpendingPeriod$Interval currentInterval, ind.b0 b0Var, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, ind.b0 b0Var2, e0 e0Var) {
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(currentInterval, "currentInterval");
        this.f324012a = periodType;
        this.f324013b = currentInterval;
        this.f324014c = b0Var;
        this.d = analyticsSpendingPeriod$Interval;
        this.e = b0Var2;
        this.f = e0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f324012a == oVar.f324012a && Intrinsics.f(this.f324013b, oVar.f324013b) && Intrinsics.f(this.f324014c, oVar.f324014c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f324013b.hashCode() + (this.f324012a.hashCode() * 31)) * 31;
        ind.b0 b0Var = this.f324014c;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.d;
        int iHashCode3 = (iHashCode2 + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode())) * 31;
        ind.b0 b0Var2 = this.e;
        int iHashCode4 = (iHashCode3 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        e0 e0Var = this.f;
        return iHashCode4 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
