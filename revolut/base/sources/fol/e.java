package fol;

import aw0.f;
import aw0.g;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.sso.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_sso_passkeys_management_delete_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passkeys_management_delete_popup_subtitle, null, null, 14), null, null, false, 28);
        return new cii.b(new g(new n6(new TextLocalisedClause(R$string.revolut_sso_passkeys_management_delete_popup_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.revolut_sso_passkeys_management_delete_popup_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_DELETE_CONFIRM", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (Clause) null, (f) null, 25), f0.f322471a, aVar);
    }
}
