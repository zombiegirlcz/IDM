package k3g;

import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Coordinates f180718a;

    public h(Coordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f180718a = coordinates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f180718a, ((h) obj2).f180718a);
    }

    public final int hashCode() {
        return this.f180718a.hashCode();
    }
}
