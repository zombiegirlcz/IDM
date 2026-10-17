package qyi;

import aw0.e;
import aw0.h;
import aw0.i;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static i a(boolean z) {
        n6 n6Var = new n6(new TextLocalisedClause(R$string.airport_lounges_refund_bottom_sheet_action_refund, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_LOADING_BUTTON_SUBMIT_REFUND", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        return z ? new h(false, n6Var, new n6(new TextLocalisedClause(R$string.airport_lounges_refund_bottom_sheet_action_assign, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121) : new e(false, null, null, n6Var, null, null, 55);
    }
}
