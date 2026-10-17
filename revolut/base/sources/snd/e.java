package snd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f264528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f264529b;

    public e(AnalyticsSpendingPeriod$Interval period, List widgets) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.f264528a = period;
        this.f264529b = widgets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f264528a, eVar.f264528a) && Intrinsics.f(this.f264529b, eVar.f264529b);
    }

    public final int hashCode() {
        return this.f264529b.hashCode() + (this.f264528a.hashCode() * 31);
    }
}
