package wul;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.trading.orders.R$string;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements xul.n {
    @Override // xul.n
    public final Clause a(r0 orderType, bfl.g tradeSide, String symbol) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        int i5 = b.f300225a[orderType.ordinal()];
        if (i5 == 1) {
            int i6 = b.f300226b[tradeSide.ordinal()];
            if (i6 == 1) {
                i = R$string.trading_orders_type_selector_stop_buy_description;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_orders_type_selector_stop_sell_description;
            }
            return new TextLocalisedClause(i, u.c(symbol), null, 12);
        }
        if (i5 == 2) {
            int i21 = b.f300226b[tradeSide.ordinal()];
            if (i21 == 1) {
                i2 = R$string.trading_orders_type_selector_limit_buy_description;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.trading_orders_type_selector_limit_sell_description;
            }
            return new TextLocalisedClause(i2, u.c(symbol), null, 12);
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return new TextLocalisedClause(R$string.trading_orders_type_selector_recurring_buy_description, u.c(symbol), null, 12);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i22 = b.f300226b[tradeSide.ordinal()];
        if (i22 == 1) {
            i3 = R$string.trading_orders_type_selector_market_buy_description;
        } else {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$string.trading_orders_type_selector_market_sell_description;
        }
        return new TextLocalisedClause(i3, u.c(symbol), null, 12);
    }

    @Override // xul.n
    public final LayeredImage b(bfl.g tradeSide, r0 orderType) {
        int i;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        int i2 = b.f300225a[orderType.ordinal()];
        if (i2 == 1) {
            int i3 = b.f300226b[tradeSide.ordinal()];
            if (i3 == 1) {
                i = R$drawable.uikit_icn_24_order_upwards;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_order_downwards;
            }
        } else if (i2 == 2) {
            int i5 = b.f300226b[tradeSide.ordinal()];
            if (i5 == 1) {
                i = R$drawable.uikit_icn_24_order_downwards;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_order_upwards;
            }
        } else if (i2 == 3) {
            i = R$drawable.uikit_icn_24_market_order;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_calendar_recurring;
        }
        int i6 = i;
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i6, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32);
    }

    @Override // xul.n
    public final Clause c(r0 orderType, Custom custom) {
        int i;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i2 = b.f300225a[orderType.ordinal()];
        if (i2 == 1) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_stop_order;
        } else if (i2 == 2) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_limit_order;
        } else if (i2 == 3) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_market_order;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order;
        }
        return new TextLocalisedClause(i, null, custom, 10);
    }
}
