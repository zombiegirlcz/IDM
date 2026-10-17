package vf;

import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.p;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final class g {
    public static final qf.a f = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f288385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f288386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runtime f288387c;
    public ScheduledFuture d;
    public long e;

    public g() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.f288385a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f288386b = new ConcurrentLinkedQueue();
        this.f288387c = runtime;
    }

    public static boolean b(long j2) {
        return j2 <= 0;
    }

    public final void a(Timer timer) {
        synchronized (this) {
            try {
                this.f288385a.schedule(new f(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f.f("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void c(long j2, Timer timer) {
        this.e = j2;
        try {
            this.d = this.f288385a.scheduleAtFixedRate(new f(this, timer, 0), 0L, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final void d(long j2, Timer timer) {
        if (b(j2)) {
            return;
        }
        if (this.d == null) {
            c(j2, timer);
        } else if (this.e != j2) {
            e();
            c(j2, timer);
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.d = null;
        this.e = -1L;
    }

    public final xf.f f(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jA = timer.a() + timer.f49592a;
        xf.e eVarNewBuilder = xf.f.newBuilder();
        eVarNewBuilder.c();
        ((xf.f) eVarNewBuilder.f49761b).setClientTimeUs(jA);
        p pVar = p.BYTES;
        Runtime runtime = this.f288387c;
        int iT = jh.d.t(pVar.a(runtime.totalMemory() - runtime.freeMemory()));
        eVarNewBuilder.c();
        ((xf.f) eVarNewBuilder.f49761b).setUsedAppJavaHeapMemoryKb(iT);
        return (xf.f) eVarNewBuilder.a();
    }
}
