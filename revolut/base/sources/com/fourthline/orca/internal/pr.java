package com.fourthline.orca.internal;

import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.core.DocumentType;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class pr {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(fd fdVar, di diVar) {
        if (diVar == null) {
            return zhm.f0.f322471a;
        }
        Calendar calendar = Calendar.getInstance();
        String strC = fdVar.c();
        if (Intrinsics.f(strC, "FRA")) {
            int i = a.$EnumSwitchMapping$0[diVar.c().ordinal()];
            if (i != 1 && i != 2) {
                return zhm.f0.f322471a;
            }
            Intrinsics.h(calendar);
            return zhm.v.k(new fr(fdVar, a(calendar, 15, 2, 2021, 0, 0, 0, 0, SyslogConstants.LOG_CLOCK, null), di.a(diVar, DocumentType.ID_CARD, null, null, false, 14, null)), new fr(fdVar, null, di.a(diVar, DocumentType.FRENCH_ID_CARD, null, null, false, 14, null)));
        }
        if (!Intrinsics.f(strC, "ROU")) {
            return zhm.f0.f322471a;
        }
        int i2 = a.$EnumSwitchMapping$0[diVar.c().ordinal()];
        if (i2 != 1 && i2 != 2) {
            return zhm.f0.f322471a;
        }
        Intrinsics.h(calendar);
        return zhm.v.k(new fr(fdVar, a(calendar, 2, 7, 2021, 0, 0, 0, 0, SyslogConstants.LOG_CLOCK, null), di.a(diVar, DocumentType.ID_CARD, null, null, false, 14, null)), new fr(fdVar, null, di.a(diVar, DocumentType.FRENCH_ID_CARD, null, null, false, 14, null)));
    }

    public static /* synthetic */ Date a(Calendar calendar, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, Object obj2) {
        if ((i32 & 8) != 0) {
            i5 = 0;
        }
        if ((i32 & 16) != 0) {
            i6 = 0;
        }
        if ((i32 & 32) != 0) {
            i21 = 0;
        }
        if ((i32 & 64) != 0) {
            i22 = 0;
        }
        return a(calendar, i, i2, i3, i5, i6, i21, i22);
    }

    private static final Date a(Calendar calendar, int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        calendar.set(i3, i2, i);
        calendar.set(11, i5);
        calendar.set(12, i6);
        calendar.set(13, i21);
        calendar.set(14, i22);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }
}
