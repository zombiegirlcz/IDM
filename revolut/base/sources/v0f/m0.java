package v0f;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 {
    private m0() {
    }

    public static boolean a(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        eue.b bVar = new eue.b(date);
        if (((Boolean) bVar.f129551b.getValue()).booleanValue() && !((Boolean) bVar.d.getValue()).booleanValue()) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            LocalDate localDateNow = LocalDate.now();
            int year = localDateNow.getYear() % 100;
            int monthOfYear = localDateNow.getMonthOfYear();
            String strSubstring = date.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i = Integer.parseInt(strSubstring);
            String strSubstring2 = date.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            int i2 = Integer.parseInt(strSubstring2);
            int i3 = i - year;
            if (i3 <= 20 && (i3 != 20 || i2 <= monthOfYear)) {
                return true;
            }
        }
        return false;
    }
}
