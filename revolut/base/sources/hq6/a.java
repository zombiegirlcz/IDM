package hq6;

import aw0.h;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.flexible.staking.consent.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final ActionsBottomSheetController a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_staking_auto_earn_disable_dialog_title, null, null, 14), new TextLocalisedClause(R$string.crypto_staking_auto_earn_disable_dialog_subtitle, null, null, 14), null, null, false, 28);
        m6 m6Var = n6.Companion;
        return new ActionsBottomSheetController(new dii.a(aVar, new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.crypto_staking_auto_earn_disable_dialog_cta_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.crypto_staking_auto_earn_disable_dialog_cta_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), AnalyticsProduct.Shared.Crypto.f, null, null, 24));
    }
}
