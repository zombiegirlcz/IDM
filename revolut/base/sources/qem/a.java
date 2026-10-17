package qem;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f245193a = TimeZone.getTimeZone("GMT");

    public static final d a(Long l2) {
        Calendar calendar = Calendar.getInstance(f245193a, Locale.ROOT);
        Intrinsics.h(calendar);
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        int i = calendar.get(15) + calendar.get(16);
        int i2 = calendar.get(13);
        int i3 = calendar.get(12);
        int i5 = calendar.get(11);
        int i6 = (calendar.get(7) + 5) % 7;
        h.Companion.getClass();
        h hVar = (h) h.a().get(i6);
        int i21 = calendar.get(5);
        int i22 = calendar.get(6);
        e eVar = f.Companion;
        int i32 = calendar.get(2);
        eVar.getClass();
        return new d(i2, i3, i5, hVar, i21, i22, (f) f.a().get(i32), calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }
}
