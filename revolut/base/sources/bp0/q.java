package bp0;

import android.text.format.DateUtils;
import aw0.ka;
import aw0.la;
import com.revolut.core.android.R$string;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.o0;
import com.revolut.core.ui_kit.models.p0;
import com.revolut.core.ui_kit.models.q0;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    @NotNull
    private static final o Companion = new o();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f17510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f17511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17512c;

    static {
        q0[] elements = {q0.ONLY_DATE, q0.DATETIME_WITH_SECONDS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public q(t70.g localization, qd0.b languageProvider, d datePrinter) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(datePrinter, "datePrinter");
        this.f17510a = localization;
        this.f17511b = languageProvider;
        this.f17512c = datePrinter;
    }

    public static DateTime a(long j2, ZoneId zoneId) {
        return zoneId != null ? new DateTime(j2, DateTimeZone.forTimeZone(TimeZone.getTimeZone(zoneId))) : new DateTime(j2);
    }

    public static boolean b(DateTime dateTime, ZoneId zoneId) {
        if (zoneId == null) {
            return LocalDate.now().compareTo((ReadablePartial) new LocalDate(dateTime)) == 0;
        }
        DateTimeZone dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(TimeZone.getTimeZone(zoneId));
        return LocalDate.now(dateTimeZoneForTimeZone).compareTo((ReadablePartial) new LocalDate(dateTime, dateTimeZoneForTimeZone)) == 0;
    }

    public static boolean c(q qVar, DateTime dateTime, int i) {
        qVar.getClass();
        ReadablePartial localDate = dateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateMinusMonths = localDateNow.minusMonths(i);
        Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "minusMonths(...)");
        return localDateMinusMonths.compareTo(localDate) <= 0 && localDate.compareTo((ReadablePartial) localDateNow) <= 0;
    }

    public static final String e(q0 q0Var, q qVar, long j2, ZoneId zoneId, String str) {
        int i = p.d[q0Var.ordinal()];
        if (i == 1) {
            return qVar.f17510a.i(R$string.date_format_default, str, qVar.f(j2, zoneId));
        }
        if (i == 2 || i == 3) {
            return str;
        }
        if (i == 4) {
            return qVar.f(j2, zoneId);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return qVar.f17510a.i(R$string.date_format_default, str, qVar.f17512c.c(j2, "HH:mm:ss", zoneId));
    }

    public final String d(TimeClause clause) {
        d dVar = this.f17512c;
        qd0.b bVar = dVar.f17494b;
        Intrinsics.checkNotNullParameter(clause, "clause");
        TimeClause.Format format = clause.f57957b;
        ZoneId zoneId = clause.d;
        long j2 = clause.f57956a;
        boolean z = format instanceof TimeClause.Format.Pretty;
        qd0.b bVar2 = this.f17511b;
        t70.g gVar = this.f17510a;
        if (z) {
            q0 f57974b = ((TimeClause.Format.Pretty) format).getF57974b();
            ZoneId zoneId2 = clause.d;
            DateTime dateTimeNow = zoneId2 != null ? DateTime.now(DateTimeZone.forTimeZone(TimeZone.getTimeZone(zoneId2))) : DateTime.now();
            DateTime dateTimeA = a(j2, zoneId2);
            long time = dateTimeNow.toDate().getTime();
            long j3 = time - j2;
            long jAbs = Math.abs(j3);
            String str = f57974b == q0.ONLY_DATE_FULL_MONTH ? "MMMM" : "MMM";
            Set set = d;
            if (jAbs <= 60000 && !set.contains(f57974b)) {
                return j3 >= 0 ? gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_moments_past) : gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_moments_future);
            }
            if (jAbs <= 600000 && !set.contains(f57974b)) {
                Locale locale = Locale.getDefault();
                Locale localeB = ((s80.b) bVar2).b();
                if (locale != localeB) {
                    Locale.setDefault(localeB);
                }
                String string = DateUtils.getRelativeTimeSpanString(j2, time, 60000L, 0).toString();
                if (locale != localeB) {
                    Locale.setDefault(locale);
                }
                return string;
            }
            if (f57974b == q0.ONLY_TIME) {
                return f(j2, zoneId2);
            }
            if (b(dateTimeA, zoneId2)) {
                return e(f57974b, this, j2, zoneId2, gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_day_today));
            }
            DateTime dateTime = dateTimeNow;
            DateTime dateTimePlusDays = dateTimeA.plusDays(1);
            Intrinsics.checkNotNullExpressionValue(dateTimePlusDays, "plusDays(...)");
            if (b(dateTimePlusDays, zoneId2)) {
                return e(f57974b, this, j2, zoneId2, gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_day_yesterday));
            }
            DateTime dateTimeMinusDays = dateTimeA.minusDays(1);
            Intrinsics.checkNotNullExpressionValue(dateTimeMinusDays, "minusDays(...)");
            return b(dateTimeMinusDays, zoneId2) ? e(f57974b, this, j2, zoneId2, gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_day_tomorrow)) : (Intrinsics.f(dateTime.year(), dateTimeA.year()) && c(this, dateTimeA, 12)) ? e(f57974b, this, j2, zoneId2, dVar.d(j2, "d ".concat(str), zoneId2)) : e(f57974b, this, j2, zoneId2, dVar.d(j2, p.a.p("d ", str, " yyyy"), zoneId2));
        }
        if (format instanceof TimeClause.Format.Month) {
            int i = p.f17507a[((TimeClause.Format.Month) format).getF57971b().ordinal()];
            if (i == 1) {
                String str2 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(0), zoneId).format(Long.valueOf(j2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            }
            if (i == 2) {
                return dVar.a(j2, zoneId);
            }
            if (i == 3) {
                return String.valueOf(f0.P0(dVar.a(j2, zoneId)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (format instanceof TimeClause.Format.MonthAndYear) {
            TimeClause.Format.MonthAndYear monthAndYear = (TimeClause.Format.MonthAndYear) format;
            int i2 = p.f17507a[monthAndYear.getF57972b().ordinal()];
            if (i2 == 1) {
                z = false;
            } else if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (monthAndYear.getF57972b() == ka.SHORT && monthAndYear.getF57973c() == la.SHORT) {
                String str3 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(9), zoneId).format(Long.valueOf(j2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            }
            if (!z && monthAndYear.getF57973c() == la.FULL) {
                String str4 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(3), zoneId).format(Long.valueOf(j2));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                return str4;
            }
            if (z && monthAndYear.getF57973c() == la.FULL) {
                String str5 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(4), zoneId).format(Long.valueOf(j2));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                return str5;
            }
            if (z && monthAndYear.getF57973c() == la.SHORT) {
                String str6 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(6), zoneId).format(Long.valueOf(j2));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                return str6;
            }
            String str7 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(7), zoneId).format(Long.valueOf(j2));
            Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
            return str7;
        }
        if (format instanceof TimeClause.Format.DayAndMonth) {
            int i3 = p.f17507a[((TimeClause.Format.DayAndMonth) format).getF57964b().ordinal()];
            if (i3 == 1) {
                return dVar.d(j2, "d MMMM", zoneId);
            }
            if (i3 == 2) {
                return dVar.d(j2, "MMMd", zoneId);
            }
            if (i3 == 3) {
                return dVar.b(j2, zoneId);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (format instanceof TimeClause.Format.DateMedium) {
            int i5 = p.f17508b[((TimeClause.Format.DateMedium) format).getF57963b().ordinal()];
            if (i5 == 1) {
                String strPrint = pw5.a.c(e.a(((s80.b) bVar).b()).s0(2), zoneId).print(j2);
                Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                return strPrint;
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.f(a(j2, zoneId).year(), (zoneId != null ? DateTime.now(DateTimeZone.forTimeZone(TimeZone.getTimeZone(zoneId))) : DateTime.now()).year())) {
                return dVar.b(j2, zoneId);
            }
            String strPrint2 = pw5.a.c(e.a(((s80.b) bVar).b()).s0(2), zoneId).print(j2);
            Intrinsics.checkNotNullExpressionValue(strPrint2, "print(...)");
            return strPrint2;
        }
        if (Intrinsics.f(format, TimeClause.Format.DateLong.f57962b)) {
            String strPrint3 = pw5.a.c(e.a(((s80.b) bVar).b()).s0(1), zoneId).print(j2);
            Intrinsics.checkNotNullExpressionValue(strPrint3, "print(...)");
            return strPrint3;
        }
        if (Intrinsics.f(format, TimeClause.Format.DateFull.f57961b)) {
            String strPrint4 = pw5.a.c(e.a(((s80.b) bVar).b()).s0(0), zoneId).print(j2);
            Intrinsics.checkNotNullExpressionValue(strPrint4, "print(...)");
            return strPrint4;
        }
        if (Intrinsics.f(format, TimeClause.Format.TimeDefault.f57977b)) {
            String strPrint5 = pw5.a.c(e.a(((s80.b) bVar).b()).s0(4), zoneId).print(j2);
            Intrinsics.checkNotNullExpressionValue(strPrint5, "print(...)");
            return strPrint5;
        }
        if (Intrinsics.f(format, TimeClause.Format.TimeWithSeconds.f57978b)) {
            return dVar.d(j2, "jms", zoneId);
        }
        if (format instanceof TimeClause.Format.Duration) {
            TimeClause.Format.Duration.DurationStyle f57967b = ((TimeClause.Format.Duration) format).getF57967b();
            if (f57967b instanceof TimeClause.Format.Duration.DurationStyle.Digital) {
                o0 leadingZeroesPolicy = ((TimeClause.Format.Duration.DurationStyle.Digital) f57967b).getF57968a();
                Intrinsics.checkNotNullParameter(leadingZeroesPolicy, "leadingZeroesPolicy");
                b.Companion companion = kotlin.time.b.INSTANCE;
                long jH = kotlin.time.c.h(j2, pkm.e.MILLISECONDS);
                long jN = kotlin.time.b.n(jH, pkm.e.HOURS);
                int iH = kotlin.time.b.h(jH);
                int iJ = kotlin.time.b.j(jH);
                kotlin.time.b.i(jH);
                return (jN > 0 || (leadingZeroesPolicy == o0.ALWAYS_DISPLAY_HOURS)) ? a0.d.v(new Object[]{Long.valueOf(jN), Integer.valueOf(iH), Integer.valueOf(iJ)}, 3, "%02d:%02d:%02d", "format(...)") : a0.d.v(new Object[]{Integer.valueOf(iH), Integer.valueOf(iJ)}, 2, "%02d:%02d", "format(...)");
            }
            if (!(f57967b instanceof TimeClause.Format.Duration.DurationStyle.Textual)) {
                throw new NoWhenBranchMatchedException();
            }
            p0 precision = ((TimeClause.Format.Duration.DurationStyle.Textual) f57967b).getF57969a();
            t70.g gVar2 = dVar.f17495c;
            Intrinsics.checkNotNullParameter(precision, "precision");
            b.Companion companion2 = kotlin.time.b.INSTANCE;
            long jH2 = kotlin.time.c.h(j2, pkm.e.MILLISECONDS);
            long jN2 = kotlin.time.b.n(jH2, pkm.e.DAYS);
            int iE = kotlin.time.b.e(jH2);
            int iH2 = kotlin.time.b.h(jH2);
            int iJ2 = kotlin.time.b.j(jH2);
            kotlin.time.b.i(jH2);
            z = precision == p0.SECONDS;
            StringBuilder sb6 = new StringBuilder();
            if (jN2 > 0) {
                sb6.append(jN2);
                sb6.append(gVar2.getString(R$string.date_shortest_day_format));
                sb6.append(" ");
            }
            if (iE > 0 || sb6.length() > 0) {
                sb6.append(iE);
                sb6.append(gVar2.getString(R$string.date_shortest_hour_format));
                sb6.append(" ");
            }
            if (iH2 > 0 || sb6.length() > 0) {
                sb6.append(iH2);
                sb6.append(gVar2.getString(R$string.date_shortest_minute_format));
                if (z) {
                    sb6.append(" ");
                }
            }
            if (z) {
                sb6.append(iJ2);
                sb6.append(gVar2.getString(R$string.date_shortest_second_format));
            }
            return sb6.toString();
        }
        if (Intrinsics.f(format, TimeClause.Format.DateEditable.f57960b)) {
            return dVar.d(j2, "ddMMyyyy", zoneId);
        }
        if (Intrinsics.f(format, TimeClause.Format.ShortDayOfWeek.f57976b)) {
            String str8 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(2), zoneId).format(Long.valueOf(j2));
            Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
            return String.valueOf(f0.P0(str8));
        }
        if (Intrinsics.f(format, TimeClause.Format.DayOfWeek.f57966b)) {
            return dVar.c(j2, "EEEE", zoneId);
        }
        if (!Intrinsics.f(format, TimeClause.Format.PrettyDayOfWeek.f57975b)) {
            if (format instanceof TimeClause.Format.DayOfMonth) {
                if (((TimeClause.Format.DayOfMonth) format).getF57965b()) {
                    return dVar.f17493a.a("{0,ordinal}", Integer.valueOf(new DateTime(j2).getDayOfMonth()));
                }
                return dVar.c(j2, "d", zoneId);
            }
            if (!(format instanceof TimeClause.Format.Year)) {
                if (Intrinsics.f(format, TimeClause.Format.Hour.f57970b)) {
                    return dVar.d(j2, "j", zoneId);
                }
                throw new NoWhenBranchMatchedException();
            }
            int i6 = p.f17509c[((TimeClause.Format.Year) format).getF57979b().ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    return dVar.d(j2, "yyyy", zoneId);
                }
                throw new NoWhenBranchMatchedException();
            }
            String str9 = pw5.a.b(e.a(((s80.b) bVar).b()).w0(5), zoneId).format(Long.valueOf(j2));
            Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
            return str9;
        }
        long j5 = clause.f57956a;
        DateTime dateTimeNow2 = zoneId != null ? DateTime.now(DateTimeZone.forTimeZone(TimeZone.getTimeZone(zoneId))) : DateTime.now();
        DateTime dateTimeA2 = a(j5, zoneId);
        if (b(dateTimeA2, zoneId)) {
            return gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_day_today);
        }
        DateTime dateTimePlusDays2 = dateTimeA2.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(dateTimePlusDays2, "plusDays(...)");
        if (b(dateTimePlusDays2, zoneId)) {
            return gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_day_yesterday);
        }
        DateTime dateTimeMinusDays2 = dateTimeA2.minusDays(1);
        Intrinsics.checkNotNullExpressionValue(dateTimeMinusDays2, "minusDays(...)");
        if (b(dateTimeMinusDays2, zoneId)) {
            return gVar.getString(com.revolut.core.ui_kit_core.R$string.uikit_timeclause_format_day_tomorrow);
        }
        if (!Intrinsics.f(dateTimeNow2.year(), dateTimeA2.year()) || !Intrinsics.f(dateTimeNow2.weekOfWeekyear(), dateTimeA2.weekOfWeekyear())) {
            return (Intrinsics.f(dateTimeNow2.year(), dateTimeA2.year()) && c(this, dateTimeA2, 6)) ? dVar.d(j5, "EEE, d MMM", null) : Intrinsics.f(dateTimeNow2.year(), dateTimeA2.year()) ? dVar.d(j5, "d MMM", null) : dVar.d(j5, "d MMM yyyy", null);
        }
        String strPrint6 = DateTimeFormat.forPattern("EEE").withLocale(((s80.b) bVar2).b()).print(j5);
        Intrinsics.checkNotNullExpressionValue(strPrint6, "print(...)");
        return strPrint6;
    }

    public final String f(long j2, ZoneId zoneId) {
        String strPrint = pw5.a.c(e.a(((s80.b) this.f17511b).b()).s0(4), zoneId).print(j2);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }
}
