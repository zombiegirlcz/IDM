package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchAirlineIcon f151810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151811c;

    public c0(String airlineName, TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon, String str) {
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        this.f151809a = airlineName;
        this.f151810b = travelMilesSearchAirlineIcon;
        this.f151811c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f151809a, c0Var.f151809a) && Intrinsics.f(this.f151810b, c0Var.f151810b) && Intrinsics.f(this.f151811c, c0Var.f151811c);
    }

    public final int hashCode() {
        int iHashCode = this.f151809a.hashCode() * 31;
        TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = this.f151810b;
        int iHashCode2 = (iHashCode + (travelMilesSearchAirlineIcon == null ? 0 : travelMilesSearchAirlineIcon.hashCode())) * 31;
        String str = this.f151811c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
