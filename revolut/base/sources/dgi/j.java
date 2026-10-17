package dgi;

import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfi.a f114697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelHotelsSortingOption f114698c;
    public final Pair d;
    public final LocationData e;
    public final List f;

    public j(String smartSearchPrompt, zfi.a aVar, TravelHotelsSortingOption travelHotelsSortingOption, Pair pair, LocationData locationData, List list) {
        Intrinsics.checkNotNullParameter(smartSearchPrompt, "smartSearchPrompt");
        this.f114696a = smartSearchPrompt;
        this.f114697b = aVar;
        this.f114698c = travelHotelsSortingOption;
        this.d = pair;
        this.e = locationData;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f114696a, jVar.f114696a) && Intrinsics.f(this.f114697b, jVar.f114697b) && Intrinsics.f(this.f114698c, jVar.f114698c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f114696a.hashCode() * 31;
        zfi.a aVar = this.f114697b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TravelHotelsSortingOption travelHotelsSortingOption = this.f114698c;
        int iHashCode3 = (iHashCode2 + (travelHotelsSortingOption == null ? 0 : travelHotelsSortingOption.hashCode())) * 31;
        Pair pair = this.d;
        int iHashCode4 = (iHashCode3 + (pair == null ? 0 : pair.hashCode())) * 31;
        LocationData locationData = this.e;
        int iHashCode5 = (iHashCode4 + (locationData == null ? 0 : locationData.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }
}
