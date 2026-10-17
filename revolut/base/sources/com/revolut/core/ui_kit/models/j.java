package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.LocalDate;
import java.time.ZoneOffset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j f58087a = new j();

    private j() {
    }

    public static TimeClause a(LocalDate date, LocalDateClause$DateFormat format, Style style) {
        TimeClause.Format dayOfMonth;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        if (format instanceof LocalDateClause$DateFormat.Month) {
            dayOfMonth = new TimeClause.Format.Month(((LocalDateClause$DateFormat.Month) format).f57809a);
        } else if (format instanceof LocalDateClause$DateFormat.Year) {
            dayOfMonth = new TimeClause.Format.Year(0);
        } else if (format instanceof LocalDateClause$DateFormat.MonthAndYear) {
            dayOfMonth = new TimeClause.Format.MonthAndYear(((LocalDateClause$DateFormat.MonthAndYear) format).f57810a, 2);
        } else if (format instanceof LocalDateClause$DateFormat.DayAndMonth) {
            dayOfMonth = new TimeClause.Format.DayAndMonth(((LocalDateClause$DateFormat.DayAndMonth) format).f57806a);
        } else if (format instanceof LocalDateClause$DateFormat.DateMedium) {
            dayOfMonth = new TimeClause.Format.DateMedium(((LocalDateClause$DateFormat.DateMedium) format).f57805a);
        } else if (format instanceof LocalDateClause$DateFormat.DateLong) {
            dayOfMonth = TimeClause.Format.DateLong.f57962b;
        } else if (format instanceof LocalDateClause$DateFormat.DateFull) {
            dayOfMonth = TimeClause.Format.DateFull.f57961b;
        } else if (format instanceof LocalDateClause$DateFormat.ShortDayOfWeek) {
            dayOfMonth = TimeClause.Format.ShortDayOfWeek.f57976b;
        } else if (format instanceof LocalDateClause$DateFormat.DayOfWeek) {
            dayOfMonth = TimeClause.Format.DayOfWeek.f57966b;
        } else if (format instanceof LocalDateClause$DateFormat.DayOfMonth) {
            dayOfMonth = new TimeClause.Format.DayOfMonth(((LocalDateClause$DateFormat.DayOfMonth) format).f57807a);
        } else if (format instanceof LocalDateClause$DateFormat.DateEditable) {
            dayOfMonth = TimeClause.Format.DateEditable.f57960b;
        } else {
            if (!(format instanceof LocalDateClause$DateFormat.PrettyDayOfWeek)) {
                throw new NoWhenBranchMatchedException();
            }
            dayOfMonth = TimeClause.Format.PrettyDayOfWeek.f57975b;
        }
        TimeClause.Format format2 = dayOfMonth;
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        return new TimeClause(((long) 1000) * date.atStartOfDay(zoneOffset).toEpochSecond(), format2, style, zoneOffset);
    }

    public static /* synthetic */ TimeClause b(j jVar, LocalDate localDate, LocalDateClause$DateFormat localDateClause$DateFormat) {
        jVar.getClass();
        return a(localDate, localDateClause$DateFormat, null);
    }
}
