package mlh;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ActionsBottomSheetController a(xi0.b currentCashHoldingCurrency, xi0.b alternativeCashHoldingCurrency) {
        Intrinsics.checkNotNullParameter(currentCashHoldingCurrency, "currentCashHoldingCurrency");
        Intrinsics.checkNotNullParameter(alternativeCashHoldingCurrency, "alternativeCashHoldingCurrency");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_invest_product_chooser_product_item_cash_holding_margin_disabled_title, u.c(new CurrencyClause(currentCashHoldingCurrency, null, null, 6)), null, 12), new TextLocalisedClause(R$string.wealth_invest_product_chooser_product_item_cash_holding_margin_disabled_description, v.k(new CurrencyClause(alternativeCashHoldingCurrency, null, null, 6), new CurrencyClause(currentCashHoldingCurrency, null, null, 6)), null, 12), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
