package hk;

import java.util.List;
import java.util.concurrent.TimeUnit;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f152837a = v.k("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f152838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f152839c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.toMillis(1L);
        timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f152838b = timeUnit2.toMillis(6L);
        f152839c = timeUnit2.toMillis(5L);
    }
}
