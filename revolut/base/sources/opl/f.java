package opl;

import aw0.h;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.OAuthUserInfo;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectedClientDisconnectBottomSheetContract$InputData f227692a;

    public f(ConnectedClientDisconnectBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f227692a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.revolut_oauth_disconnect_client_title;
        OAuthUserInfo.Client client = this.f227692a.f106734a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, u.c(client.f105949b), null, 12), new TextLocalisedClause(R$string.revolut_oauth_disconnect_client_subtitle, u.c(client.f105949b), null, 12), null, null, false, 28);
        f0 f0Var = f0.f322471a;
        m6 m6Var = n6.Companion;
        return new cii.b(new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.revolut_oauth_disconnect_client_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "DISCONNECT_CONFIRM_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var, new TextLocalisedClause(R$string.revolut_oauth_disconnect_client_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), f0Var, aVar);
    }
}
