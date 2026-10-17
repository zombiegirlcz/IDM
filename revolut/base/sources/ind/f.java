package ind;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f162801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f162802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162803c;

    public f(AnalyticsSpendingPeriod$Interval interval, List list, int i) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f162801a = interval;
        this.f162802b = list;
        this.f162803c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f162801a, fVar.f162801a) && Intrinsics.f(this.f162802b, fVar.f162802b) && this.f162803c == fVar.f162803c;
    }

    public final int hashCode() {
        int iHashCode = this.f162801a.hashCode() * 31;
        Object obj2 = this.f162802b;
        return Integer.hashCode(this.f162803c) + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
