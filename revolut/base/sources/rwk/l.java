package rwk;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f257992a;

    public l(e valuesCalculator, o stepCalculator) {
        Intrinsics.checkNotNullParameter(valuesCalculator, "valuesCalculator");
        Intrinsics.checkNotNullParameter(stepCalculator, "stepCalculator");
        this.f257992a = stepCalculator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final ArrayList a(f chartInfo, BigDecimal bigDecimal) {
        ?? C;
        MoneyClause moneyClause;
        Object numberClause;
        Intrinsics.checkNotNullParameter(chartInfo, "chartInfo");
        Intrinsics.checkNotNullParameter(chartInfo, "chartInfo");
        BigDecimal max = chartInfo.e;
        BigDecimal min = chartInfo.d;
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(min, "min");
        BigDecimal bigDecimalSubtract = max.subtract(min);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (Intrinsics.f(bigDecimalSubtract, bigDecimal2) || bigDecimal == null) {
            C = u.c(bigDecimal2);
        } else {
            BigDecimal bigDecimalMultiply = min.divide(bigDecimal, 0, RoundingMode.FLOOR).multiply(bigDecimal);
            BigDecimal bigDecimalMultiply2 = max.divide(bigDecimal, 0, RoundingMode.CEILING).multiply(bigDecimal);
            C = new ArrayList();
            while (bigDecimalMultiply.compareTo(bigDecimalMultiply2) <= 0) {
                C.add(bigDecimalMultiply);
                bigDecimalMultiply = bigDecimalMultiply.add(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "add(...)");
            }
        }
        Iterable<BigDecimal> iterable = (Iterable) C;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (BigDecimal bigDecimal3 : iterable) {
            Float fValueOf = Float.valueOf(bigDecimal3.floatValue());
            k kVar = chartInfo.f257987c;
            if (kVar.equals(h.f257989a)) {
                numberClause = new PercentageClause(bigDecimal3, (PercentageClause.Format) null, (Style) null, 6);
            } else if (kVar.equals(j.f257991a)) {
                numberClause = new NumberClause(bigDecimal3, null, null, null, 14);
            } else {
                if (kVar instanceof g) {
                    moneyClause = new MoneyClause(new dj0.d(bigDecimal3.longValue(), ((g) kVar).f257988a), new MoneyClause.Format.Shorts(false, 55), null, null, 12);
                } else {
                    if (!(kVar instanceof i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyClause = new MoneyClause(mif.a.Q(new ej0.b(bigDecimal3, ((i) kVar).f257990a)), new MoneyClause.Format.Shorts(false, 55), null, null, 12);
                }
                numberClause = moneyClause;
            }
            arrayList.add(new Pair(fValueOf, numberClause));
        }
        return arrayList;
    }
}
