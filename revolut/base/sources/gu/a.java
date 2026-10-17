package gu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private a() {
    }

    public static String a(LocalDate d) {
        Intrinsics.checkNotNullParameter(d, "d");
        String str = d.format(DateTimeFormatter.ofPattern("yyMMdd"));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static LocalDate b(String d) {
        Intrinsics.checkNotNullParameter(d, "d");
        try {
            LocalDate localDateMinusYears = LocalDate.parse(d, DateTimeFormatter.ofPattern("yyMMdd"));
            if (localDateMinusYears.getYear() % 100 >= 49) {
                localDateMinusYears = localDateMinusYears.minusYears(100L);
            }
            Intrinsics.h(localDateMinusYears);
            return localDateMinusYears;
        } catch (DateTimeParseException unused) {
            LocalDate localDateOf = LocalDate.of(1970, 1, 1);
            Intrinsics.h(localDateOf);
            return localDateOf;
        }
    }
}
