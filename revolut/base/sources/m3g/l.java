package m3g;

import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Coordinates f202541a;

    public l(Coordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f202541a = coordinates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f202541a, ((l) obj2).f202541a);
    }

    public final int hashCode() {
        return this.f202541a.hashCode();
    }
}
