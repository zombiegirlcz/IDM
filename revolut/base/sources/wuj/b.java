package wuj;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItinerary;
import com.revolut.retail.feature.api.travel_trips.navigation.TravelTripsItineraryDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f300172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f300173b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f300172a = featureToggleInteractor;
        this.f300173b = y0.b("itinerary/{itineraryId}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f300173b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String str;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f300172a.a(TravelTripsApi$Toggles$TripItinerary.f99257c) && (str = (String) deeplink.f195040b.get("itineraryId")) != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return new TravelTripsItineraryDestination(str);
            }
        }
        return null;
    }
}
