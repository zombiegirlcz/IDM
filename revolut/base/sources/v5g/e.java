package v5g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchQuery f286219a;

    public e(FlightSearchQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f286219a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f286219a, ((e) obj2).f286219a);
    }

    public final int hashCode() {
        return this.f286219a.hashCode();
    }
}
