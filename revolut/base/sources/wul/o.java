package wul;

import aw0.ka;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import dfl.o0;
import java.time.Instant;
import java.util.List;
import k4l.q0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.z;
import te0.w;
import wp4.j0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements xul.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f300249a;

    public o(p2b.c cfdMarketPriceCalculator) {
        Intrinsics.checkNotNullParameter(cfdMarketPriceCalculator, "cfdMarketPriceCalculator");
        this.f300249a = w.y0(new wq1.a(19));
    }

    public static Clause c(o0 o0Var, String str) {
        if (o0Var != null) {
            if (Intrinsics.f(str, o0Var.f114446a)) {
                return new TextLocalisedClause(R$string.wealth_trade_info_made_by_you, null, null, 14);
            }
            String str2 = o0Var.f114447b;
            if (str2 == null) {
                str2 = o0Var.f;
            }
            String str3 = str2;
            if (str3 != null) {
                return new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return null;
    }

    public static AssetClause h(ej0.b bVar, Style style, ScaleMode scaleMode) {
        return new AssetClause(bVar.f126703a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, scaleMode, false, false, 5)), bVar.f126704b.f306286a, style, o9.NON_SENSITIVE);
    }

    public static LayeredImage j(bfl.g gVar, r0 r0Var) {
        int i;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = n.f300247c[r0Var.ordinal()];
        if (i2 == 1) {
            int i3 = n.f300246b[gVar.ordinal()];
            if (i3 == 1) {
                i = R$drawable.uikit_icn_24_order_downwards;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_order_upwards;
            }
        } else if (i2 == 2) {
            int i5 = n.f300246b[gVar.ordinal()];
            if (i5 == 1) {
                i = R$drawable.uikit_icn_24_order_upwards;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_order_downwards;
            }
        } else if (i2 == 3) {
            i = R$drawable.uikit_icn_16_status_clock_arrows;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_16_arrow_recurring;
        }
        int i6 = i;
        int i21 = R$attr.uikit_colorAccentNeutral;
        int i22 = R$attr.uikit_colorPopoverBackground;
        return companion.d(i6, i21, i22, Integer.valueOf(i22), 2.0f, 2.0f, Float.valueOf(12.0f));
    }

    public final Clause b(Clause clause, o0 o0Var, String str) {
        Clause clauseC = c(o0Var, str);
        if (clauseC == null) {
            return clause;
        }
        if (clause == null) {
            return clauseC;
        }
        List listK = v.k(clause, clauseC);
        m70.a.a(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final CellDetailsDelegate.Model d(Instant instant) {
        if (instant == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("list_id_next_purchase_cell", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_next_purchase, null, null, 14), new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final CellDetailsDelegate.Model e(sel.a aVar) {
        if (aVar != null) {
            return new CellDetailsDelegate.Model("list_id_repeat_cell", new TextLocalisedClause(R$string.wealth_trading_orders_repeat, null, null, 14), k(aVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }

    public final CellDetailsDelegate.Model f(Instant instant) {
        if (instant == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("list_id_started_on_cell", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_started_on, null, null, 14), new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final CellDetailsDelegate.Model g(dj0.d dVar) {
        if (dVar == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("list_id_total_spent_cell", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_total_spent, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final AvatarNavBarMenuItem i(Data instrument, Data instrumentTicker) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        return AvatarNavBarMenuItem.Companion.a(AvatarNavBarMenuItem.INSTANCE, "list_id_security_image_avatar_nav_bar_menu_item", (Image) iii.c.f(instrument, new wuk.c(6), new wug.k(2), new w2a.o(26)), (CircleBadgeModel) iii.c.f(instrumentTicker, new wuk.c(7), new wug.k(3), new j0(this, 6)), 24);
    }

    public final TextLocalisedClause k(sel.a period) {
        int i;
        Intrinsics.checkNotNullParameter(period, "period");
        int i2 = n.f300248g[period.ordinal()];
        if (i2 == 1) {
            i = com.revolut.trading.orders.R$string.orders_frequency_settings_period_daily;
        } else if (i2 == 2) {
            i = com.revolut.trading.orders.R$string.orders_frequency_settings_period_weekly;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.trading.orders.R$string.orders_frequency_settings_period_monthly;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public final TextLocalisedClause l(bfl.g side, r0 orderType, Clause endClause, Custom custom, z instrumentType) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(endClause, "endClause");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        switch (n.f300245a[instrumentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                int i2 = n.f300246b[side.ordinal()];
                if (i2 == 1) {
                    int i3 = n.f300247c[orderType.ordinal()];
                    if (i3 == 1) {
                        i = R$string.wealth_trading_orders_limit_order_buy_title;
                    } else if (i3 == 2) {
                        i = R$string.wealth_trading_orders_stop_order_buy_title;
                    } else if (i3 == 3) {
                        i = R$string.wealth_trading_orders_market_order_buy_title;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.wealth_trading_orders_recurring_order_buy_title;
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = n.f300247c[orderType.ordinal()];
                    if (i5 == 1) {
                        i = R$string.wealth_trading_orders_limit_order_sell_title;
                    } else if (i5 == 2) {
                        i = R$string.wealth_trading_orders_stop_order_sell_title;
                    } else {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("Sell is not supported for recurring orders.");
                        }
                        i = R$string.wealth_trading_orders_market_order_sell_title;
                    }
                }
                break;
            case 13:
                int i6 = n.f300246b[side.ordinal()];
                if (i6 == 1) {
                    i = R$string.wealth_stock_buy_title;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_stock_sell_title;
                }
                break;
            case 14:
                int i21 = n.f300246b[side.ordinal()];
                if (i21 == 1) {
                    int i22 = n.f300247c[orderType.ordinal()];
                    if (i22 == 1 || i22 == 2) {
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_buy_title;
                    } else if (i22 == 3) {
                        i = R$string.wealth_stock_buy_title;
                    } else {
                        if (i22 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_buy_title;
                    }
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i32 = n.f300247c[orderType.ordinal()];
                    if (i32 == 1 || i32 == 2) {
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_sell_title;
                    } else if (i32 == 3) {
                        i = R$string.wealth_stock_sell_title;
                    } else {
                        if (i32 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_sell_title;
                    }
                }
                break;
            case 15:
                int i33 = n.f300246b[side.ordinal()];
                if (i33 == 1) {
                    int i43 = n.f300247c[orderType.ordinal()];
                    if (i43 == 1 || i43 == 2) {
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_buy_title;
                    } else {
                        if (i43 != 3 && i43 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.wealth_stock_buy_title;
                    }
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i59 = n.f300247c[orderType.ordinal()];
                    if (i59 == 1 || i59 == 2) {
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_sell_title;
                    } else if (i59 == 3) {
                        i = R$string.wealth_stock_sell_title;
                    } else {
                        if (i59 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hx7.e.n(new IllegalStateException(orderType + " is not supported for funds"));
                        i = R$string.wealth_stock_sell_title;
                    }
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, u.c(endClause), custom, 8);
    }

    public final TextLocalisedClause m(q0 timeInForce) {
        int i;
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        int i2 = n.d[timeInForce.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trading_orders_time_in_force_day_short_description;
        } else if (i2 == 2 || i2 == 3) {
            i = R$string.wealth_trading_orders_time_in_force_gtc_short_description;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_orders_time_in_force_market_on_open_short_description;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
