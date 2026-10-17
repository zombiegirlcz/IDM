package lzi;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f200980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f200981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f200982c;

    public j(i type, AnalyticsSpendingPeriod$Interval interval, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f200980a = type;
        this.f200981b = interval;
        this.f200982c = analyticsSpendingPeriod$Interval;
    }

    public static j a(j jVar, AnalyticsSpendingPeriod$Interval interval, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, int i) {
        i type = jVar.f200980a;
        if ((i & 2) != 0) {
            interval = jVar.f200981b;
        }
        if ((i & 4) != 0) {
            analyticsSpendingPeriod$Interval = jVar.f200982c;
        }
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(interval, "interval");
        return new j(type, interval, analyticsSpendingPeriod$Interval);
    }

    public final long b() {
        return hb9.b.k(this.f200980a, this.f200981b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f200980a == jVar.f200980a && Intrinsics.f(this.f200981b, jVar.f200981b) && Intrinsics.f(this.f200982c, jVar.f200982c);
    }

    public final int hashCode() {
        int iHashCode = (this.f200981b.hashCode() + (this.f200980a.hashCode() * 31)) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f200982c;
        return iHashCode + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode());
    }
}
