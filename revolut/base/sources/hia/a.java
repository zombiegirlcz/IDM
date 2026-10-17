package hia;

import akg.n;
import com.revolut.core.model.account.AccountId;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjuster;
import kia.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import lia.d;
import ria.a;
import w4l.h;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    static n a(a aVar) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        oia.a aVar2 = (oia.a) aVar;
        d dVar = aVar2.f225590a;
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        sia.a aVar3 = aVar2.f225592c;
        kia.a aVarB = kia.a.DAY;
        e eVar = aVar3.f263533a;
        Object period = a.C1405a.f254571a;
        Intrinsics.checkNotNullParameter(period, "period");
        f fVar = (f) eVar;
        LocalDate localDateE = fVar.e();
        a.b bVar = a.b.f254572a;
        boolean zEquals = period.equals(bVar);
        a.d dVar2 = a.d.f254574a;
        a.c cVar = a.c.f254573a;
        if (zEquals) {
            DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
            pair2 = new Pair(localDateE.with((TemporalAdjuster) dayOfWeek), localDateE.with((TemporalAdjuster) dayOfWeek).plusDays(6L));
        } else {
            if (period.equals(period)) {
                pair = new Pair(localDateE.withDayOfMonth(1), sia.a.a(localDateE));
            } else if (period.equals(cVar)) {
                pair = new Pair(localDateE.withDayOfYear(1), localDateE.withDayOfYear(1).plusDays(((long) YearMonth.of(localDateE.getYear(), localDateE.getMonth()).lengthOfYear()) - 1));
            } else {
                if (!period.equals(dVar2)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(localDateE.withDayOfMonth(1).minusMonths(5L).withDayOfMonth(1), sia.a.a(localDateE));
            }
            pair2 = pair;
        }
        LocalDate periodStartDate = (LocalDate) pair2.f186385a;
        LocalDate localDate = (LocalDate) pair2.f186386b;
        Intrinsics.h(periodStartDate);
        Intrinsics.h(localDate);
        b bVar2 = new b(periodStartDate, localDate, aVarB == null ? sia.a.b() : aVarB, fVar.a(), null);
        vkm.d dVarB = rd0.e.b(aVar2.f225591b.J(AccountId.Personal.f51414a, loadingStrategy));
        lia.f fVar2 = (lia.f) dVar;
        n nVarA = fVar2.a(bVar2, loadingStrategy);
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(periodStartDate, "periodStartDate");
        if (period.equals(bVar)) {
            LocalDate localDatePlusDays = periodStartDate.plusDays((-1) * ((long) 7));
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            DayOfWeek dayOfWeek2 = DayOfWeek.MONDAY;
            LocalDate localDateWith = localDatePlusDays.with((TemporalAdjuster) dayOfWeek2);
            Intrinsics.h(localDateWith);
            pair3 = new Pair(localDateWith, localDateWith.with((TemporalAdjuster) dayOfWeek2).plusDays(6L));
        } else if (period.equals(period)) {
            LocalDate localDatePlusMonths = periodStartDate.plusMonths(-1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
            LocalDate localDateWithDayOfMonth = localDatePlusMonths.withDayOfMonth(1);
            Intrinsics.h(localDateWithDayOfMonth);
            pair3 = new Pair(localDateWithDayOfMonth, sia.a.a(localDateWithDayOfMonth));
        } else if (period.equals(dVar2)) {
            LocalDate localDatePlusMonths2 = periodStartDate.plusMonths((-1) * ((long) 6));
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths2, "plusMonths(...)");
            LocalDate localDateWithDayOfMonth2 = localDatePlusMonths2.withDayOfMonth(1);
            LocalDate localDatePlusMonths3 = localDateWithDayOfMonth2.plusMonths(5L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths3, "plusMonths(...)");
            pair3 = new Pair(localDateWithDayOfMonth2, sia.a.a(localDatePlusMonths3));
        } else {
            if (!period.equals(cVar)) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDate localDatePlusYears = periodStartDate.plusYears(-1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
            LocalDate localDateWithDayOfYear = localDatePlusYears.withDayOfYear(1);
            Intrinsics.h(localDateWithDayOfYear);
            pair3 = new Pair(localDateWithDayOfYear, localDateWithDayOfYear.withDayOfYear(1).plusDays(((long) YearMonth.of(localDateWithDayOfYear.getYear(), localDateWithDayOfYear.getMonth()).lengthOfYear()) - 1));
        }
        LocalDate localDate2 = (LocalDate) pair3.f186385a;
        LocalDate localDate3 = (LocalDate) pair3.f186386b;
        Intrinsics.h(localDate2);
        Intrinsics.h(localDate3);
        if (aVarB == null) {
            aVarB = sia.a.b();
        }
        return nim.a.v(u0.i(dVarB, nVarA, fVar2.a(new b(localDate2, localDate3, aVarB, fVar.a(), null), loadingStrategy)), new ofg.a(aVar2, bVar2, 10));
    }
}
