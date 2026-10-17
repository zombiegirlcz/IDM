package u2i;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    public static Pair c(n0i.a aVar) {
        TextLocalisedClause textLocalisedClause;
        int i = aVar.f211045c ? R$string.fx_orders_current_price_explanation_dialog_title : R$string.fx_orders_price_explanation_dialog_title;
        CryptoPeggedPair cryptoPeggedPair = aVar.d;
        wd6.h hVar = aVar.f211043a;
        wd6.e eVar = aVar.f211044b;
        wd6.h hVar2 = wd6.h.MARKET;
        if (hVar == hVar2 && cryptoPeggedPair != null) {
            xi0.b bVar = cryptoPeggedPair.f70777a;
            int i2 = R$string.fx_orders_cryptobuysell_stablecoin_explanation_dialog_description;
            Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(new CurrencyClause(bVar, ticker, null, 4), new CurrencyClause(bVar, ticker, null, 4), new MoneyClause(new dj0.d(100L, cryptoPeggedPair.f70778b), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_PRICE_EXPLANATION_TEXT_ID", false), 10)), custom, 8);
        } else if (hVar == hVar2 || hVar == wd6.h.TAKE_PROFIT_STOP_LOSS) {
            textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_cryptobuysell_price_explanation_dialog_description, zhm.u.c(new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_PRICE_EXPLANATION_TEXT_ID", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        } else if (hVar == wd6.h.LIMIT) {
            textLocalisedClause = a(eVar == wd6.e.BUY ? R$string.fx_orders_current_buy_price_explanation_dialog_description : R$string.fx_orders_current_sell_price_explanation_dialog_description);
        } else {
            if (hVar != wd6.h.STOP) {
                if (hVar == wd6.h.TAKE_PROFIT || hVar == wd6.h.STOP_LOSS) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not expected to get price dialog for tpsl type of order");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    return new Pair(null, null);
                }
                if (hVar == wd6.h.RECURRING) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Not expected to get price dialog for recurring type of order");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                    return new Pair(null, null);
                }
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Unknown order type: " + hVar);
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                return new Pair(null, null);
            }
            textLocalisedClause = a(eVar == wd6.e.BUY ? R$string.fx_orders_current_buy_price_stop_order_explanation_dialog_description : R$string.fx_orders_current_sell_price_stop_order_explanation_dialog_description);
        }
        return new Pair(Integer.valueOf(i), textLocalisedClause);
    }

    public final rp0.y b(n0i.a cryptoPriceDialogData) {
        Intrinsics.checkNotNullParameter(cryptoPriceDialogData, "cryptoPriceDialogData");
        Pair pairC = c(cryptoPriceDialogData);
        Integer num = (Integer) pairC.f186385a;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) pairC.f186386b;
        if (num == null || textLocalisedClause == null) {
            return null;
        }
        int iIntValue = num.intValue();
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("CRYPTO_PRICE_EXPLANATION_TEXT_ID", (UrlImage) null, (Clause) null, textLocalisedClause, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 30698);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CRYPTO_PRICE_EXPLANATION_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), false, null, null, null, null, 744);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new rp0.y(zhm.v.k(model, model2), new rp0.t(new TextLocalisedClause(iIntValue, null, null, 14), null, null, 30), null, null, null, null, "CRYPTO_PRICE_ORDER_DIALOG_DELEGATES_KEY", null, null, null, 3836);
    }
}
