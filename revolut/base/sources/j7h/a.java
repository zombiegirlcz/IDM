package j7h;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static LocalDate a(String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        LocalDate localDate = LocalDate.parse(dateString);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }
}
