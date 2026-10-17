package ynd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f315462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f315463b;

    public m(AnalyticsSpendingPeriod$Interval interval, n type) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f315462a = interval;
        this.f315463b = type;
    }

    @Override // ynd.o
    public final AnalyticsSpendingPeriod$Interval a() {
        return this.f315462a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f315462a, mVar.f315462a) && this.f315463b == mVar.f315463b;
    }

    public final int hashCode() {
        return this.f315463b.hashCode() + (this.f315462a.hashCode() * 31);
    }
}
