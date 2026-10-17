package gcm;

import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f142873c = Logger.getLogger(ecm.g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f142874a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.n0 f142875b;

    public t(ecm.n0 n0Var, long j2, String str) {
        Preconditions.checkNotNull(str, "description");
        this.f142875b = (ecm.n0) Preconditions.checkNotNull(n0Var, "logId");
        String strR = a0.d.r(str, " created");
        ecm.g0 g0Var = ecm.g0.CT_INFO;
        Long lValueOf = Long.valueOf(j2);
        Preconditions.checkNotNull(strR, "description");
        Preconditions.checkNotNull(g0Var, "severity");
        Preconditions.checkNotNull(lValueOf, "timestampNanos");
        Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
        b(new ecm.h0(strR, g0Var, j2, null));
    }

    public static void a(ecm.n0 n0Var, Level level, String str) {
        Logger logger = f142873c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + n0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(ecm.h0 h0Var) {
        int i = s.f142857a[h0Var.f124813b.ordinal()];
        Level level = i != 1 ? i != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        synchronized (this.f142874a) {
        }
        a(this.f142875b, level, h0Var.f124812a);
    }
}
