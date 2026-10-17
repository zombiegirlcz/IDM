package obg;

import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationType f223943a;

    public h(LocationType locationType) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        this.f223943a = locationType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f223943a, ((h) obj2).f223943a);
    }

    public final int hashCode() {
        return this.f223943a.hashCode();
    }
}
