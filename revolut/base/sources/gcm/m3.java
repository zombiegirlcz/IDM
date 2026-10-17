package gcm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class m3 extends WeakReference {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final RuntimeException f142768g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f142769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f142770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142771c;
    public final SoftReference d;
    public final AtomicBoolean e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f142768g = runtimeException;
    }

    public m3(n3 n3Var, k3 k3Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(n3Var, referenceQueue);
        this.e = new AtomicBoolean();
        this.d = new SoftReference(f ? new RuntimeException("ManagedChannel allocation site") : f142768g);
        this.f142771c = k3Var.toString();
        this.f142769a = referenceQueue;
        this.f142770b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            m3 m3Var = (m3) referenceQueue.poll();
            if (m3Var == null) {
                return;
            }
            SoftReference softReference = m3Var.d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            m3Var.f142770b.remove(m3Var);
            softReference.clear();
            if (!m3Var.e.get()) {
                Level level = Level.SEVERE;
                Logger logger = n3.d;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{m3Var.f142771c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f142770b.remove(this);
        this.d.clear();
        a(this.f142769a);
    }
}
