package yxb;

import com.revolut.feature.travel.miles.api.navigation.TravelMilesFlightSearchResultDetailsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f317637a = y0.b("/rev-points/flights/{flightId}");

    @Override // xii.b
    public final Set a() {
        return this.f317637a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("flightId");
        if (str != null && !d0.W(str)) {
            return new TravelMilesFlightSearchResultDetailsDestination(str, null, null, h0.f322473a, null);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required path parameter flightId for flight search result details deeplink is missing.");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }
}
