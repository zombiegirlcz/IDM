package e4g;

import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.trade_rev_points.api.navigation.TradeRevPointsAgentDetailsDestination;
import com.revolut.feature.travel.flights.api.navigation.TravelFlightsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import h4g.g;
import java.util.LinkedHashMap;
import java.util.Set;
import k18.c;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import lg0.e;
import m1c.e0;
import u2f.j;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122547a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f122548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f122549c;

    public a(g featureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureAvailabilityInteractor, "featureAvailabilityInteractor");
        this.f122549c = featureAvailabilityInteractor;
        String[] elements = {"flights", z3g.a.f319261a, z3g.a.f319262b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f122548b = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        switch (this.f122547a) {
        }
        return this.f122548b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String str;
        String strE;
        j jVar;
        switch (this.f122547a) {
            case 0:
                LinkedHashMap linkedHashMap = deeplink.f195040b;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                if (!((g) this.f122549c).a()) {
                    return null;
                }
                String str2 = (String) linkedHashMap.get("bookingId");
                return str2 != null ? new TravelFlightsDestination(str2, (String) linkedHashMap.get("tab"), 4) : new TravelFlightsDestination((String) null, (String) null, 7);
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                LinkedHashMap linkedHashMap2 = deeplink.f195040b;
                String str3 = (String) linkedHashMap2.get("agentId");
                if (str3 == null) {
                    return null;
                }
                if (d0.W(str3)) {
                    str3 = null;
                }
                if (str3 == null || (str = (String) linkedHashMap2.get("productType")) == null || (strE = a0.E(str, CoreConstants.DASH_CHAR, '_')) == null) {
                    return null;
                }
                j[] jVarArrValues = j.values();
                int length = jVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        jVar = jVarArrValues[i];
                        if (!a0.z(jVar.name(), strE, true)) {
                            i++;
                        }
                    } else {
                        jVar = null;
                    }
                }
                if (jVar != null && jVar == j.TRAINS_POINTS && ((c) this.f122549c).v()) {
                    return new TradeRevPointsAgentDetailsDestination(str3, jVar, e0.GENERIC, null);
                }
                return null;
        }
    }

    public a(c featureInteractor) {
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f122549c = featureInteractor;
        this.f122548b = y0.b("{productType}/agents/{agentId}");
    }
}
