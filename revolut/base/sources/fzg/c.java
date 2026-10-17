package fzg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private c() {
    }

    public static d a(xi0.b currency, DateTime timestamp) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new d(new dj0.d(0L, currency), timestamp, new dj0.d(0L, currency), new dj0.d(0L, currency), new dj0.d(0L, currency));
    }
}
