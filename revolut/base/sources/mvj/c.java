package mvj;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$Target;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelItineraryRemoveEventContract$InputData f209267a;

    public c(TravelItineraryRemoveEventContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f209267a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelItineraryRemoveEventContract$Target travelItineraryRemoveEventContract$Target = this.f209267a.f101649a;
        if (travelItineraryRemoveEventContract$Target instanceof TravelItineraryRemoveEventContract$Target.Event) {
            textLocalisedClause = new TextLocalisedClause(R$string.travel_trip_itinerary_remove_event_title, null, null, 14);
        } else {
            if (!(travelItineraryRemoveEventContract$Target instanceof TravelItineraryRemoveEventContract$Target.Proposal)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.travel_trip_itinerary_remove_suggestion_title, null, null, 14);
        }
        boolean z = travelItineraryRemoveEventContract$Target instanceof TravelItineraryRemoveEventContract$Target.Event;
        if (z) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.travel_trip_itinerary_remove_event_subtitle, null, null, 14);
        } else {
            if (!(travelItineraryRemoveEventContract$Target instanceof TravelItineraryRemoveEventContract$Target.Proposal)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.travel_trip_itinerary_remove_suggestion_subtitle, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        f0 f0Var = f0.f322471a;
        if (z) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.travel_trip_itinerary_remove_event_cta, null, null, 14);
        } else {
            if (!(travelItineraryRemoveEventContract$Target instanceof TravelItineraryRemoveEventContract$Target.Proposal)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.travel_trip_itinerary_remove_suggestion_cta, null, null, 14);
        }
        return new cii.b(new e(false, null, null, new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, null, "remove_event_confirm_button", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), f0Var, aVar);
    }
}
