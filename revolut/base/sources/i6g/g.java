package i6g;

import aii.r;
import com.revolut.feature.travel.flights.models.domain.location.LocationSearchResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationSearchResult f158997a;

    public g(LocationSearchResult location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f158997a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f158997a, ((g) obj2).f158997a);
    }

    public final int hashCode() {
        return this.f158997a.hashCode();
    }
}
