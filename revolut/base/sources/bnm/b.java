package bnm;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import ymm.i;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f17244a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    public static Date a(Date date) {
        Objects.requireNonNull(date, new i("The date must not be null", new Object[0]));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        a aVar = a.TRUNCATE;
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        Date time = calendar.getTime();
        long time2 = ((time.getTime() - ((long) calendar.get(14))) - (((long) calendar.get(13)) * 1000)) - (((long) calendar.get(12)) * 60000);
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        boolean z = false;
        for (int i = 0; i < 8; i++) {
            int[] iArr = f17244a[i];
            for (int i2 : iArr) {
                if (i2 == 2) {
                    if (aVar == a.CEILING || (aVar == a.ROUND && z)) {
                        calendar.add(iArr[0], 1);
                    }
                    return calendar.getTime();
                }
            }
            int actualMinimum = calendar.getActualMinimum(iArr[0]);
            int actualMaximum = calendar.getActualMaximum(iArr[0]);
            int i3 = calendar.get(iArr[0]) - actualMinimum;
            z = i3 > (actualMaximum - actualMinimum) / 2;
            if (i3 != 0) {
                int i5 = iArr[0];
                calendar.set(i5, calendar.get(i5) - i3);
            }
        }
        throw new IllegalArgumentException("The field 2 is not supported");
    }
}
