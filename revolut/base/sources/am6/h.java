package am6;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevokeConsentBottomSheetScreenContract$InputData f6291a;

    public h(RevokeConsentBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f6291a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_consents_revoke_consent_title, null, null, 14);
        int i = R$string.open_banking_consents_revoke_consent_subtitle;
        RevokeConsentBottomSheetScreenContract$InputData revokeConsentBottomSheetScreenContract$InputData = this.f6291a;
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, u.c(new TextClause(revokeConsentBottomSheetScreenContract$InputData.f72813a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28);
        List listK = v.k(new RowDelegate.Model("LIST_ID_CONSENT_REVOKE_INFO_IMPACT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.open_banking_consents_revoke_consent_bullet_point_impact_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_consents_revoke_consent_bullet_point_impact_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_CONSENT_REVOKE_INFO_SHARED_DATA", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.open_banking_consents_revoke_consent_bullet_point_shared_data_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_consents_revoke_consent_bullet_point_shared_data_subtitle, u.c(new TextClause(revokeConsentBottomSheetScreenContract$InputData.f72813a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.g(new n6(new TextLocalisedClause(R$string.open_banking_consent_revoke_dialog_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.open_banking_consent_revoke_dialog_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), listK, aVar);
    }
}
