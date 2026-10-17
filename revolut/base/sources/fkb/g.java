package fkb;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.savings.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(new cii.a(new lw0.a(new TextLocalisedClause(R$string.savings_challenge_manage_pause_title, null, null, 14), new TextLocalisedClause(R$string.savings_challenge_manage_pause_description, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.savings_challenge_manage_pause_cta_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CHALLENGE_PAUSE_NOW_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (aw0.f) null, 25)));
    }
}
