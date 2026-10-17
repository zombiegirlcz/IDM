package lsl;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d9.e1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul.o f199716a;

    public q(wul.o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f199716a = tradingOrderMapper;
    }

    public static CellDetailsDelegate.Model a(InvestCommodityOrder commodityOrder, dj0.d counterAmount) {
        int i;
        Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
        Intrinsics.checkNotNullParameter(counterAmount, "counterAmount");
        int i2 = p.f199715b[commodityOrder.f104511h.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_commodities_order_flow_common_cell_cost;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_commodities_order_flow_common_cell_proceeds;
        }
        return new CellDetailsDelegate.Model("COMMODITY_ORDER_DETAILS_COUNTER_AMOUNT", new TextLocalisedClause(i, null, null, 14), new MoneyClause(counterAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model b(dj0.d orderAmount) {
        Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
        return new CellDetailsDelegate.Model("COMMODITY_ORDER_DETAILS_ESTIMATED_AMOUNT", new TextLocalisedClause(R$string.wealth_invest_orders_common_cell_estimated_amount, null, null, 14), new MoneyClause(orderAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static qv0.i c(InvestCommodityOrder commodityOrder, ChargeBreakdown chargeBreakdown) {
        Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
        Intrinsics.checkNotNullParameter(chargeBreakdown, "chargeBreakdown");
        List list = chargeBreakdown.f104723b;
        Amount amount = chargeBreakdown.f104722a;
        if (list.isEmpty()) {
            return new CellDetailsDelegate.Model("COMMODITY_ORDER_DETAILS_FEES", new TextLocalisedClause(R$string.market_data_transaction_breakdown_fees, null, null, 14), new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        if (e1.I(amount.f104717a)) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.market_data_transaction_breakdown_fees, null, null, 14);
            Amount amountD = d(chargeBreakdown, ((xi0.b) commodityOrder.k.f186386b).f306286a);
            return new CellDetailsDelegate.Model("COMMODITY_ORDER_DETAILS_FEES", textLocalisedClause, e4i.c.a(amountD == null ? amount : amountD, null, null, null, null, null, 63), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        Amount amountD2 = d(chargeBreakdown, ((xi0.b) commodityOrder.k.f186386b).f306286a);
        Clause clauseA = e4i.c.a(amountD2 == null ? amount : amountD2, null, null, null, null, null, 63);
        int i = p.f199714a[commodityOrder.f104512j.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            clauseA = new TextLocalisedClause(R$string.wealth_trade_list_fee_up_to_format, u.c(clauseA), null, 12);
        }
        return new CellDetailsActionDelegate.Model("COMMODITY_ORDER_DETAILS_FEES", new TextLocalisedClause(R$string.market_data_transaction_breakdown_fees, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clauseA, null, false, false, null, null, chargeBreakdown, 0, 0, 0, 0, 4192228);
    }

    public static Amount d(ChargeBreakdown chargeBreakdown, String str) {
        Asset asset;
        Amount amount = chargeBreakdown.f104724c;
        Amount amount2 = chargeBreakdown.f104722a;
        if (Intrinsics.f((amount == null || (asset = amount.f104718b) == null) ? null : asset.f104720b, str)) {
            return amount;
        }
        if (Intrinsics.f(amount2.f104718b.f104720b, str)) {
            return amount2;
        }
        return null;
    }
}
