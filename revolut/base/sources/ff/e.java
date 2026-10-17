package ff;

import df.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f134685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f134686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134687c;

    public e() {
        if (dfm.c.f114549b == null) {
            Pattern pattern = j.f113739c;
            dfm.c.f114549b = new dfm.c(5);
        }
        dfm.c cVar = dfm.c.f114549b;
        if (j.d == null) {
            j.d = new j(cVar);
        }
        this.f134685a = j.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f134687c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            df.j r0 = r4.f134685a     // Catch: java.lang.Throwable -> L19
            dfm.c r0 = r0.f113740a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f134686b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.e.a():boolean");
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f134687c = 0;
            }
            return;
        }
        this.f134687c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.f134687c);
                this.f134685a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
            } else {
                jMin = d;
            }
            this.f134685a.f113740a.getClass();
            this.f134686b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
