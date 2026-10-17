package znd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fnd.a f323744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f323745c;

    public d0() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f323743a, d0Var.f323743a) && this.f323744b == d0Var.f323744b && Intrinsics.f(this.f323745c, d0Var.f323745c);
    }

    public final int hashCode() {
        String str = this.f323743a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        fnd.a aVar = this.f323744b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f323745c;
        return iHashCode2 + (analyticsSpendingPeriod$Interval != null ? analyticsSpendingPeriod$Interval.hashCode() : 0);
    }

    public d0(String str, fnd.a aVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        this.f323743a = str;
        this.f323744b = aVar;
        this.f323745c = analyticsSpendingPeriod$Interval;
    }
}
