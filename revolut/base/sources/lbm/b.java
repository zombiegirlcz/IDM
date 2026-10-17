package lbm;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.messaging.o;
import java.time.Clock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nbm.f f193710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f193711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f193712c;
    public final long d;
    public final AtomicLong e;
    public final int f;

    public b(int i, jbm.g gVar, jbm.h hVar, Clock clock) {
        if (gVar == jbm.g.COUNT_BASED) {
            this.f193710a = new nbm.c(i);
            this.f = Math.min(hVar.f172678j, i);
        } else {
            this.f193710a = new o(i, clock);
            this.f = hVar.f172678j;
        }
        this.f193711b = hVar.f;
        this.f193712c = hVar.f172680m;
        this.d = hVar.f172681n.toNanos();
        this.e = new AtomicLong();
    }

    public final a a(g8.f fVar) {
        int i = fVar.f141229c;
        float f = BitmapDescriptorFactory.HUE_RED;
        int i2 = this.f;
        float f4 = (i == 0 || i < i2) ? -1.0f : i == 0 ? 0.0f : (fVar.f141228b * 100.0f) / i;
        if (i == 0 || i < i2) {
            f = -1.0f;
        } else if (i != 0) {
            f = (fVar.f141227a * 100.0f) / i;
        }
        if (f4 == -1.0f || f == -1.0f) {
            return a.BELOW_MINIMUM_CALLS_THRESHOLD;
        }
        float f5 = this.f193711b;
        float f6 = this.f193712c;
        return (f4 < f5 || f < f6) ? f4 >= f5 ? a.FAILURE_RATE_ABOVE_THRESHOLDS : f >= f6 ? a.SLOW_CALL_RATE_ABOVE_THRESHOLDS : a.BELOW_THRESHOLDS : a.ABOVE_THRESHOLDS;
    }

    public final a b(long j2) {
        long nanos = TimeUnit.NANOSECONDS.toNanos(j2);
        long j3 = this.d;
        nbm.f fVar = this.f193710a;
        return a(nanos > j3 ? fVar.a(j2, nbm.e.SLOW_ERROR) : fVar.a(j2, nbm.e.ERROR));
    }

    public final a c(long j2) {
        long nanos = TimeUnit.NANOSECONDS.toNanos(j2);
        long j3 = this.d;
        nbm.f fVar = this.f193710a;
        return a(nanos > j3 ? fVar.a(j2, nbm.e.SLOW_SUCCESS) : fVar.a(j2, nbm.e.SUCCESS));
    }
}
