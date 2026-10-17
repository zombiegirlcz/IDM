package vf;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xf.p;
import xf.q;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qf.a f288370g = qf.a.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f288371h = TimeUnit.SECONDS.toMicros(1);
    public ScheduledFuture e = null;
    public long f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f288372a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f288373b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f288374c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public static boolean b(long j2) {
        return j2 <= 0;
    }

    public final void a(Timer timer) {
        synchronized (this) {
            try {
                this.f288373b.schedule(new a(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f288370g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void c(long j2, Timer timer) {
        this.f = j2;
        try {
            this.e = this.f288373b.scheduleAtFixedRate(new a(this, timer, 0), 0L, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f288370g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final void d(long j2, Timer timer) {
        long j3 = this.d;
        if (j3 == -1 || j3 == 0 || b(j2)) {
            return;
        }
        if (this.e == null) {
            c(j2, timer);
        } else if (this.f != j2) {
            e();
            c(j2, timer);
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.e = null;
        this.f = -1L;
    }

    public final q f(Timer timer) {
        long j2 = this.d;
        qf.a aVar = f288370g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f288374c));
            try {
                long jA = timer.a() + timer.f49592a;
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j3 = Long.parseLong(strArrSplit[13]);
                long j5 = Long.parseLong(strArrSplit[15]);
                long j16 = Long.parseLong(strArrSplit[14]);
                long j22 = Long.parseLong(strArrSplit[16]);
                p pVarNewBuilder = q.newBuilder();
                pVarNewBuilder.c();
                ((q) pVarNewBuilder.f49761b).setClientTimeUs(jA);
                double d = (j16 + j22) / j2;
                long j42 = f288371h;
                long jRound = Math.round(d * j42);
                pVarNewBuilder.c();
                ((q) pVarNewBuilder.f49761b).setSystemTimeUs(jRound);
                long jRound2 = Math.round(((j3 + j5) / j2) * j42);
                pVarNewBuilder.c();
                ((q) pVarNewBuilder.f49761b).setUserTimeUs(jRound2);
                q qVar = (q) pVarNewBuilder.a();
                bufferedReader.close();
                return qVar;
            } finally {
            }
        } catch (IOException e) {
            aVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e4) {
            e = e4;
            aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e5) {
            e = e5;
            aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
