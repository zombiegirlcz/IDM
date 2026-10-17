package gcm;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class l {
    public static final Logger e = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f142739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.k2 f142740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f142741c;
    public cpi.g d;

    public l(m mVar, ScheduledExecutorService scheduledExecutorService, ecm.k2 k2Var) {
        this.f142739a = scheduledExecutorService;
        this.f142740b = k2Var;
    }

    public final void a(ag.q qVar) {
        this.f142740b.d();
        if (this.f142741c == null) {
            this.f142741c = new b1();
        }
        cpi.g gVar = this.d;
        if (gVar != null) {
            ecm.j2 j2Var = (ecm.j2) gVar.f107954b;
            if (!j2Var.f124829c && !j2Var.f124828b) {
                return;
            }
        }
        long jA = this.f142741c.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.d = this.f142740b.c(this.f142739a, qVar, jA, timeUnit);
        e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
