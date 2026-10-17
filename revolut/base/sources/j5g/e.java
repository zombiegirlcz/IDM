package j5g;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.flights.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.travel_flights_common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TRAVEL_FLIGHTS_CHAT_REDIRECT_CONTINUE", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.travel_flights_booking_details_manage_chat_redirect_contact_support_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_booking_details_manage_chat_redirect_contact_support_description, null, null, 14), null, null, false, 28));
    }
}
