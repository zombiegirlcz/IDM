package hpl;

import aw0.f;
import aw0.g;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentedClient;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.ConnectedAppRevokeAccessBottomSheetContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectedAppRevokeAccessBottomSheetContract$InputData f154577a;

    public d(ConnectedAppRevokeAccessBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f154577a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_sso_connected_apps_revoke_alert_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_connected_apps_revoke_alert_subtitle, null, null, 14), null, null, false, 28);
        boolean z = false;
        int i = 6;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check_verification, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i);
        int i2 = R$string.revolut_sso_connected_apps_revoke_alert_content_1_v2;
        ConsentedClient consentedClient = this.f154577a.f106723a;
        String str = consentedClient.f105929b;
        List listK = v.k(new RowDelegate.Model("NOTE_1", image24, new TextLocalisedClause(i2, v.k(str, str), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("NOTE_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_revolut_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.revolut_sso_connected_apps_revoke_alert_content_2, u.c(consentedClient.f105929b), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("NOTE_3", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_national_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.revolut_sso_connected_apps_revoke_alert_content_3, u.c(consentedClient.f105929b), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new g(new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25), listK, aVar);
    }
}
