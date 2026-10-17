package jbm;

import com.google.common.collect.k;
import java.io.Serializable;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f172670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f172671s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Predicate f172673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Predicate f172674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Predicate f172675c;
    public Class[] d;
    public Class[] e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f172676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f172677h;
    public g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f172678j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public mbm.c f172679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f172680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Duration f172681n;
    public Duration o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f172668p = g.COUNT_BASED;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f172669q = new c(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TimeUnit f172672t = TimeUnit.NANOSECONDS;
    public static final c u = new c(2);

    static {
        int i = 1;
        f172670r = new c(i);
        f172671s = new k(i);
    }

    public final String toString() {
        return "CircuitBreakerConfig {recordExceptionPredicate=" + this.f172673a + ", ignoreExceptionPredicate=" + this.f172674b + ", recordExceptions=" + Arrays.toString(this.d) + ", ignoreExceptions=" + Arrays.toString(this.e) + ", failureRateThreshold=" + this.f + ", permittedNumberOfCallsInHalfOpenState=" + this.f172676g + ", slidingWindowSize=" + this.f172677h + ", slidingWindowType=" + this.i + ", minimumNumberOfCalls=" + this.f172678j + ", writableStackTraceEnabled=" + this.k + ", automaticTransitionFromOpenToHalfOpenEnabled=false, waitIntervalFunctionInOpenState=" + this.f172679l + ", slowCallRateThreshold=" + this.f172680m + ", slowCallDurationThreshold=" + this.f172681n + "}";
    }
}
