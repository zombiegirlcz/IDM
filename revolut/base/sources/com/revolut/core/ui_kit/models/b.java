package com.revolut.core.ui_kit.models;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {
    public static TextClause a() {
        return new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 122);
    }

    public static final CompositeClause b(xi0.b firstCurrency, xi0.b secondCurrency, double d, Custom custom) {
        Intrinsics.checkNotNullParameter(firstCurrency, "firstCurrency");
        Intrinsics.checkNotNullParameter(secondCurrency, "secondCurrency");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return f(firstCurrency, secondCurrency, bigDecimalValueOf, custom, 16);
    }

    public static final CompositeClause c(xi0.b firstCurrency, xi0.b secondCurrency, BigDecimal rate, RateClause.Format rateFormat, Style style, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(firstCurrency, "firstCurrency");
        Intrinsics.checkNotNullParameter(secondCurrency, "secondCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(rateFormat, "rateFormat");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new CompositeClause(zhm.v.k(new MoneyClause(new dj0.d(cp5.d.k(firstCurrency), firstCurrency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, sensitivity, 4), new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new RateClause(rate, secondCurrency, rateFormat, null)), null, style, null, 10);
    }

    public static final CompositeClause d(xi0.b firstCurrency, xi0.b secondCurrency, BigDecimal rate, Style style, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(firstCurrency, "firstCurrency");
        Intrinsics.checkNotNullParameter(secondCurrency, "secondCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return c(firstCurrency, secondCurrency, rate, new RateClause.Format.Default(firstCurrency, true), style, sensitivity);
    }

    public static /* synthetic */ CompositeClause f(xi0.b bVar, xi0.b bVar2, BigDecimal bigDecimal, Style style, int i) {
        if ((i & 8) != 0) {
            style = null;
        }
        return d(bVar, bVar2, bigDecimal, style, o9.NON_SENSITIVE);
    }
}
