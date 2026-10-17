package mlh;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static ActionsBottomSheetController a(kel.b cashHolding, TradingAccount tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
        TextLocalisedClause textLocalisedClause;
        Clause compositeClause;
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_title, null, null, 14);
        if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.GIA) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        hel.b bVar = tradingLegalEntityInformation.f105106a;
        switch (bVar == null ? -1 : b.f206958a[bVar.ordinal()]) {
            case -1:
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description, null, null, 14);
                compositeClause = textLocalisedClause;
                lw0.a aVar = new lw0.a(textLocalisedClause2, compositeClause, null, null, false, 28);
                e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                List listK = v.k(new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_sg, null, null, 14), new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_learn_more, null, new Click(30, (Integer) null, (Object) null, "CASH_HOLDING_AVAILABLE_TO_WITHDRAW_SG_LEARN_MORE_CLICK_ID", false), 10));
                m70.a.t(t0.f186434a);
                compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                lw0.a aVar2 = new lw0.a(textLocalisedClause2, compositeClause, null, null, false, 28);
                e eVar2 = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var2 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            case 5:
                String str = cashHolding.f183148a.e;
                xi0.b.Companion.getClass();
                compositeClause = new TextLocalisedClause(Intrinsics.f(str, xi0.b.i.f306286a) ? R$string.wealth_cash_info_withdrawable_description_eea_usd : R$string.wealth_cash_info_withdrawable_description_eea, null, null, 14);
                lw0.a aVar22 = new lw0.a(textLocalisedClause2, compositeClause, null, null, false, 28);
                e eVar22 = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var22 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator22 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar22, eVar22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var22, "value", k9Var22), null, null, 24));
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_us, null, null, 14);
                compositeClause = textLocalisedClause;
                lw0.a aVar222 = new lw0.a(textLocalisedClause2, compositeClause, null, null, false, 28);
                e eVar222 = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var222 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator222 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar222, eVar222, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var222, "value", k9Var222), null, null, 24));
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_au, null, null, 14);
                compositeClause = textLocalisedClause;
                lw0.a aVar2222 = new lw0.a(textLocalisedClause2, compositeClause, null, null, false, 28);
                e eVar2222 = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var2222 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2222 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2222, eVar2222, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2222, "value", k9Var2222), null, null, 24));
        }
    }

    public static ActionsBottomSheetController b(kel.b cashHolding, TradingAccount tradingAccount) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_unsettled_title, null, null, 14);
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_unsettled_isa_description, null, null, 14);
        } else {
            if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.GIA) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = cashHolding.f183148a.e;
            xi0.b.Companion.getClass();
            textLocalisedClause = Intrinsics.f(str, xi0.b.i.f306286a) ? new TextLocalisedClause(R$string.wealth_cash_info_unsettled_description_usd, null, null, 14) : new TextLocalisedClause(R$string.wealth_cash_info_unsettled_description, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
