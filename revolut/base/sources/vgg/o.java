package vgg;

import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAirline f289169a;

    public o(TravelMilesAirline airline) {
        Intrinsics.checkNotNullParameter(airline, "airline");
        this.f289169a = airline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f289169a, ((o) obj2).f289169a);
    }

    public final int hashCode() {
        return this.f289169a.hashCode();
    }
}
