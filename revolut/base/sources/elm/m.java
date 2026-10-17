package elm;

import java.util.concurrent.TimeUnit;
import zkm.v;

/* JADX INFO: loaded from: classes13.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f127548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f127549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127550c;
    public static final int d;
    public static final long e;
    public static final i f;

    static {
        String property;
        int i = v.f323125a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f127548a = property;
        f127549b = zkm.g.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = v.f323125a;
        if (i2 < 2) {
            i2 = 2;
        }
        f127550c = zkm.g.g(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = zkm.g.g(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(zkm.g.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = i.f127543a;
    }
}
