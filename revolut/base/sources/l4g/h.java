package l4g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchQuery f192114a;

    public h(FlightSearchQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f192114a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f192114a, ((h) obj2).f192114a);
    }

    public final int hashCode() {
        return this.f192114a.hashCode();
    }
}
