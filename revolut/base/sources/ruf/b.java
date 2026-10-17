package ruf;

import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final long a(PurchasedTransitTicket.Activated activated, long j2) {
        Intrinsics.checkNotNullParameter(activated, "<this>");
        return oi0.d.R(activated.f92643t.f92702b) - j2;
    }

    public static final long b(PurchasedTransitTicket.ToBeActivated toBeActivated, long j2) {
        Intrinsics.checkNotNullParameter(toBeActivated, "<this>");
        LocalDateTime localDateTime = toBeActivated.u;
        long jR = (localDateTime != null ? oi0.d.R(localDateTime) : 0L) - j2;
        LocalDateTime localDateTime2 = toBeActivated.v;
        return Math.max(jR, (localDateTime2 != null ? oi0.d.R(localDateTime2) : 0L) - j2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.time.LocalDateTime] */
    public static final LocalDateTime c(String timeString) {
        Intrinsics.checkNotNullParameter(timeString, "timeString");
        ?? localDateTime = Instant.parse(timeString).atZone(ZoneId.systemDefault()).toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        return localDateTime;
    }
}
