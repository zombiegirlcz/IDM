package ind;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f162789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.i f162790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f162791c;
    public final xi0.b d;
    public final CategorisationFilter e;

    public b(AnalyticsSpendingPeriod$Interval interval, lzi.i type, long j2, xi0.b currency, CategorisationFilter categorisationFilter) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f162789a = interval;
        this.f162790b = type;
        this.f162791c = j2;
        this.d = currency;
        this.e = categorisationFilter;
    }

    @Override // ind.e
    public final b0 D() {
        return null;
    }

    @Override // ind.e
    public final AnalyticsSpendingPeriod$Interval a() {
        return this.f162789a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f162789a, bVar.f162789a) && this.f162790b == bVar.f162790b && this.f162791c == bVar.f162791c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    @Override // ind.e
    public final lzi.i getType() {
        return this.f162790b;
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.d, a0.d.c((this.f162790b.hashCode() + (this.f162789a.hashCode() * 31)) * 31, 31, this.f162791c), 31);
        CategorisationFilter categorisationFilter = this.e;
        return iJ + (categorisationFilter == null ? 0 : categorisationFilter.hashCode());
    }
}
