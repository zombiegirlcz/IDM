package s2f;

import aw0.f;
import aw0.g;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccountUnlinkingScreenContract$InputData f259308a;

    public e(TradeRevPointsAccountUnlinkingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f259308a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.miles_providers_unlink_account_title, null, null, 14), new TextLocalisedClause(R$string.miles_providers_unlink_account_message, u.c(this.f259308a.f91180c), null, 12), null, null, false, 28);
        f0 f0Var = f0.f322471a;
        m6 m6Var = n6.Companion;
        return new cii.b(new g(m6.c(m6Var, new TextLocalisedClause(R$string.miles_providers_unlink_account_button_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.miles_providers_unlink_account_button_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "UNLINK_ACCOUNT_CONFIRMATION_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (f) null, 25), f0Var, aVar);
    }
}
