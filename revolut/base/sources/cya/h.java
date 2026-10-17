package cya;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static ActionsBottomSheetController a(AdditionalInfo additionalInfo) {
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.referrals_invite_details_additional_info_title, u.c(additionalInfo.f81711a), null, 12), null, null, null, false, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.referrals_invite_details_additional_info_subtitle, u.c(additionalInfo.f81712b), new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 8);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 value = k9.Referrals;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), (AnalyticsContext) null, textLocalisedClause));
    }
}
