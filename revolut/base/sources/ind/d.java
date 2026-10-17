package ind;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f162798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.i f162799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f162800c;

    public d(AnalyticsSpendingPeriod$Interval interval, lzi.i type, long j2) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f162798a = interval;
        this.f162799b = type;
        this.f162800c = j2;
    }

    @Override // ind.e
    public final b0 D() {
        return null;
    }

    @Override // ind.e
    public final AnalyticsSpendingPeriod$Interval a() {
        return this.f162798a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f162798a, dVar.f162798a) && this.f162799b == dVar.f162799b && this.f162800c == dVar.f162800c;
    }

    @Override // ind.e
    public final lzi.i getType() {
        return this.f162799b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f162800c) + ((this.f162799b.hashCode() + (this.f162798a.hashCode() * 31)) * 31);
    }
}
