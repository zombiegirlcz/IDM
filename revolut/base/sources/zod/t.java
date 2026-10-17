package zod;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f324034b;

    public t(AnalyticsSpendingPeriod$Interval interval, List categoriesPercent) {
        Intrinsics.checkNotNullParameter(categoriesPercent, "categoriesPercent");
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f324033a = categoriesPercent;
        this.f324034b = interval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f324033a, tVar.f324033a) && Intrinsics.f(this.f324034b, tVar.f324034b);
    }

    public final int hashCode() {
        return this.f324034b.hashCode() + (this.f324033a.hashCode() * 31);
    }
}
