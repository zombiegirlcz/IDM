package bp0;

import java.time.ZoneId;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f90.b f17493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f17494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.g f17495c;

    public d(f90.b pluralFormatter, qd0.b languageProvider, t70.g localization) {
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f17493a = pluralFormatter;
        this.f17494b = languageProvider;
        this.f17495c = localization;
    }

    public final String a(long j2, ZoneId zoneId) {
        String str = pw5.a.b(e.a(((s80.b) this.f17494b).b()).w0(1), zoneId).format(Long.valueOf(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String b(long j2, ZoneId zoneId) {
        String str = pw5.a.b(e.a(((s80.b) this.f17494b).b()).w0(8), zoneId).format(Long.valueOf(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String c(long j2, String pattern, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormat.forPattern(pattern).withLocale(((s80.b) this.f17494b).b());
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithLocale, "withLocale(...)");
        String strPrint = pw5.a.c(dateTimeFormatterWithLocale, zoneId).print(j2);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        return strPrint;
    }

    public final String d(long j2, String skeleton, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Locale localeB = ((s80.b) this.f17494b).b();
        try {
            String strPrint = pw5.a.c(e.a(localeB).t0(skeleton), zoneId).print(j2);
            Intrinsics.h(strPrint);
            return strPrint;
        } catch (IllegalArgumentException unused) {
            DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormat.forPattern(skeleton).withLocale(localeB);
            Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithLocale, "withLocale(...)");
            String strPrint2 = pw5.a.c(dateTimeFormatterWithLocale, zoneId).print(j2);
            Intrinsics.h(strPrint2);
            return strPrint2;
        }
    }
}
