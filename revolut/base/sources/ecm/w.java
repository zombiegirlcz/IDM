package ecm;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class w implements Comparable {
    public static final q1 d = new q1(1);
    public static final long e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f124885g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f124886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f124887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f124888c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        e = nanos;
        f = -nanos;
        f124885g = TimeUnit.SECONDS.toNanos(1L);
    }

    public w(long j2) {
        q1 q1Var = d;
        long jNanoTime = System.nanoTime();
        this.f124886a = q1Var;
        long jMin = Math.min(e, Math.max(f, j2));
        this.f124887b = jNanoTime + jMin;
        this.f124888c = jMin <= 0;
    }

    public final long a() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f124886a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f124888c && this.f124887b - jNanoTime <= 0) {
            this.f124888c = true;
        }
        return timeUnit.convert(this.f124887b - jNanoTime, timeUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        w wVar = (w) obj2;
        q1 q1Var = wVar.f124886a;
        q1 q1Var2 = this.f124886a;
        if (q1Var2 == q1Var) {
            long j2 = this.f124887b - wVar.f124887b;
            if (j2 < 0) {
                return -1;
            }
            return j2 > 0 ? 1 : 0;
        }
        throw new AssertionError("Tickers (" + q1Var2 + " and " + wVar.f124886a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        q1 q1Var = wVar.f124886a;
        q1 q1Var2 = this.f124886a;
        if (q1Var2 != null ? q1Var2 == q1Var : q1Var == null) {
            return this.f124887b == wVar.f124887b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f124886a, Long.valueOf(this.f124887b)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jA = a();
        long jAbs = Math.abs(jA);
        long j2 = f124885g;
        long j3 = jAbs / j2;
        long jAbs2 = Math.abs(jA) % j2;
        StringBuilder sb6 = new StringBuilder();
        if (jA < 0) {
            sb6.append(CoreConstants.DASH_CHAR);
        }
        sb6.append(j3);
        if (jAbs2 > 0) {
            sb6.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb6.append("s from now");
        q1 q1Var = d;
        q1 q1Var2 = this.f124886a;
        if (q1Var2 != q1Var) {
            sb6.append(" (ticker=" + q1Var2 + ")");
        }
        return sb6.toString();
    }
}
