package com.fourthline.orca.internal;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class oe {
    public static final Date a(String str, Calendar calendar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        if (str.length() == 8) {
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i = Integer.parseInt(strSubstring);
            String strSubstring2 = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            int i2 = Integer.parseInt(strSubstring2);
            String strSubstring3 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            calendar.set(1, Integer.parseInt(strSubstring3));
            if (i2 <= 12) {
                calendar.set(2, i2 - 1);
                if (i <= calendar.getActualMaximum(5)) {
                    calendar.set(5, i);
                    return calendar.getTime();
                }
            }
        }
        return null;
    }

    public static final boolean a(Date date, int i) {
        if (date == null) {
            return false;
        }
        Date dateA = a(date, null, 2, null);
        Date dateA2 = a(new Date(), Integer.valueOf(-i));
        return Intrinsics.f(dateA, dateA2) || dateA.before(dateA2);
    }

    public static final Date a(Date date, Integer num) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (num != null) {
            calendar.add(1, num.intValue());
        }
        return calendar.getTime();
    }

    public static /* synthetic */ Date a(Date date, Integer num, int i, Object obj2) {
        if ((i & 2) != 0) {
            num = null;
        }
        return a(date, num);
    }
}
