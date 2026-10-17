package b1g;

import android.text.format.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f11799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f11800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleDateFormat f11801c;
    public final DateTimeFormatter d;
    public final DateTimeFormatter e;

    public c(qd0.b languageProvider, a timeFormatProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(timeFormatProvider, "timeFormatProvider");
        this.f11799a = languageProvider;
        this.f11800b = timeFormatProvider;
        this.f11801c = new SimpleDateFormat("yyyy-MM-dd");
        this.d = DateTimeFormatter.ofPattern("HH:mm");
        this.e = DateTimeFormatter.ofPattern("hh.mm a");
    }

    public final String a(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        String strPrint = DateTimeFormat.forPattern("d MMM").withLocale(((s80.b) this.f11799a).b()).withZone(dateTime.getZone()).print(dateTime.getMillis());
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    public final String b(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        String strPrint = DateTimeFormat.forPattern(DateFormat.is24HourFormat(this.f11800b.f11798a) ? "d MMM, HH:mm" : "d MMM, hh.mm a").withLocale(((s80.b) this.f11799a).b()).withZone(dateTime.getZone()).print(dateTime.getMillis());
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    public final String c(LocalTime time) {
        Intrinsics.checkNotNullParameter(time, "time");
        String str = time.format(DateFormat.is24HourFormat(this.f11800b.f11798a) ? this.d : this.e);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
