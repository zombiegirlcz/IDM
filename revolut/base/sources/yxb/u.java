package yxb;

import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesFlightSearchDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesRecommendedFlightsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f317638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f317639b;

    public u(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f317638a = featureToggleInteractor;
        this.f317639b = y0.b("/rev-points/popular-flight-details");
    }

    @Override // xii.b
    public final Set a() {
        return this.f317639b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA = lg0.g.a("departure-iata-code", linkedHashMap);
        String strA2 = lg0.g.a("arrival-iata-code", linkedHashMap);
        String strA3 = lg0.g.a("provider", linkedHashMap);
        String strA4 = lg0.g.a("imageURL", linkedHashMap);
        String strA5 = lg0.g.a("departureCity", linkedHashMap);
        String strA6 = lg0.g.a("arrivalCity", linkedHashMap);
        String strA7 = lg0.g.a("departureCountryCode", linkedHashMap);
        String strA8 = lg0.g.a("arrivalCountryCode", linkedHashMap);
        if (((jte.d) this.f317638a).c(TravelMilesApi$Toggles.AirMilesFlightSearch.f94078c) && strA5 != null && strA6 != null && strA7 != null && strA8 != null) {
            return new TravelMilesFlightSearchDestination(new TravelMilesSearchLocation.City(strA5, strA7), new TravelMilesSearchLocation.City(strA6, strA8));
        }
        if (strA != null && strA2 != null && strA3 != null) {
            return new TravelMilesRecommendedFlightsDestination(strA, strA2, strA3, strA4, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required query parameters for popular flight details deeplink are missing.");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }
}
