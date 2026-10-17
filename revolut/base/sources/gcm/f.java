package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f142634c = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f142636b;

    public f(long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f142636b = atomicLong;
        Preconditions.checkArgument(j2 > 0, "value must be positive");
        this.f142635a = "keepalive time nanos";
        atomicLong.set(j2);
    }
}
