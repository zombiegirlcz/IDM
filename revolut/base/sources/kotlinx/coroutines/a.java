package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import skm.e2;
import skm.r0;
import skm.w0;
import skm.x0;
import skm.x1;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f187932j;

    static {
        Long l2;
        a aVar = new a();
        i = aVar;
        aVar.v(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f187932j = timeUnit.toNanos(l2.longValue());
    }

    public final synchronized void F() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            b.f.set(this, null);
            b.f187933g.set(this, null);
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.b, skm.i0
    public final r0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 >= 4611686018427387903L) {
            return x1.f264019a;
        }
        long jNanoTime = System.nanoTime();
        w0 w0Var = new w0(j3 + jNanoTime, runnable);
        E(jNanoTime, w0Var);
        return w0Var;
    }

    @Override // skm.z0
    public final Thread r() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(i.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        e2.f263973a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jW = w();
                    if (jW == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f187932j + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            F();
                            if (D()) {
                                return;
                            }
                            r();
                            return;
                        }
                        if (jW > j3) {
                            jW = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jW > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            F();
                            if (D()) {
                                return;
                            }
                            r();
                            return;
                        }
                        LockSupport.parkNanos(this, jW);
                    }
                }
            }
        } finally {
            _thread = null;
            F();
            if (!D()) {
                r();
            }
        }
    }

    @Override // kotlinx.coroutines.b, skm.z0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // skm.z0
    public final void y(long j2, x0 x0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.b
    public final void z(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.z(runnable);
    }
}
