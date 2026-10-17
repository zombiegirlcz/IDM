package i7b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoStatusBanner;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f159222a;

    public a(c7b.a iconsMapper) {
        Intrinsics.checkNotNullParameter(iconsMapper, "iconsMapper");
        this.f159222a = iconsMapper;
    }

    public final koi.j a(CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner, CobrandedCardsPlanHubInfoBannerAction cobrandedCardsPlanHubInfoBannerAction, CobrandedCardsPlanHubScreenContract$ActionBannerPayload cobrandedCardsPlanHubScreenContract$ActionBannerPayload, int i) {
        com.revolut.core.ui_kit.delegates.m mVar;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(cobrandedCardsPlanHubInfoBannerAction.f82343b), null, 12);
        ActionWidgetDelegate.Model.a iVar = cobrandedCardsPlanHubInfoStatusBanner.d ? new com.revolut.core.ui_kit.delegates.i(14, textLocalisedClause, null, false) : new com.revolut.core.ui_kit.delegates.j(textLocalisedClause, null, 14);
        TextClause textClause = new TextClause(cobrandedCardsPlanHubInfoStatusBanner.f82406a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = cobrandedCardsPlanHubInfoStatusBanner.f82407b;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str2 = cobrandedCardsPlanHubInfoStatusBanner.f82408c;
        if (str2 != null) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int iB = this.f159222a.b(str2);
            boolean z = cobrandedCardsPlanHubInfoStatusBanner.d;
            mVar = new com.revolut.core.ui_kit.delegates.m(companion.i(iB, z ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorStatusWarning, z ? R$attr.uikit_colorAccentNeutral_10 : R$attr.uikit_colorStatusWarning_10), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10);
        } else {
            mVar = null;
        }
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("list_id_action_banner", textClause, textClause2, mVar, null, iVar, null, cobrandedCardsPlanHubScreenContract$ActionBannerPayload, null, false, 8016);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
