package p1i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    public static AssetClause a(Amount amount) {
        return new AssetClause(amount.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount.f104718b.f104720b, null, o9.NON_SENSITIVE, 8);
    }

    public final y b(Amount original) {
        Intrinsics.checkNotNullParameter(original, "original");
        t tVar = new t(new TextLocalisedClause(R$string.fx_orders_marketorder_fx_brl_limit_max_order_dialog_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_marketorder_fx_brl_limit_max_order_dialog_description, u.c(a(original)), null, 12), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i2, i2, 496)), tVar, null, null, null, null, 1020);
    }

    public final y c(Amount limit, Amount current) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(current, "current");
        Amount amountU = a.a.u(limit, current);
        BigDecimal bigDecimal = amountU.f104717a;
        BigDecimal ZERO = BigDecimal.ZERO;
        if (bigDecimal.compareTo(ZERO) < 0) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            amountU = Amount.a(amountU, ZERO);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_marketorder_fx_brl_limit_usage_dialog_title, null, null, 14);
        List listK = v.k(new TextLocalisedClause(R$string.fx_orders_marketorder_fx_brl_limit_usage_dialog_new_description_deeplink, v.k(a(limit), a(amountU)), null, 12), new HtmlLocalisedClause(R$string.fx_orders_marketorder_fx_brl_limit_usage_dialog_new_description_deeplink_more_details, (List) null, (Integer) null, (Object) null, 30));
        m70.a.t(t0.f186434a);
        t tVar = new t(textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause2, false, null, null, i, i, i2, i2, 496)), tVar, null, null, null, null, 1020);
    }

    public final y d(Amount limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        t tVar = new t(new TextLocalisedClause(R$string.fx_orders_market_order_limit_mx_balance_dialog_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_market_order_limit_mx_balance_dialog_description, u.c(a(limit)), null, 12), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i2, i2, 496)), tVar, null, null, null, null, 1020);
    }

    public final y e() {
        t tVar = new t(new TextLocalisedClause(R$string.fx_not_dealing_sheet_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.fx_not_dealing_sheet_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ITEM_ID_SUBTITLE_LEARN_MORE", false), 10))), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i2, i2, 496)), tVar, null, null, null, null, 1020);
    }

    public final y f(dj0.d limitMoney) {
        Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
        t tVar = new t(new TextLocalisedClause(R$string.fx_orders_marketorder_crypto_limit_dialog_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_marketorder_crypto_limit_dialog_message, u.c(new MoneyClause(limitMoney, new MoneyClause.Format.Asset(0), null, null, 12)), null, 12), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14);
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp24;
        return new y(u.c(new LargeActionButtonDelegate.Model("LIMIT_EXCEEDED_DIALOG_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i2, i, i, 496)), tVar, null, null, null, null, 1020);
    }
}
