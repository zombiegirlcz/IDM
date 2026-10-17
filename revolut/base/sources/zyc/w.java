package zyc;

import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes7.dex */
public final class w {
    public static String a(Long l2) {
        String string;
        if (l2 != null && (string = new DateTime(l2.longValue(), DateTimeZone.UTC).toString("MMM dd")) != null) {
            return string;
        }
        m70.a.c(t0.f186434a);
        return "";
    }
}
