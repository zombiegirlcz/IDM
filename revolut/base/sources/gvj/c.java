package gvj;

import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesContract$InputData;
import java.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelItineraryConfirmEditDatesContract$InputData f147211a;

    public c(TravelItineraryConfirmEditDatesContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f147211a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_trip_itinerary_edit_dates_confirmation_title, null, null, 14);
        int i = R$string.travel_trip_itinerary_edit_dates_confirmation_disclaimer;
        TravelItineraryConfirmEditDatesContract$InputData travelItineraryConfirmEditDatesContract$InputData = this.f147211a;
        long jN = oc.c.N(travelItineraryConfirmEditDatesContract$InputData.f101644b);
        long jN2 = oc.c.N(travelItineraryConfirmEditDatesContract$InputData.f101645c);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.travel_trip_itinerary_edit_dates_confirmation_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "confirm_edit_dates_button", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), f0.f322471a, new lw0.a(textLocalisedClause, new TextLocalisedClause(i, v.k(new TimeRangeClause(jN, jN2, zoneOffset, null, 8), new TimeRangeClause(oc.c.N(travelItineraryConfirmEditDatesContract$InputData.d), oc.c.N(travelItineraryConfirmEditDatesContract$InputData.e), zoneOffset, null, 8)), null, 12), null, null, false, 28));
    }
}
