package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class o1 implements ecm.h1 {
    @Override // ecm.h1
    public final String a(Object obj2) {
        Long l2 = (Long) obj2;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l2.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l2.longValue() < 100000000) {
            return l2 + "n";
        }
        if (l2.longValue() < 100000000000L) {
            return timeUnit.toMicros(l2.longValue()) + "u";
        }
        if (l2.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l2.longValue()) + "m";
        }
        if (l2.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l2.longValue()) + "S";
        }
        if (l2.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l2.longValue()) + "M";
        }
        return timeUnit.toHours(l2.longValue()) + "H";
    }

    @Override // ecm.h1
    public final Object b(String str) {
        Preconditions.checkArgument(str.length() > 0, "empty timeout");
        Preconditions.checkArgument(str.length() <= 9, "bad timeout format");
        long j2 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j2));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j2));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j2));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j2));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j2));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j2);
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.j(cCharAt, "Invalid timeout unit: "));
    }
}
