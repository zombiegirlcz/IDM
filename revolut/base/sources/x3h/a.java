package x3h;

import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import dj0.d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2h.b;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    @NotNull
    private static final C1678a Companion = new C1678a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NumberClause.Format.FixedDigitsAfterDot f302753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PercentageClause.Format.Custom f302754b;

    /* JADX INFO: renamed from: x3h.a$a, reason: collision with other inner class name */
    public static final class C1678a {
        private C1678a() {
        }
    }

    static {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        wa waVar = wa.SHOW_ALL_ZEROES;
        f302753a = new NumberClause.Format.FixedDigitsAfterDot(2, 8, null, waVar, roundingMode);
        f302754b = new PercentageClause.Format.Custom(2, 4, null, waVar, roundingMode);
    }

    public final Clause a(double d) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d * ((double) 100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return new PercentageClause(bigDecimalValueOf, f302754b, (Style) null, 4);
    }

    public final Clause b(int i, int i2) {
        return new TextLocalisedClause(R$string.wealth_details_section_stats_valueMax, v.k(d(i), d(i2)), null, 12);
    }

    public final Clause c(double d) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return new NumberClause(bigDecimalValueOf, f302753a, null, null, 12);
    }

    public final Clause d(int i) {
        return new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6);
    }

    public final Clause e(long j2) {
        return new NumberClause(j2, (NumberClause.Format.Compact) null, 6);
    }

    public final Clause f(d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new MoneyClause(value, new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4);
    }
}
