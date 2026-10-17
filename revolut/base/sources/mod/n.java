package mod;

import com.revolut.retail.feature.api.trips.models.Trip;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Trip f207627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f207628c;

    public n(Trip trip, Set excludedDates) {
        Intrinsics.checkNotNullParameter(trip, "trip");
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        this.f207627b = trip;
        this.f207628c = excludedDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f207627b, nVar.f207627b) && Intrinsics.f(this.f207628c, nVar.f207628c);
    }

    public final int hashCode() {
        return this.f207628c.hashCode() + (this.f207627b.hashCode() * 31);
    }
}
