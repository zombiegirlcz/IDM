package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class p2 {
    public static final long k = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f142820l = TimeUnit.MILLISECONDS.toNanos(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f142821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stopwatch f142822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f142823c;
    public o2 d;
    public ScheduledFuture e;
    public ScheduledFuture f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q2 f142824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q2 f142825h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f142826j;

    public p2(n2 n2Var, ScheduledExecutorService scheduledExecutorService, long j2, long j3) {
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        this.d = o2.IDLE;
        this.f142824g = new q2(new l2(this, 0));
        this.f142825h = new q2(new l2(this, 1));
        this.f142823c = (n2) Preconditions.checkNotNull(n2Var, "keepAlivePinger");
        this.f142821a = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService, "scheduler");
        this.f142822b = (Stopwatch) Preconditions.checkNotNull(stopwatchCreateUnstarted, "stopwatch");
        this.i = j2;
        this.f142826j = j3;
        stopwatchCreateUnstarted.reset().start();
    }

    public final synchronized void a() {
        try {
            this.f142822b.reset().start();
            o2 o2Var = this.d;
            o2 o2Var2 = o2.PING_SCHEDULED;
            if (o2Var == o2Var2) {
                this.d = o2.PING_DELAYED;
            } else if (o2Var == o2.PING_SENT || o2Var == o2.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.d == o2.IDLE_AND_PING_SENT) {
                    this.d = o2.IDLE;
                } else {
                    this.d = o2Var2;
                    Preconditions.checkState(this.f == null, "There should be no outstanding pingFuture");
                    this.f = this.f142821a.schedule(this.f142825h, this.i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized void b() {
        try {
            o2 o2Var = this.d;
            if (o2Var == o2.IDLE) {
                this.d = o2.PING_SCHEDULED;
                if (this.f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f142821a;
                    q2 q2Var = this.f142825h;
                    long j2 = this.i;
                    Stopwatch stopwatch = this.f142822b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f = scheduledExecutorService.schedule(q2Var, j2 - stopwatch.elapsed(timeUnit), timeUnit);
                }
            } else if (o2Var == o2.IDLE_AND_PING_SENT) {
                this.d = o2.PING_SENT;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
