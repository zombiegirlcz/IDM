package t90;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f268942a = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ISO_LOCAL_DATE).optionalStart().appendOffset("+HH:MM:ss", "").toFormatter();

    public static final class a {
        private a() {
        }
    }

    public static String a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String str = DateTimeFormatter.ISO_LOCAL_DATE.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static LocalDate b(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateFrom = LocalDate.from(f268942a.parse(date));
        Intrinsics.checkNotNullExpressionValue(localDateFrom, "from(...)");
        return localDateFrom;
    }
}
