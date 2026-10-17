package k4d;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static DateTime a(Long l2) {
        if (l2 != null) {
            return new DateTime(l2.longValue(), DateTimeZone.UTC);
        }
        return null;
    }
}
