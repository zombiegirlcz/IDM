package chg;

import aii.r;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAirline f24226a;

    public f(TravelMilesAirline airline) {
        Intrinsics.checkNotNullParameter(airline, "airline");
        this.f24226a = airline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f24226a, ((f) obj2).f24226a);
    }

    public final int hashCode() {
        return this.f24226a.hashCode();
    }
}
