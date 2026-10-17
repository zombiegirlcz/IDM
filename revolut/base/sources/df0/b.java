package df0;

import android.os.Build;
import android.os.SystemClock;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff0.a f113744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef0.b f113745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f113746c;

    public b(ff0.a ntpClock, ef0.b systemCurrentTimeProvider) {
        Intrinsics.checkNotNullParameter(ntpClock, "ntpClock");
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        this.f113744a = ntpClock;
        this.f113745b = systemCurrentTimeProvider;
        this.f113746c = Build.VERSION.SDK_INT >= 33 ? SystemClock.currentNetworkTimeClock() : null;
    }

    public final Instant a() {
        Clock clock;
        Long lValueOf = null;
        try {
            clock = this.f113746c;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.WARNING, "SyncedDateProvider", null, e, h0Var);
        }
        Long lValueOf2 = clock != null ? Long.valueOf(clock.millis()) : null;
        try {
            lValueOf = Long.valueOf(this.f113744a.f134688a.a());
        } catch (Exception e2) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(c.WARNING, "SyncedDateProvider", null, e2, h0Var2);
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(lValueOf2 != null ? lValueOf2.longValue() : lValueOf != null ? lValueOf.longValue() : this.f113745b.a());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }
}
