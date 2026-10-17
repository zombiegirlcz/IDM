package tcg;

import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationType f269791a;

    public i(LocationType locationType) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        this.f269791a = locationType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f269791a, ((i) obj2).f269791a);
    }

    public final int hashCode() {
        return this.f269791a.hashCode();
    }
}
