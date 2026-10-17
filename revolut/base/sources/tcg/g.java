package tcg;

import com.revolut.feature_travel_hotels_models.property.search.LocationMapBoundaries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationMapBoundaries f269789a;

    public g(LocationMapBoundaries locationData) {
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        this.f269789a = locationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f269789a, ((g) obj2).f269789a);
    }

    public final int hashCode() {
        return this.f269789a.hashCode();
    }
}
