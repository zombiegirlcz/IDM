package a0e;

import aw0.o9;
import com.revolut.core.android.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.statements.impl.ui.documents_hub.custom_filter.CustomFilterCalculationException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Months;
import org.joda.time.Years;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f375a;

    public w(l80.e dateProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f375a = dateProvider;
                break;
        }
    }

    public static CompositeClause d(int i) {
        if (i <= 0) {
            return null;
        }
        int i2 = i / 60;
        int i3 = i % 60;
        aim.e eVarB = zhm.u.b();
        if (i2 > 0) {
            eVarB.add(yoj.b.w(new TextClause(String.valueOf(i2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_hour_format, null, null, 14)));
        }
        if (i3 > 0) {
            eVarB.add(yoj.b.w(new TextClause(String.valueOf(i3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_minute_format, null, null, 14)));
        }
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.u.a(eVarB));
    }

    public static StatementPeriod f(List availableTaxYearPeriods, StatementPeriod selectedPeriod) {
        Object next;
        Intrinsics.checkNotNullParameter(availableTaxYearPeriods, "availableTaxYearPeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        if (availableTaxYearPeriods.isEmpty()) {
            return selectedPeriod;
        }
        Iterator it8 = availableTaxYearPeriods.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (!((StatementPeriod) next).getEnd().isBefore(selectedPeriod.getEnd())) {
                break;
            }
        }
        StatementPeriod statementPeriod = (StatementPeriod) next;
        return statementPeriod == null ? (StatementPeriod) d0.m0(availableTaxYearPeriods) : statementPeriod;
    }

    public static LocalDate g(wxd.y yVar, LocalDate localDate) {
        int i = v.f374a[yVar.ordinal()];
        if (i == 1) {
            return localDate;
        }
        if (i == 2) {
            LocalDate localDateMinusDays = localDate.withDayOfMonth(1).minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
            return localDateMinusDays;
        }
        if (i == 3) {
            LocalDate localDateWithDayOfMonth = localDate.withDayOfMonth(localDate.lengthOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
            return localDateWithDayOfMonth;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        LocalDate localDateWithDayOfYear = localDate.withDayOfYear(localDate.lengthOfYear());
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear, "withDayOfYear(...)");
        return localDateWithDayOfYear;
    }

    public aim.e a(StatementPeriod availablePeriod, TaxPeriod taxPeriod) throws CustomFilterCalculationException {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        StatementPeriod statementPeriodCopy$default = StatementPeriod.copy$default(availablePeriod, null, (LocalDate) kotlin.ranges.f.d(availablePeriod.getEnd(), ((l80.f) this.f375a).e()), 1, null);
        if (statementPeriodCopy$default.getStart().compareTo((ChronoLocalDate) statementPeriodCopy$default.getEnd()) > 0) {
            throw new CustomFilterCalculationException("Available statement period must have an ordered date range");
        }
        MonthDay monthDayFrom = MonthDay.from(taxPeriod.getFrom());
        MonthDay monthDayFrom2 = MonthDay.from(taxPeriod.getTo());
        int i = monthDayFrom2.compareTo(monthDayFrom) < 0 ? 1 : 0;
        LocalDate element = monthDayFrom.atYear(statementPeriodCopy$default.getStart().getYear());
        if (element.compareTo((ChronoLocalDate) statementPeriodCopy$default.getStart()) > 0) {
            element = monthDayFrom.atYear(statementPeriodCopy$default.getStart().getYear() - 1);
        }
        aim.e eVarB = zhm.u.b();
        while (element.compareTo((ChronoLocalDate) statementPeriodCopy$default.getEnd()) <= 0) {
            LocalDate localDateAtYear = monthDayFrom2.atYear(element.getYear() + i);
            Intrinsics.checkNotNullExpressionValue(element, "element");
            LocalDate localDate = (LocalDate) cim.c.k(element, statementPeriodCopy$default.getStart());
            Intrinsics.h(localDateAtYear);
            StatementPeriod statementPeriod = new StatementPeriod(localDate, (LocalDate) cim.c.l(localDateAtYear, statementPeriodCopy$default.getEnd()));
            if (statementPeriod.getStart().compareTo((ChronoLocalDate) statementPeriod.getEnd()) <= 0) {
                eVarB.add(statementPeriod);
            }
            element = monthDayFrom.atYear(element.getYear() + 1);
        }
        return zhm.u.a(eVarB);
    }

    public yx7.b b(zw7.d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        org.joda.time.LocalDate localDate = pet.f325767g;
        l80.f fVar = (l80.f) this.f375a;
        int years = Years.yearsBetween(localDate, fVar.g().toLocalDate()).getYears();
        yx7.b bVar = new yx7.b(years, yx7.a.YEAR);
        if (years <= 0) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        int months = Months.monthsBetween(pet.f325767g, fVar.g().toLocalDate()).getMonths();
        yx7.b bVar2 = months > 0 ? new yx7.b(months, yx7.a.MONTH) : null;
        return bVar2 == null ? new yx7.b(0) : bVar2;
    }

    public Clause c(ZonedDateTime zonedDateTime, int i) {
        Duration durationOfMinutes = Duration.ofMinutes(i);
        long jAbs = Math.abs(ChronoUnit.MONTHS.between(zonedDateTime, ((l80.f) this.f375a).k()));
        Clause clauseW = jAbs > 0 ? yoj.b.w(new TextClause(String.valueOf(jAbs), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_month_format, null, null, 14)) : durationOfMinutes.toHours() > 24 ? yoj.b.w(new TextClause(String.valueOf(durationOfMinutes.toDays()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.date_shortest_day_format, null, null, 14)) : d(i);
        if (clauseW != null) {
            return clauseW;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public TextLocalisedClause e(ZonedDateTime eventTime) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        int minutes = (int) Duration.between(((l80.f) this.f375a).k(), eventTime).toMinutes();
        return minutes == 0 ? new TextLocalisedClause(R$string.general_date_value_now, null, null, 14) : minutes > 0 ? new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_flight_details_time_remaining, zhm.u.c(c(eventTime, minutes)), null, 12) : new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_flight_details_time_passed, zhm.u.c(c(eventTime, Math.abs(minutes))), null, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0136, code lost:
    
        return new p6g.b0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0139, code lost:
    
        if ((r4 instanceof p6g.e) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x013b, code lost:
    
        if (r0 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013d, code lost:
    
        r5 = (p6g.e) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x014c, code lost:
    
        if (r5.f233279b.isBefore(r0.plusYears(r5.f233278a)) != true) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0153, code lost:
    
        return new p6g.b0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0156, code lost:
    
        if ((r4 instanceof p6g.d) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0158, code lost:
    
        if (r0 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x015a, code lost:
    
        r5 = (p6g.d) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x016a, code lost:
    
        if ((!r5.f233276b.isBefore(r0.plusYears(r5.f233275a))) != true) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        return new p6g.b0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0174, code lost:
    
        if ((r4 instanceof p6g.i) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0176, code lost:
    
        r5 = (p6g.i) r4;
        r6 = r5.f233285a;
        r6 = java.lang.Math.abs(oc.c.P(r6.f233283a, r6.f233284b));
        r5 = r5.f233286b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0197, code lost:
    
        if (r6 == java.lang.Math.abs(oc.c.P(r5.f233283a, r5.f233284b))) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x019e, code lost:
    
        return new p6g.b0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x019f, code lost:
    
        if (r4 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a8, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ac, code lost:
    
        if ((r11 instanceof p6g.p) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b0, code lost:
    
        if ((r11 instanceof p6g.b) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b2, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b8, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01bf, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0 = new p6g.b0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if ((r0 instanceof p6g.b0) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if ((r0 instanceof p6g.c0) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if ((r11 instanceof p6g.v) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        r11 = (p6g.v) r11;
        r0 = r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r0 = r0.f233303a;
        r11 = r11.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r11.hasNext() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        r1 = (p6g.y) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        if ((r1 instanceof p6g.t) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r1 = (p6g.t) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if ((r1 instanceof p6g.r) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (kotlin.text.d0.W(r0) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        return new p6g.b0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        if ((r1 instanceof p6g.q) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (kotlin.text.d0.F0(r0).toString().length() >= 6) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        return new p6g.b0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
    
        if ((r1 instanceof p6g.s) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
    
        if (((p6g.s) r1).f233301a.f(r0) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c2, code lost:
    
        return new p6g.b0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        if (r1 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
    
        if ((r11 instanceof p6g.n) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d0, code lost:
    
        r11 = (p6g.n) r11;
        r0 = r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
    
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
    
        r11 = r11.e;
        r1 = ((l80.f) r10.f375a).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        if ((r0 instanceof p6g.k) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e4, code lost:
    
        r0 = (p6g.k) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        r0 = r0.f233288a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ee, code lost:
    
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f6, code lost:
    
        if (r11.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f8, code lost:
    
        r4 = (p6g.y) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0100, code lost:
    
        if ((r4 instanceof p6g.j) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0102, code lost:
    
        r4 = (p6g.j) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0105, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0108, code lost:
    
        if ((r4 instanceof p6g.g) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010a, code lost:
    
        if (r0 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0111, code lost:
    
        return new p6g.b0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0115, code lost:
    
        if ((r4 instanceof p6g.f) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0117, code lost:
    
        if (r0 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011d, code lost:
    
        if (r0.isAfter(r1) != true) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0124, code lost:
    
        return new p6g.b0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0127, code lost:
    
        if ((r4 instanceof p6g.c) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0129, code lost:
    
        if (r0 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012f, code lost:
    
        if (r0.isBefore(r1) != true) goto L200;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p6g.d0 h(p6g.w r11) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0e.w.h(p6g.w):p6g.d0");
    }
}
