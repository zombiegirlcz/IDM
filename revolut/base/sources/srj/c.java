package srj;

import dj0.d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static trj.a a(d spentBudgetMoney, qzi.a budget, i3 category) {
        Intrinsics.checkNotNullParameter(budget, "budget");
        Intrinsics.checkNotNullParameter(spentBudgetMoney, "spentBudgetMoney");
        Intrinsics.checkNotNullParameter(category, "category");
        d dVar = budget.f250648c;
        d dVarH = pyd.c.H(dVar, spentBudgetMoney);
        Intrinsics.checkNotNullParameter(dVarH, "<this>");
        long j2 = dVarH.f115082a;
        if (j2 < 0) {
            j2 = 0;
        }
        d dVar2 = new d(j2, dVarH.f115083b);
        d dVarH2 = pyd.c.H(spentBudgetMoney, dVar);
        Intrinsics.checkNotNullParameter(dVarH2, "<this>");
        long j3 = dVarH2.f115082a;
        if (j3 < 0) {
            j3 = 0;
        }
        d dVar3 = new d(j3, dVarH2.f115083b);
        LocalDate localDate = budget.e;
        LocalDate localDate2 = budget.f;
        int days = Days.daysBetween(localDate, localDate2).getDays() + 1;
        LocalDate localDateNow = LocalDate.now();
        if (localDateNow.compareTo((ReadablePartial) localDate) > 0 && localDateNow.compareTo((ReadablePartial) localDate2) < 0) {
            int days2 = Days.daysBetween(localDateNow, localDate2).getDays();
            days = days2 < 1 ? 1 : days2;
        }
        int iG = 0;
        boolean z = spentBudgetMoney.compareTo(dVar) > 0;
        long j5 = dVar.f115082a;
        if (j5 != 0) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal scale = bigDecimalValueOf.setScale(2);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j5);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            iG = f.g(bigDecimalMultiply.intValue(), 0, 100);
        }
        return new trj.a(category, z, spentBudgetMoney, dVar, dVar2, dVar3, iG, pyd.c.k(dVar2, days));
    }
}
