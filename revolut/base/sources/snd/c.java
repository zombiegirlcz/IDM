package snd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f264523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264524b;

    public c(AnalyticsSpendingPeriod$Interval interval, int i) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f264523a = interval;
        this.f264524b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f264523a, cVar.f264523a) && this.f264524b == cVar.f264524b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264524b) + (this.f264523a.hashCode() * 31);
    }
}
