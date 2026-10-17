package l80;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static void i(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public final String a() {
        String id10 = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id10, "getID(...)");
        return id10;
    }

    public final Instant b() {
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return instantNow;
    }

    public final boolean c(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        i(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j2);
        i(calendar);
        return calendar.getTimeInMillis() == timeInMillis;
    }

    public final boolean d(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, -1);
        i(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j2);
        i(calendar);
        return calendar.getTimeInMillis() == timeInMillis;
    }

    public final LocalDate e() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.h(localDateNow);
        return localDateNow;
    }

    public final LocalDateTime f() {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Intrinsics.h(localDateTimeNow);
        return localDateTimeNow;
    }

    public final DateTime g() {
        DateTime dateTimeNow = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
        return dateTimeNow;
    }

    public final DateTime h() {
        DateTime dateTimeNow = DateTime.now(DateTimeZone.UTC);
        Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
        return dateTimeNow;
    }

    public final int j() {
        return g().getYear();
    }

    public final ZonedDateTime k() {
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        Intrinsics.h(zonedDateTimeNow);
        return zonedDateTimeNow;
    }
}
