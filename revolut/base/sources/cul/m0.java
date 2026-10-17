package cul;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.trading.orders.R$plurals;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109136b;

    public /* synthetic */ m0(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, int i) {
        this.f109135a = i;
        this.f109136b = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.f109135a;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109136b;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                aul.b inputMode = (aul.b) rVar.f314201a;
                nel.n instrument = (nel.n) rVar.f314202b;
                k4l.q0 timeInForce = (k4l.q0) rVar.f314203c;
                i0 i0Var = (i0) eVar.o;
                jvl.a aVar = i0Var.f109116a;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                if (io3.h.i(instrument.f214597c)) {
                    int i2 = h0.f109113a[inputMode.ordinal()];
                    if (i2 == 1) {
                        return i0Var.a();
                    }
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nel.d dVarF = ifk.b.f(instrument);
                    return ((mvl.b) aVar).d(dVarF != null ? dVarF.d : null);
                }
                if (io3.h.o(instrument.f214597c)) {
                    int i3 = h0.f109113a[inputMode.ordinal()];
                    if (i3 == 1) {
                        return i0Var.a();
                    }
                    if (i3 == 2) {
                        return ((mvl.b) aVar).e();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (timeInForce != k4l.q0.MARKET_ON_OPEN) {
                    return i0Var.a();
                }
                int i5 = h0.f109113a[inputMode.ordinal()];
                if (i5 == 1) {
                    mvl.b bVar = (mvl.b) aVar;
                    bVar.getClass();
                    return mvl.b.b(new rp0.t(new TextLocalisedClause(R$string.wealth_stock_orders_market_order_quantity_based_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_orders_market_order_quantity_based_unavailable_description, null, null, 14), null, 28), zhm.u.c(bVar.c(R$attr.uikit_dp24)));
                }
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mvl.b bVar2 = (mvl.b) aVar;
                bVar2.getClass();
                return mvl.b.b(new rp0.t(new TextLocalisedClause(R$string.wealth_stock_orders_market_order_quantity_based_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_orders_market_order_amount_based_unavailable_description, null, null, 14), null, 28), zhm.u.c(bVar2.c(R$attr.uikit_dp24)));
            case 1:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                aul.b inputMode2 = (aul.b) pair.f186385a;
                nel.n instrument2 = (nel.n) pair.f186386b;
                i0 i0Var2 = (i0) eVar.o;
                jvl.a aVar2 = i0Var2.f109116a;
                Intrinsics.checkNotNullParameter(instrument2, "instrument");
                Intrinsics.checkNotNullParameter(inputMode2, "inputMode");
                int i6 = h0.f109113a[inputMode2.ordinal()];
                if (i6 == 1) {
                    return i0Var2.a();
                }
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (io3.h.o(instrument2.f214597c)) {
                    return ((mvl.b) aVar2).e();
                }
                if (io3.h.i(instrument2.f214597c)) {
                    nel.d dVarF2 = ifk.b.f(instrument2);
                    return ((mvl.b) aVar2).d(dVarF2 != null ? dVarF2.d : null);
                }
                mvl.b bVar3 = (mvl.b) aVar2;
                bVar3.getClass();
                return mvl.b.b(new rp0.t(new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_dialog_unavailable_for_limit_title, null, null, 14), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_dialog_unavailable_for_limit_description, null, null, 14), null, 28), zhm.u.c(bVar3.c(R$attr.uikit_dp24)));
            case 2:
                bfl.e stockExchange = (bfl.e) obj2;
                ((Boolean) obj3).getClass();
                ((i0) eVar.o).getClass();
                Intrinsics.checkNotNullParameter(stockExchange, "stockExchange");
                Intrinsics.checkNotNullParameter(stockExchange, "stockExchange");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_extended_hours_info_popup_extended_hours, null, null, 14), new CompositeClause(zhm.v.k(new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_orders_extended_hours_info_popup_message, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "LIST_ID_EXTENDED_HOURS_INFO_DIALOG_CLAUSE_LEARN_MORE", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, 28);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_orders_extended_hours_info_popup_regular_hours, null, null, 14);
                CompositeClause compositeClauseA = ovl.a.a(jli.b.g(stockExchange.f15026b), jli.b.g(stockExchange.f15027c));
                int i21 = R$attr.uikit_dp16;
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_ID_REGULAR_MARKET_HOURS", textLocalisedClause, compositeClauseA, null, null, false, 0, null, null, null, null, 0, null, false, null, i21, 0, i21, i21, 196584);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_extended_hours_info_popup_extended_hours, null, null, 14);
                CompositeClause compositeClauseA2 = ovl.a.a(jli.b.g(stockExchange.d), jli.b.g(stockExchange.e));
                int i22 = R$attr.uikit_dp16;
                List listK = zhm.v.k(model, new CellDetailsDelegate.Model("LIST_ID_EXTENDED_MARKET_HOURS", textLocalisedClause2, compositeClauseA2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, i22, i22, 262120));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i32 = R$attr.uikit_dp24;
                int i33 = R$attr.uikit_dp16;
                return new rp0.y(zhm.w.u(zhm.v.k(listK, zhm.u.c(new LargeActionButtonDelegate.Model("LIST_ID_EXTENDED_HOURS_INFO_DIALOG_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause3, false, null, null, i32, i32, i33, i33, 496)))), tVar, null, null, null, null, 1020);
            case 3:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = (FiatExchangeOrderQuoteResult) pair2.f186385a;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair2.f186386b;
                bul.e eVar2 = eVar.B;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteResult, "fiatExchangeOrderQuoteResult");
                Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                return eVar2.a(fiatExchangeOrderQuoteResult.f106842a.f91689a, (OrderQuote) zhm.d0.d0(fiatExchangeOrderQuoteResult.f106843b.f91686a), fiatExchangeOrderQuoteResult.f106842a.f91690b, tradingLegalEntityInformation);
            case 4:
                Pair pair3 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                nel.n instrument3 = (nel.n) pair3.f186385a;
                k4l.e0 orderLimits = (k4l.e0) pair3.f186386b;
                u uVar = eVar.o;
                bfl.g tradeSide = ((v) ((vkm.j2) eVar.m0.f22677a).getValue()).f109175a;
                i0 i0Var3 = (i0) uVar;
                i0Var3.getClass();
                Intrinsics.checkNotNullParameter(instrument3, "instrument");
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
                BigDecimal bigDecimalB = orderLimits.b();
                if (!d9.e1.D(bigDecimalB)) {
                    throw new IllegalStateException("lotQuantity shouldn't be zero");
                }
                BigDecimal bigDecimal = orderLimits.f180957h;
                if (bigDecimal == null) {
                    throw new IllegalArgumentException("minOrderQuantity is expected");
                }
                int iIntValue = bigDecimal.divide(bigDecimalB, 0, RoundingMode.UP).intValue();
                return new rp0.y(zhm.u.c(((mvl.b) i0Var3.f109116a).c(R$attr.uikit_dp24)), new rp0.t(new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_dialog_minimum_order_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_dialog_minimum_order_description, Integer.valueOf(iIntValue), zhm.v.k(Integer.valueOf(iIntValue), new MoneyClause(new dj0.d(orderLimits.e, instrument3.i), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), (Style) null, 24), null, 28), null, null, null, null, 1020);
            default:
                yhm.r rVar2 = (yhm.r) obj2;
                ((Boolean) obj3).getClass();
                return ((Optional) rVar2.f314203c).map(new bpd.a(new c1g.o(eVar, 26, (bfl.g) rVar2.f314201a, (k4l.r0) rVar2.f314202b), 5));
        }
    }
}
