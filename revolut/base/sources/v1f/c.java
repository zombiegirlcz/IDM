package v1f;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.trade_rev_points.api.R$plurals;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rd0.d;
import u2f.k;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static TextLocalisedClause a(k unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        switch (b.f285305a[unit.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.trade_rev_points_common_miles_currency, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.miles_common_avios, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.trade_rev_points_common_hilton_honors_points, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.trade_rev_points_common_accor_reward_points, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.trade_rev_points_common_i_prefer_points, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.trade_rev_points_common_euro_star_points, null, null, 14);
            case 7:
            case 8:
                return new TextLocalisedClause(R$string.trade_rev_points_common_point, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static BigDecimal b(TradeRevPointsRate tradeRevPointsRate) {
        try {
            return new BigDecimal(tradeRevPointsRate.d.f91193a);
        } catch (NumberFormatException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, j6.a.q("Parsing of points error: ", tradeRevPointsRate.d.f91193a), e, h0Var);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.h(bigDecimal);
            return bigDecimal;
        }
    }

    public static BigDecimal c(TradeRevPointsRate tradeRevPointsRate) {
        try {
            return new BigDecimal(tradeRevPointsRate.d.f91194b);
        } catch (NumberFormatException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, j6.a.q("Parsing of programme points error: ", tradeRevPointsRate.d.f91194b), e, h0Var);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.h(bigDecimal);
            return bigDecimal;
        }
    }

    public static Clause d(k unit, int i, Custom custom) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return e(unit, new NumberClause(bigDecimalValueOf, NumberClause.Format.Default.f57900a, null, null, 12), Integer.valueOf(i), custom);
    }

    public static Clause e(k kVar, Clause clause, Number number, Style style) {
        switch (b.f285305a[kVar.ordinal()]) {
            case 1:
                return new TextLocalisedQuantityClause(R$plurals.trade_rev_points_common_miles_amount, number, u.c(clause), style, 8);
            case 2:
                return new TextLocalisedClause(R$string.trade_rev_points_common_avios_amount, u.c(clause), style, 8);
            case 3:
                return new TextLocalisedQuantityClause(R$plurals.trade_rev_points_common_hilton_hotel_points_amount, number, u.c(clause), style, 8);
            case 4:
                return new TextLocalisedQuantityClause(R$plurals.trade_rev_points_common_accor_reward_points_amount, number, u.c(clause), style, 8);
            case 5:
                return new TextLocalisedQuantityClause(R$plurals.trade_rev_points_common_i_prefer_points_amount, number, u.c(clause), style, 8);
            case 6:
                return new TextLocalisedQuantityClause(R$plurals.trade_rev_points_common_euro_star_points_amount, number, u.c(clause), style, 8);
            case 7:
            case 8:
                return new TextLocalisedQuantityClause(R$plurals.trade_rev_points_common_point_amount, number, u.c(clause), style, 8);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static CompositeClause f(TradeRevPointsRate rate, a format, Custom custom) {
        Custom custom2;
        TextLocalisedQuantityClause textLocalisedQuantityClauseR;
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalB = b(rate);
        BigDecimal bigDecimalC = c(rate);
        TextClause textClause = new TextClause(rate.d.f91194b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = b.f285306b[format.ordinal()];
        if (i == 1) {
            custom2 = custom;
            textLocalisedQuantityClauseR = nub.a.r(bigDecimalB, custom2, o9.NON_SENSITIVE, 2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClauseR = new TextLocalisedQuantityClause(R$plurals.trade_rev_points_trade_currency_rev_points, bigDecimalB, u.c(nub.a.j(bigDecimalB, o9.NON_SENSITIVE, 3)), custom, 8);
            custom2 = custom;
        }
        List listK = v.k(textLocalisedQuantityClauseR, e(rate.f91192c, textClause, bigDecimalC, custom2));
        m70.a.d(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom2, null, 8);
    }
}
