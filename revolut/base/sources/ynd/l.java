package ynd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;
import zod.s0;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f315460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f315461b;

    public l(AnalyticsSpendingPeriod$Interval interval, s0 content) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f315460a = interval;
        this.f315461b = content;
    }

    @Override // ynd.o
    public final AnalyticsSpendingPeriod$Interval a() {
        return this.f315460a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f315460a, lVar.f315460a) && Intrinsics.f(this.f315461b, lVar.f315461b);
    }

    public final int hashCode() {
        return this.f315461b.hashCode() + (this.f315460a.hashCode() * 31);
    }
}
