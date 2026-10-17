package gcm;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f142888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f142889c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    public final /* synthetic */ z f;

    public u(z zVar, ecm.w wVar, boolean z) {
        this.f = zVar;
        this.f142887a = z;
        if (wVar == null) {
            this.f142888b = false;
            this.f142889c = 0L;
        } else {
            this.f142888b = true;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            this.f142889c = wVar.a();
        }
    }

    public final ecm.g2 a() {
        long j2 = this.f142889c;
        long jAbs = Math.abs(j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j2) % timeUnit.toNanos(1L);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f142887a ? "Context" : "CallOptions");
        sb6.append(" deadline exceeded after ");
        if (j2 < 0) {
            sb6.append(CoreConstants.DASH_CHAR);
        }
        sb6.append(nanos);
        Locale locale = Locale.US;
        sb6.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb6.append("s. ");
        z zVar = this.f;
        sb6.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) zVar.f142985h.a(ecm.n.d)) == null ? 0.0d : r2.longValue() / z.f142980p)));
        if (zVar.i != null) {
            e4m.f fVar = new e4m.f(1, (byte) 0);
            zVar.i.d(fVar);
            sb6.append(" ");
            sb6.append(fVar);
        }
        return ecm.g2.f124804h.g(sb6.toString());
    }

    public final void b() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.getClass();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.i.k(a());
    }
}
