package h8g;

import android.net.Uri;
import com.revolut.feature.trade_rev_points.api.navigation.TradeRevPointsAgentDetailsDestination;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsHomeKompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import lg0.e;
import m1c.e0;
import r10.r;
import u2f.j;
import xii.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f150043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f150044b;

    public a(r featureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureAvailabilityInteractor, "featureAvailabilityInteractor");
        this.f150043a = featureAvailabilityInteractor;
        String[] elements = {"hotel-points", "hotel-points/partners/{partnerRef}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f150044b = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f150044b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f150043a.t()) {
            String path = Uri.parse(deeplink.f195039a).getPath();
            String strK0 = path != null ? d0.K0(path, '/') : null;
            if (strK0 == null || !a0.H(strK0, "hotel-points/partners/", false)) {
                return new TravelHotelsHomeKompotDestination(null, r8g.a.TRANSFERS, new TravelHotelsHomeKompotDestination.EntryPoint.External("hotel-points"), 1);
            }
            String str = (String) deeplink.f195040b.get("partnerRef");
            if (str != null) {
                return new TradeRevPointsAgentDetailsDestination(str, j.HOTEL_LOYALTY_TRANSFERS, e0.STAYS, null);
            }
        }
        return null;
    }
}
