package df0;

import java.util.List;
import java.util.concurrent.TimeUnit;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f113741a = v.k("time.apple.com", "time.google.com", "time.cloudflare.com", "time.windows.com", "pool.ntp.org");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f113742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f113743c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f113742b = timeUnit.toMillis(15L);
        f113743c = timeUnit.toMillis(15L);
    }

    private a() {
    }
}
