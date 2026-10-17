package org.joda.time;

import org.joda.time.format.DateTimeFormat;
import p.a;

/* JADX INFO: loaded from: classes13.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j2, String str) {
        return a.p("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j2)), str != null ? a.p(" (", str, ")") : "");
    }

    public static boolean isIllegalInstant(Throwable th10) {
        if (th10 instanceof IllegalInstantException) {
            return true;
        }
        if (th10.getCause() == null || th10.getCause() == th10) {
            return false;
        }
        return isIllegalInstant(th10.getCause());
    }

    public IllegalInstantException(long j2, String str) {
        super(createMessage(j2, str));
    }
}
