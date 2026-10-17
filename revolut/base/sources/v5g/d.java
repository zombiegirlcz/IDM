package v5g;

import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsDiscoverScreenContract$SearchParameters f286218a;

    public d(TravelFlightsDiscoverScreenContract$SearchParameters searchParameters) {
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        this.f286218a = searchParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f286218a, ((d) obj2).f286218a);
    }

    public final int hashCode() {
        return this.f286218a.hashCode();
    }
}
