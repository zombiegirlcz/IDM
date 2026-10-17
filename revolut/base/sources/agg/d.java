package agg;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.miles.api.R$plurals;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import hfg.t0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static CompositeClause a(t0 unit, int i, Custom custom) {
        Object textLocalisedQuantityClause;
        Intrinsics.checkNotNullParameter(unit, "unit");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        NumberClause numberClause = new NumberClause(bigDecimalValueOf, NumberClause.Format.Default.f57900a, null, null, 12);
        int i2 = c.f4819a[unit.ordinal()];
        if (i2 == 1) {
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.miles_common_miles, Integer.valueOf(i), (List) null, (Style) null, 28);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClause = new TextLocalisedClause(R$string.miles_common_avios, null, null, 14);
        }
        List listK = v.k(numberClause, textLocalisedQuantityClause);
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
    }

    public static CompositeClause b(TravelMilesRate rate, t0 unit, b format, Custom custom) {
        TextLocalisedQuantityClause textLocalisedQuantityClauseR;
        Object textLocalisedQuantityClause;
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rate.f94114c.f94115a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        double d = rate.f94114c.f94116b;
        int i = c.f4820b[format.ordinal()];
        if (i == 1) {
            textLocalisedQuantityClauseR = nub.a.r(bigDecimalValueOf, null, o9.NON_SENSITIVE, 3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClauseR = new TextLocalisedQuantityClause(R$plurals.miles_trade_currency_rev_points, bigDecimalValueOf, u.c(nub.a.j(bigDecimalValueOf, o9.NON_SENSITIVE, 3)), (Style) null, 24);
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        xi0.b.Companion.getClass();
        RateClause rateClause = new RateClause(bigDecimal, xi0.b.f306271c, new RateClause.Format.Default(null, false), null);
        int i2 = c.f4819a[unit.ordinal()];
        if (i2 == 1) {
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.miles_common_miles, Integer.valueOf((int) Math.ceil(d)), (List) null, (Style) null, 28);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClause = new TextLocalisedClause(R$string.miles_common_avios, null, null, 14);
        }
        List listK = v.k(rateClause, textLocalisedQuantityClause);
        kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
        m70.a.t(t0Var);
        List listK2 = v.k(textLocalisedQuantityClauseR, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new CompositeClause(listK2, new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
    }

    public static TextLocalisedClause c(TravelMilesRate rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        return new TextLocalisedClause(R$string.miles_common_points_to_reward_rate, v.k(new NumberClause(rate.f94114c.f94115a, (NumberClause.Format.Compact) null, (Custom) null, 6), new NumberClause(new BigDecimal(rate.f94114c.f94116b), null, null, null, 14)), null, 12);
    }
}
