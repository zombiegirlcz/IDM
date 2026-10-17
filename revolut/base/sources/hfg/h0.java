package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f151845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f151846b;

    public h0(TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2) {
        this.f151845a = travelMilesSearchLocation;
        this.f151846b = travelMilesSearchLocation2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f151845a, h0Var.f151845a) && Intrinsics.f(this.f151846b, h0Var.f151846b);
    }

    public final int hashCode() {
        TravelMilesSearchLocation travelMilesSearchLocation = this.f151845a;
        int iHashCode = (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode()) * 31;
        TravelMilesSearchLocation travelMilesSearchLocation2 = this.f151846b;
        return iHashCode + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0);
    }
}
