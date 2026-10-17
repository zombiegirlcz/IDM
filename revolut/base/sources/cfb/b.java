package cfb;

import androidx.webkit.WebViewFeature;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$LifestyleReverywhere;
import com.revolut.feature.retail.reverywhere.api.navigation.ReverywhereWebApp;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import efb.c;
import efb.j;
import java.util.LinkedHashMap;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efb.a f23671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f23672c;
    public final efb.b d;

    public b(c reverywhereAvailabilityInteractor, efb.a airportTransfersAvailabilityInteractor, j stationsAvailabilityInteractor, efb.b luggageStorageAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(reverywhereAvailabilityInteractor, "reverywhereAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(airportTransfersAvailabilityInteractor, "airportTransfersAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stationsAvailabilityInteractor, "stationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(luggageStorageAvailabilityInteractor, "luggageStorageAvailabilityInteractor");
        this.f23670a = reverywhereAvailabilityInteractor;
        this.f23671b = airportTransfersAvailabilityInteractor;
        this.f23672c = stationsAvailabilityInteractor;
        this.d = luggageStorageAvailabilityInteractor;
    }

    @Override // xii.b
    public final Set a() {
        return y0.b("reverywhere/{mini-app-path}");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String strA;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        LinkedHashMap linkedHashMap2 = deeplink.f195041c;
        String str = (String) linkedHashMap.get("mini-app-path");
        if (str != null && (strA = g.a("app_name", linkedHashMap2)) != null) {
            String strV0 = d0.v0(strA, "REVERYWHERE:", "");
            switch (strV0.hashCode()) {
                case -1547133132:
                    boolValueOf = !strV0.equals("AIRPORT_TRANSFERS") ? null : Boolean.valueOf(this.f23671b.a());
                    break;
                case -1068479694:
                    boolValueOf = !strV0.equals("LUGGAGE_STORAGE") ? null : Boolean.valueOf(this.d.a());
                    break;
                case -53832221:
                    boolValueOf = !strV0.equals("FLIGHTS") ? null : Boolean.valueOf(((d) this.f23670a.f125302a).c(ReverywhereApi$Toggles$LifestyleReverywhere.f82877c) && WebViewFeature.isFeatureSupported("MULTI_PROFILE"));
                    break;
                case 2100958655:
                    boolValueOf = !strV0.equals("STATIONS") ? null : Boolean.valueOf(this.f23672c.a());
                    break;
                default:
                    boolValueOf = null;
                    break;
            }
            if (boolValueOf != null && boolValueOf.booleanValue()) {
                String strA2 = g.a("path", linkedHashMap2);
                String strA3 = g.a("listId", linkedHashMap2);
                return new ReverywhereWebApp.AppConfiguration(str, strA, strA2, false, strA3 != null ? com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(strA3), null) : null);
            }
        }
        return null;
    }
}
