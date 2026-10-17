package znd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fnd.a f323749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f323750c;
    public final c d;

    public e0() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f323748a, e0Var.f323748a) && this.f323749b == e0Var.f323749b && Intrinsics.f(this.f323750c, e0Var.f323750c) && Intrinsics.f(this.d, e0Var.d);
    }

    public final int hashCode() {
        String str = this.f323748a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        fnd.a aVar = this.f323749b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f323750c;
        int iHashCode3 = (iHashCode2 + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode())) * 31;
        c cVar = this.d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public e0(String str, fnd.a aVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, c cVar) {
        this.f323748a = str;
        this.f323749b = aVar;
        this.f323750c = analyticsSpendingPeriod$Interval;
        this.d = cVar;
    }
}
