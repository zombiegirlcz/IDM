package gcm;

import com.google.common.base.Stopwatch;
import io.grpc.StatusException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes22.dex */
public final class v1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f142908g = Logger.getLogger(v1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f142909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stopwatch f142910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f142911c = new LinkedHashMap();
    public boolean d;
    public StatusException e;
    public long f;

    public v1(long j2, Stopwatch stopwatch) {
        this.f142909a = j2;
        this.f142910b = stopwatch;
    }

    public static void d(m2 m2Var, Executor executor, StatusException statusException) {
        try {
            executor.execute(new u1(m2Var, statusException));
        } catch (Throwable th10) {
            f142908g.log(Level.SEVERE, "Failed to execute PingCallback", th10);
        }
    }

    public final void a(m2 m2Var, Executor executor) {
        synchronized (this) {
            try {
                if (!this.d) {
                    this.f142911c.put(m2Var, executor);
                    return;
                }
                StatusException statusException = this.e;
                u1 u1Var = statusException != null ? new u1(m2Var, statusException) : new u1(m2Var, this.f);
                try {
                    executor.execute(u1Var);
                } catch (Throwable th10) {
                    f142908g.log(Level.SEVERE, "Failed to execute PingCallback", th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                long jElapsed = this.f142910b.elapsed(TimeUnit.NANOSECONDS);
                this.f = jElapsed;
                LinkedHashMap linkedHashMap = this.f142911c;
                this.f142911c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new u1((m2) entry.getKey(), jElapsed));
                    } catch (Throwable th10) {
                        f142908g.log(Level.SEVERE, "Failed to execute PingCallback", th10);
                    }
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    public final void c(StatusException statusException) {
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                this.e = statusException;
                LinkedHashMap linkedHashMap = this.f142911c;
                this.f142911c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    d((m2) entry.getKey(), (Executor) entry.getValue(), statusException);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final long e() {
        return this.f142909a;
    }
}
