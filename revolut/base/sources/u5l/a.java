package u5l;

import aw0.j7;
import aw0.k7;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import d9.e1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import u80.q;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f277460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f277461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f277462c;
    public static final int d;
    public static final int e;
    public static final DecimalFormat f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecimalFormat f277463g;

    static {
        new TextClause("~", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        f277460a = R$drawable.uikit_icn_10_stocks_arrow_up;
        f277461b = R$drawable.uikit_icn_10_stocks_arrow_down;
        f277462c = R$attr.uikit_colorPerformancePositive;
        d = R$attr.uikit_colorPerformanceNegative;
        e = R$attr.uikit_colorGreyTone50;
        f = new DecimalFormat("0.00'%'");
        f277463g = new DecimalFormat("0'%'");
        new DecimalFormat("+0.00'%';-0.00'%'");
        new DecimalFormat("+0'%';-0'%'");
    }

    public static final List a(ej0.b totalPnl, BigDecimal performancePercent) {
        Intrinsics.checkNotNullParameter(totalPnl, "totalPnl");
        Intrinsics.checkNotNullParameter(performancePercent, "performancePercent");
        BigDecimal bigDecimal = totalPnl.f126703a;
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimal.setScale(2, roundingMode);
        Intrinsics.h(scale);
        if (!e1.D(scale)) {
            scale = null;
        }
        MoneyClause moneyClauseC = scale != null ? c(mif.a.P(totalPnl, 0, 1), k7.ALWAYS, null, null, 6) : null;
        BigDecimal bigDecimalMultiply = performancePercent.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal scale2 = bigDecimalMultiply.setScale(bigDecimalMultiply.abs().compareTo(new BigDecimal(100)) < 0 ? 2 : 0, roundingMode);
        Intrinsics.h(scale2);
        if (!e1.D(scale2)) {
            scale2 = null;
        }
        Clause[] elements = {moneyClauseC, scale2 != null ? xqi.a.b(bigDecimalMultiply, false, 6) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }

    public static MoneyClause b(dj0.d dVar, o9 sensitivity, k7 signShowingPolicy, Style style, int i) {
        if ((i & 1) != 0) {
            sensitivity = o9.SENSITIVE;
        }
        if ((i & 4) != 0) {
            signShowingPolicy = k7.ONLY_NEGATIVE;
        }
        if ((i & 8) != 0) {
            style = null;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(signShowingPolicy, ScaleMode.CryptoHoldingFormat.f51439a, false, false), style, sensitivity);
    }

    public static MoneyClause c(dj0.d dVar, k7 k7Var, j7 j7Var, Custom custom, int i) {
        if ((i & 1) != 0) {
            k7Var = k7.ONLY_NEGATIVE;
        }
        k7 signShowingPolicy = k7Var;
        j7 j7Var2 = (i & 2) != 0 ? null : j7Var;
        Custom custom2 = (i & 4) != 0 ? null : custom;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return new MoneyClause(dVar, j7Var2 == null ? new MoneyClause.Format.Defaults(signShowingPolicy, new ScaleMode.SimpleLen(2, RoundingMode.DOWN), false, false, 4) : new MoneyClause.Format.Headers(signShowingPolicy, new ScaleMode.SimpleLen(2, RoundingMode.DOWN), j7Var2, false, false, 16), custom2, null, 8);
    }

    public static MoneyClause d(BigDecimal bigDecimal, xi0.b currency, k7 signShowingPolicy, Custom custom, o9 sensitivity, int i) {
        if ((i & 4) != 0) {
            signShowingPolicy = k7.ONLY_NEGATIVE;
        }
        if ((i & 8) != 0) {
            custom = null;
        }
        if ((i & 16) != 0) {
            sensitivity = o9.SENSITIVE;
        }
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimal.setScale(2, roundingMode);
        BigDecimal bigDecimalRemainder = scale.remainder(BigDecimal.ONE);
        return new MoneyClause(q.a(scale, currency), new MoneyClause.Format.Defaults(signShowingPolicy, new ScaleMode.SimpleLen(Intrinsics.f(bigDecimalRemainder.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalRemainder.stripTrailingZeros(), BigDecimal.ZERO) ? 0 : 2, roundingMode), false, false), custom, sensitivity);
    }

    public static final AssetClause e(ej0.b bVar, Custom custom) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new AssetClause(bVar.f126703a, new AssetClauseType.Stock(0), cp5.d.J(bVar.f126704b), custom, null, 16);
    }

    public static CompositeClause f(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal scale = bigDecimal.setScale(bigDecimalAbs.compareTo(bigDecimalValueOf) >= 0 ? 0 : 2, RoundingMode.DOWN);
        DecimalFormat decimalFormat = scale.scale() == 2 ? f : f277463g;
        boolean zG = e1.G(scale);
        int i = d;
        int i2 = f277462c;
        ImageClause imageClause = zG ? new ImageClause(f277460a, new ImageClauseTint.Color(i2), (Float) null, (Float) null, 28) : e1.C(scale) ? new ImageClause(f277461b, new ImageClauseTint.Color(i), (Float) null, (Float) null, 28) : null;
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        String str = decimalFormat.format(scale.abs());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (e1.G(scale)) {
            i = i2;
        } else if (!e1.C(scale)) {
            i = e;
        }
        Clause[] elements = {imageClause, new TextClause(str, (Style) new Custom(Integer.valueOf(i), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d.L(elements));
    }

    public static RateClause g(BigDecimal bigDecimal, xi0.b currency, xi0.b referencedCurrency) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        return new RateClause(bigDecimal, currency, new RateClause.Format.Default(referencedCurrency, true), null);
    }
}
