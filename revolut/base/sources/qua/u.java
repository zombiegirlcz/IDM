package qua;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormatter;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f249338a = zhm.v.k(ibd.h.MANUAL_CARD_MANDATE, ibd.h.CARD_MANDATE, ibd.h.PREDEFINED_CARD_MANDATE, ibd.h.BIZUM_MANDATE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f249339b = zhm.v.k(ibd.f.ACTIVE, ibd.f.CONFIRMED);

    public static final boolean A(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249316b == ibd.f.PENDING;
    }

    public static final boolean B(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return A(pVar) || pVar.f249316b == ibd.f.DISCONFIRMED;
    }

    public static final boolean C(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.PIX_MANDATE;
    }

    public static final boolean D(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.V == fva.l.PIX;
    }

    public static final boolean E(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249316b == ibd.f.RAISED;
    }

    public static final boolean F(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        ibd.h hVar = pVar.f249314a.f160152c;
        hVar.getClass();
        ibd.h[] elements = {ibd.h.EXTERNAL, ibd.h.CREDIT_CARD_PAYMENT, ibd.h.CRYPTO, ibd.h.INTERNAL, ibd.h.INTERNAL_CHARITY, ibd.h.YOUTH_ALLOWANCE, ibd.h.SAVINGS_POCKET, ibd.h.VAULT, ibd.h.WALLET, ibd.h.BILL_MONEY_BOX};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(hVar) || D(pVar);
    }

    public static final boolean G(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        ibd.h[] elements = {ibd.h.CARD_MANDATE, ibd.h.MANUAL_CARD_MANDATE, ibd.h.PREDEFINED_CARD_MANDATE, ibd.h.BIZUM_MANDATE, ibd.h.PIX_MANDATE, ibd.h.COBRANDS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(pVar.f249314a.f160152c);
    }

    public static final boolean H(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249316b == ibd.f.SUSPENDED;
    }

    public static final boolean I(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.UAE_BILLS;
    }

    public static final boolean J(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.UPI_MANDATE;
    }

    public static final boolean K(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.UPI;
    }

    public static final tua.c L(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        tua.c cVar = pVar.B;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final tua.d M(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        tua.d dVar = pVar.f249334y;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Period N(fva.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        switch (t.f249337a[eVar.ordinal()]) {
            case 1:
                Period periodWeeks = Period.weeks(1);
                Intrinsics.checkNotNullExpressionValue(periodWeeks, "weeks(...)");
                return periodWeeks;
            case 2:
                Period periodWeeks2 = Period.weeks(2);
                Intrinsics.checkNotNullExpressionValue(periodWeeks2, "weeks(...)");
                return periodWeeks2;
            case 3:
                Period periodMonths = Period.months(1);
                Intrinsics.checkNotNullExpressionValue(periodMonths, "months(...)");
                return periodMonths;
            case 4:
                Period periodMonths2 = Period.months(3);
                Intrinsics.checkNotNullExpressionValue(periodMonths2, "months(...)");
                return periodMonths2;
            case 5:
                Period periodMonths3 = Period.months(6);
                Intrinsics.checkNotNullExpressionValue(periodMonths3, "months(...)");
                return periodMonths3;
            case 6:
                Period periodYears = Period.years(1);
                Intrinsics.checkNotNullExpressionValue(periodYears, "years(...)");
                return periodYears;
            case 7:
                Period periodDays = Period.days(1);
                Intrinsics.checkNotNullExpressionValue(periodDays, "days(...)");
                return periodDays;
            case 8:
                Period periodDays2 = Period.days(10);
                Intrinsics.checkNotNullExpressionValue(periodDays2, "days(...)");
                return periodDays2;
            case 9:
                Period periodMonths4 = Period.months(2);
                Intrinsics.checkNotNullExpressionValue(periodMonths4, "months(...)");
                return periodMonths4;
            case 10:
                Period periodMonths5 = Period.months(3);
                Intrinsics.checkNotNullExpressionValue(periodMonths5, "months(...)");
                return periodMonths5;
            case 11:
            case 12:
            case 13:
                Period ZERO = Period.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return ZERO;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(qua.p r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            ibd.e r0 = r2.f249314a
            ibd.h r0 = r0.f160152c
            java.util.List r1 = qua.u.f249338a
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L23
            qua.g r0 = r2.f249332w
            if (r0 == 0) goto L1c
            boolean r0 = r0.f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r0 = pd.b.j(r0)
            if (r0 != 0) goto L29
        L23:
            boolean r0 = r(r2)
            if (r0 == 0) goto L31
        L29:
            boolean r2 = A(r2)
            if (r2 != 0) goto L31
            r2 = 1
            return r2
        L31:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qua.u.a(qua.p):boolean");
    }

    public static final List b(Interval interval, LocalDate localDate, int i) {
        DateTime dateTimeWithDayOfMonth;
        DateTime start = interval.getStart();
        Intrinsics.checkNotNullExpressionValue(start, "getStart(...)");
        if (start.toLocalDate().isAfter(localDate)) {
            int months = Months.monthsBetween(localDate.toDateTimeAtStartOfDay(), start).getMonths();
            DateTime dateTimePlusMonths = localDate.toDateTimeAtStartOfDay().plusMonths(months - (months % i));
            if (dateTimePlusMonths.isBefore(start)) {
                dateTimePlusMonths = dateTimePlusMonths.plusMonths(i);
            }
            int maximumValue = dateTimePlusMonths.dayOfMonth().getMaximumValue();
            int dayOfMonth = localDate.getDayOfMonth();
            if (dayOfMonth <= maximumValue) {
                maximumValue = dayOfMonth;
            }
            dateTimeWithDayOfMonth = dateTimePlusMonths.withDayOfMonth(maximumValue);
            Intrinsics.h(dateTimeWithDayOfMonth);
        } else {
            dateTimeWithDayOfMonth = localDate.toDateTimeAtStartOfDay();
            Intrinsics.h(dateTimeWithDayOfMonth);
        }
        if (dateTimeWithDayOfMonth.compareTo((ReadableInstant) interval.getEnd()) > 0) {
            return f0.f322471a;
        }
        kotlin.ranges.c cVarN = kotlin.ranges.f.n(i, new IntRange(0, Months.monthsBetween(dateTimeWithDayOfMonth, interval.getEnd()).getMonths(), 1));
        ArrayList arrayList = new ArrayList(zhm.w.t(cVarN, 10));
        vim.f it8 = cVarN.iterator();
        while (it8.f289625c) {
            arrayList.add(new LocalDate(dateTimeWithDayOfMonth.plusMonths(it8.nextInt())));
        }
        return arrayList;
    }

    public static final List c(Interval interval, LocalDate desiredDate, int i) {
        DateTime dateTimePlusWeeks;
        DateTime start = interval.getStart();
        Intrinsics.checkNotNullExpressionValue(start, "getStart(...)");
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(desiredDate, "desiredDate");
        if (start.toLocalDate().isAfter(desiredDate)) {
            int weeks = Weeks.weeksBetween(desiredDate.toDateTimeAtStartOfDay(), start).getWeeks();
            dateTimePlusWeeks = desiredDate.toDateTimeAtStartOfDay().plusWeeks(weeks - (weeks % i));
            if (dateTimePlusWeeks.isBefore(start)) {
                dateTimePlusWeeks = dateTimePlusWeeks.plusWeeks(i);
            }
            Intrinsics.h(dateTimePlusWeeks);
        } else {
            dateTimePlusWeeks = desiredDate.toDateTimeAtStartOfDay();
            Intrinsics.h(dateTimePlusWeeks);
        }
        if (dateTimePlusWeeks.compareTo((ReadableInstant) interval.getEnd()) > 0) {
            return f0.f322471a;
        }
        kotlin.ranges.c cVarN = kotlin.ranges.f.n(i, new IntRange(0, Weeks.weeksBetween(dateTimePlusWeeks, interval.getEnd()).getWeeks(), 1));
        ArrayList arrayList = new ArrayList(zhm.w.t(cVarN, 10));
        vim.f it8 = cVarN.iterator();
        while (it8.f289625c) {
            arrayList.add(new LocalDate(dateTimePlusWeeks.plusWeeks(it8.nextInt())));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final List d(p pVar, Interval interval) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        LocalDate localDate = new LocalDate(interval.getEnd());
        LocalDate localDate2 = new LocalDate(interval.getStart());
        ibd.e eVar = pVar.f249314a;
        fva.e eVar2 = pVar.K;
        LocalDate localDate3 = eVar.e;
        LocalDate localDate4 = localDate2;
        if (localDate3 != null) {
            boolean zIsAfter = localDate3.isAfter(localDate2);
            localDate4 = localDate2;
            if (zIsAfter) {
                localDate4 = eVar.e;
            }
        }
        if (pVar.f249316b != ibd.f.ACTIVE) {
            return f0.f322471a;
        }
        LocalDate localDate5 = eVar.e;
        LocalDate date = eVar.f;
        if (localDate5 != null && localDate5.isAfter(localDate4)) {
            return f0.f322471a;
        }
        if (date == null || date.isAfter(localDate)) {
            return f0.f322471a;
        }
        Interval intervalWithStart = interval.withStart(localDate4.toDateTimeAtStartOfDay());
        if (ofm.q.r(pVar)) {
            DateTime dateTimeAtStartOfDay = date.toDateTimeAtStartOfDay();
            Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay, "toDateTimeAtStartOfDay(...)");
            DateTime start = intervalWithStart.getStart();
            Intrinsics.checkNotNullExpressionValue(start, "getStart(...)");
            Interval interval2 = new Interval((ReadableInstant) cim.c.k(dateTimeAtStartOfDay, start), interval.getEnd());
            Intrinsics.checkNotNullParameter(interval2, "<this>");
            IntRange intRange = new IntRange(0, Days.daysBetween(interval2.getStart(), interval2.getEnd()).getDays(), 1);
            ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new LocalDate(interval2.getStart().plusDays(it8.nextInt())));
            }
            return arrayList;
        }
        if (ofm.q.I(pVar) || eVar2 == fva.e.WEEKLY) {
            Intrinsics.h(intervalWithStart);
            Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
            Intrinsics.checkNotNullParameter(date, "date");
            return c(intervalWithStart, date, 1);
        }
        if (ofm.q.F(pVar) || eVar2 == fva.e.QUARTERLY) {
            Intrinsics.h(intervalWithStart);
            Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
            Intrinsics.checkNotNullParameter(date, "date");
            return b(intervalWithStart, date, 3);
        }
        if (ofm.q.x(pVar) || eVar2 == fva.e.MONTHLY) {
            Intrinsics.h(intervalWithStart);
            Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
            Intrinsics.checkNotNullParameter(date, "date");
            return b(intervalWithStart, date, 1);
        }
        if (ofm.q.q(pVar) || eVar2 == fva.e.BI_WEEKLY) {
            Intrinsics.h(intervalWithStart);
            Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
            Intrinsics.checkNotNullParameter(date, "date");
            return c(intervalWithStart, date, 2);
        }
        if (eVar2 == fva.e.HALF_YEARLY) {
            Intrinsics.h(intervalWithStart);
            Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
            Intrinsics.checkNotNullParameter(date, "date");
            return b(intervalWithStart, date, 6);
        }
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (jli.e.g(pVar.L()) || eVar2 == fva.e.YEARLY) {
            Intrinsics.h(intervalWithStart);
            Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
            Intrinsics.checkNotNullParameter(date, "date");
            return b(intervalWithStart, date, 12);
        }
        if (!G(pVar)) {
            return (!ofm.q.H(pVar) || localDate4.compareTo((ReadablePartial) date) > 0 || localDate.compareTo((ReadablePartial) date) < 0) ? f0.f322471a : zhm.u.c(date);
        }
        Intrinsics.h(intervalWithStart);
        Intrinsics.checkNotNullParameter(intervalWithStart, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return b(intervalWithStart, date, 1);
    }

    public static final DateTime e(ibd.i iVar, DateTime nowDate) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        LocalDate dateToExceed = nowDate.toLocalDate();
        LocalDate localDateN2 = iVar.n2();
        LocalDate localDateQ = iVar.Q();
        if (localDateN2 != null) {
            dateToExceed = localDateN2;
        } else if (localDateQ != null) {
            if (dateToExceed.isAfter(localDateQ)) {
                if (ofm.q.F(iVar)) {
                    DateTimeFormatter dateTimeFormatter = jli.b.f175839a;
                    Intrinsics.checkNotNullParameter(localDateQ, "<this>");
                    Intrinsics.checkNotNullParameter(dateToExceed, "dateToExceed");
                    while (true) {
                        if (!dateToExceed.isAfter(localDateQ) && !dateToExceed.isEqual(localDateQ)) {
                            break;
                        }
                        localDateQ = localDateQ.plusMonths(3);
                        Intrinsics.checkNotNullExpressionValue(localDateQ, "plusMonths(...)");
                    }
                } else if (ofm.q.x(iVar)) {
                    DateTimeFormatter dateTimeFormatter2 = jli.b.f175839a;
                    Intrinsics.checkNotNullParameter(localDateQ, "<this>");
                    Intrinsics.checkNotNullParameter(dateToExceed, "dateToExceed");
                    while (true) {
                        if (!dateToExceed.isAfter(localDateQ) && !dateToExceed.isEqual(localDateQ)) {
                            break;
                        }
                        localDateQ = localDateQ.plusMonths(1);
                        Intrinsics.checkNotNullExpressionValue(localDateQ, "plusMonths(...)");
                    }
                } else if (ofm.q.I(iVar)) {
                    DateTimeFormatter dateTimeFormatter3 = jli.b.f175839a;
                    Intrinsics.checkNotNullParameter(localDateQ, "<this>");
                    Intrinsics.checkNotNullParameter(dateToExceed, "dateToExceed");
                    while (true) {
                        if (!dateToExceed.isAfter(localDateQ) && !dateToExceed.isEqual(localDateQ)) {
                            break;
                        }
                        localDateQ = localDateQ.plusWeeks(1);
                        Intrinsics.checkNotNullExpressionValue(localDateQ, "plusWeeks(...)");
                    }
                } else if (ofm.q.r(iVar)) {
                    dateToExceed = dateToExceed.plusDays(1);
                }
                dateToExceed = localDateQ;
            } else {
                dateToExceed = localDateQ;
            }
        }
        DateTime dateTimeAtCurrentTime = dateToExceed.toDateTimeAtCurrentTime();
        Intrinsics.checkNotNullExpressionValue(dateTimeAtCurrentTime, "toDateTimeAtCurrentTime(...)");
        return dateTimeAtCurrentTime;
    }

    public static final dj0.d f(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Long l2 = pVar.f249323j;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = xi0.b.Companion;
        String str = pVar.i;
        aVar.getClass();
        return new dj0.d(jLongValue, xi0.a.a(str));
    }

    public static final dj0.d g(p pVar, double d, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return pyd.c.K(f(pVar), d, targetCurrency);
    }

    public static final boolean h(p pVar, ZonedDateTime nowDate) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        return i(pVar, new DateTime(nowDate.toInstant().toEpochMilli()));
    }

    public static final boolean i(p pVar, DateTime nowDate) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        return G(pVar) ? (k(pVar) || s(pVar, nowDate)) ? false : true : f249339b.contains(pVar.f249316b);
    }

    public static final boolean j(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        ibd.h hVar = pVar.f249314a.f160152c;
        if (hVar != ibd.h.BPAY) {
            return hVar == ibd.h.BILL && pVar.V == fva.l.BPAY;
        }
        return true;
    }

    public static final boolean k(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (!f249338a.contains(pVar.f249314a.f160152c)) {
            return pVar.f249316b == ibd.f.BLOCKED;
        }
        g gVar = pVar.f249332w;
        return pd.b.j(gVar != null ? Boolean.valueOf(gVar.e) : null);
    }

    public static final boolean l(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.BOLETO && pVar.Y != null;
    }

    public static final boolean m(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.U == fva.g.BOLETO || l(pVar);
    }

    public static final boolean n(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249316b == ibd.f.CANCELLED;
    }

    public static final boolean o(p pVar, DateTime nowDate) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        LocalDate localDate = pVar.f249314a.f;
        return localDate == null || localDate.plusDays(4).compareTo((ReadablePartial) nowDate.toLocalDate()) > 0;
    }

    public static final boolean p(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (u(pVar)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.MORTGAGE_PAYMENT;
    }

    public static final boolean q(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c.e();
    }

    public static final boolean r(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return q(pVar) && pVar.V == fva.l.DE;
    }

    public static final boolean s(p pVar, DateTime nowDate) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        return G(pVar) ? (k(pVar) || o(pVar, nowDate)) ? false : true : pVar.f249316b == ibd.f.INACTIVE;
    }

    public static final boolean t(p pVar, String transactionGroupId) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        if (!G(pVar)) {
            return false;
        }
        Set set = pVar.G;
        return pd.b.j(set != null ? Boolean.valueOf(set.contains(transactionGroupId)) : null);
    }

    public static final boolean u(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.LOAN_PAYMENT;
    }

    public static final boolean v(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249317b0 != null;
    }

    public static final boolean w(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return q(pVar) && pVar.V == fva.l.NZ_BECS;
    }

    public static final boolean x(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return q(pVar) && pVar.V == fva.l.NPP;
    }

    public static final boolean y(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.NZ_BILLS;
    }

    public static final boolean z(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar.f249314a.f160152c == ibd.h.PAY_LATER_PAYMENT;
    }
}
