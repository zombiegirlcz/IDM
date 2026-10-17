package mod;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.trips.models.Trip;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Trip f207630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f207631c;
    public final CategorisationFilter d;
    public final List e;

    public p(Trip trip, Set excludedDates, CategorisationFilter categorisationFilter, List actuallyIncludedTransactions) {
        Intrinsics.checkNotNullParameter(trip, "trip");
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        Intrinsics.checkNotNullParameter(actuallyIncludedTransactions, "actuallyIncludedTransactions");
        this.f207630b = trip;
        this.f207631c = excludedDates;
        this.d = categorisationFilter;
        this.e = actuallyIncludedTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f207630b, pVar.f207630b) && Intrinsics.f(this.f207631c, pVar.f207631c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.f(this.f207630b.hashCode() * 31, 31, this.f207631c)) * 31);
    }
}
