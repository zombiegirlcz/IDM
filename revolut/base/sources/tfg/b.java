package tfg;

import android.net.Uri;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesAirlineDetailsDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesFlightSearchDestination;
import com.revolut.feature.travel.miles.api.navigation.TravelMilesTransferDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import vfg.g;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f270309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f270310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f270311c;

    public b(gte.a featureToggleInteractor, g featureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(featureAvailabilityInteractor, "featureAvailabilityInteractor");
        this.f270309a = featureToggleInteractor;
        this.f270310b = featureAvailabilityInteractor;
        String[] elements = {"miles", "miles/flight-finder", "miles/airline/{airlineRef}", "miles/points-transfer/{airlineRef}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f270311c = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f270311c;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f270310b.b()) {
            String str = deeplink.f195039a;
            LinkedHashMap linkedHashMap2 = deeplink.f195040b;
            String path = Uri.parse(str).getPath();
            String strK0 = path != null ? d0.K0(path, '/') : null;
            if (Intrinsics.f(strK0, "miles/flight-finder")) {
                if (((jte.d) this.f270309a).c(TravelMilesApi$Toggles.AirMilesFlightSearch.f94078c)) {
                    return new TravelMilesFlightSearchDestination(null, null);
                }
                String strA = lg0.g.a("listId", linkedHashMap);
                return new TravelMilesDestination(null, strA != null ? com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(strA), null) : null);
            }
            if (strK0 != null && a0.H(strK0, "miles/airline/", false)) {
                String str2 = (String) linkedHashMap2.get("airlineRef");
                if (str2 != null) {
                    return new TravelMilesAirlineDetailsDestination(str2);
                }
            } else {
                if (strK0 == null || !a0.H(strK0, "miles/points-transfer/", false)) {
                    String strA2 = lg0.g.a("listId", linkedHashMap);
                    return new TravelMilesDestination(null, strA2 != null ? com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(strA2), null) : null);
                }
                String str3 = (String) linkedHashMap2.get("airlineRef");
                if (str3 != null) {
                    String strA3 = lg0.g.a("pointsAmount", linkedHashMap);
                    return new TravelMilesTransferDestination(str3, strA3 != null ? z.m(strA3) : null);
                }
            }
        }
        return null;
    }
}
