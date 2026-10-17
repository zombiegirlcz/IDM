package wul;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.trading.orders.R$string;
import java.util.List;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements xul.n {
    public static Clause d(Integer num) {
        if (num != null) {
            return new TextLocalisedClause(num.intValue(), null, null, 14);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // xul.n
    public final Clause a(r0 orderType, bfl.g tradeSide, String symbol) throws Throwable {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        int i = f.f300233a[orderType.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R$string.trading_orders_type_selector_one_time_investment_description);
        } else if (i != 2) {
            hx7.e.n(new IllegalStateException(orderType + " is not supported"));
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(R$string.trading_orders_type_selector_recurring_buy_short_description);
        }
        return d(numValueOf);
    }

    @Override // xul.n
    public final LayeredImage b(bfl.g tradeSide, r0 orderType) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        int i2 = f.f300233a[orderType.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_line_chart;
        } else if (i2 != 2) {
            hx7.e.n(new IllegalStateException(orderType + " is not supported"));
            i = R$drawable.uikit_icn_24_line_chart;
        } else {
            i = R$drawable.uikit_icn_24_calendar_recurring;
        }
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32);
    }

    @Override // xul.n
    public final Clause c(r0 orderType, Custom custom) throws Throwable {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i = f.f300233a[orderType.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R$string.trading_orders_type_selector_one_time_investment_title);
        } else if (i != 2) {
            hx7.e.n(new IllegalStateException(orderType + " is not supported"));
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order);
        }
        return d(numValueOf);
    }
}
