package csl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$plurals;
import com.revolut.trading.orders.R$string;
import java.time.ZonedDateTime;
import java.util.List;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f108537a;

    public g(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f108537a = dateProvider;
    }

    @Override // csl.e
    public final t a(hel.b tradingContext, TradingAccount tradingAccount) {
        List listC0;
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        boolean z = false;
        if (tradingAccount != null && (listC0 = tradingAccount.c0()) != null && com.revolut.shared.feature.wealth.models.trading_accounts.b.d(listC0)) {
            z = true;
        }
        hel.b bVar = hel.b.EEA;
        return new t(new TextLocalisedClause(R$string.trading_orders_settlement_date_title, null, null, 14), new TextLocalisedClause((tradingContext == bVar && z) ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_jisa_text_rseuab : tradingContext == bVar ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_text_rseuab : z ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_jisa_text_other : com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_text_other, null, null, 14), null, 28);
    }

    @Override // csl.e
    public final t b(ZonedDateTime expirationDate, r0 tradingOrderType) {
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(tradingOrderType, "tradingOrderType");
        int i = R$string.trading_orders_expiry_dialog_title;
        long jI = pu7.a.I(expirationDate);
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(new TimeClause(jI, dateMedium, null, null, 12)), null, 12);
        TimeClause timeClause = new TimeClause(pu7.a.I(expirationDate), dateMedium, null, null, 12);
        long jH = ebm.a.h(((l80.f) this.f108537a).k(), expirationDate);
        int i2 = f.f108536a[tradingOrderType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            throw new IllegalStateException("Unsupported");
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (jH <= 0) {
                textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_expiry_dialog_info_stop_order_today, u.c(timeClause), null, 12);
            } else {
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.trading_orders_expiry_dialog_info_stop_order_future_plural_days, Long.valueOf(jH), v.k(Long.valueOf(jH), timeClause), (Style) null, 24);
                textLocalisedClause = textLocalisedQuantityClause;
            }
        } else if (jH <= 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_expiry_dialog_info_limit_order_today, u.c(timeClause), null, 12);
        } else {
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.trading_orders_expiry_dialog_info_limit_order_future_plural_days, Long.valueOf(jH), v.k(Long.valueOf(jH), timeClause), (Style) null, 24);
            textLocalisedClause = textLocalisedQuantityClause;
        }
        return new t(textLocalisedClause2, textLocalisedClause, null, 28);
    }
}
