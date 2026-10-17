package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.revolut.tracking.v3.RawEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class p0 extends ecm.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0 f142802j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f142803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f142804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.v f142805c;
    public volatile boolean d;
    public ecm.h e;
    public ecm.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ecm.g2 f142806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f142807h = new ArrayList();
    public o0 i;

    static {
        Logger.getLogger(p0.class.getName());
        f142802j = new m0(0);
    }

    public p0(Executor executor, ScheduledExecutorService scheduledExecutorService, ecm.w wVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f142804b = (Executor) Preconditions.checkNotNull(executor, "callExecutor");
        Preconditions.checkNotNull(scheduledExecutorService, "scheduler");
        ecm.v vVarB = ecm.v.b();
        this.f142805c = vVarB;
        vVarB.getClass();
        if (wVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jA = wVar.a();
            long jAbs = Math.abs(jA);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jA) % timeUnit2.toNanos(1L);
            StringBuilder sb6 = new StringBuilder();
            if (jA < 0) {
                sb6.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb6.append("Deadline CallOptions will be exceeded in ");
            }
            sb6.append(nanos);
            sb6.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb6.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new ch.p(4, this, false, sb6), jA, timeUnit);
        }
        this.f142803a = scheduledFutureSchedule;
    }

    @Override // ecm.i
    public final void a(String str, Throwable th10) {
        ecm.g2 g2Var = ecm.g2.f;
        ecm.g2 g2VarG = str != null ? g2Var.g(str) : g2Var.g("Call cancelled without message");
        if (th10 != null) {
            g2VarG = g2VarG.f(th10);
        }
        f(g2VarG, false);
    }

    @Override // ecm.i
    public final void b() {
        g(new l0(this, 1));
    }

    @Override // ecm.i
    public final void c() {
        if (this.d) {
            this.f.c();
        } else {
            g(new l0(this, 0));
        }
    }

    @Override // ecm.i
    public final void d(RawEvent rawEvent) {
        if (this.d) {
            this.f.d(rawEvent);
        } else {
            g(new ch.p(5, this, false, rawEvent));
        }
    }

    @Override // ecm.i
    public final void e(ecm.h hVar, ecm.m1 m1Var) {
        ecm.g2 g2Var;
        boolean z;
        Preconditions.checkState(this.e == null, "already started");
        synchronized (this) {
            try {
                this.e = (ecm.h) Preconditions.checkNotNull(hVar, "listener");
                g2Var = this.f142806g;
                z = this.d;
                if (!z) {
                    o0 o0Var = new o0(hVar);
                    this.i = o0Var;
                    hVar = o0Var;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (g2Var != null) {
            this.f142804b.execute(new n0(this, hVar, g2Var));
        } else if (z) {
            this.f.e(hVar, m1Var);
        } else {
            g(new ecm.h2(this, 1, hVar, m1Var));
        }
    }

    public final void f(ecm.g2 g2Var, boolean z) {
        ecm.h hVar;
        synchronized (this) {
            try {
                ecm.i iVar = this.f;
                boolean z3 = true;
                if (iVar == null) {
                    m0 m0Var = f142802j;
                    if (iVar != null) {
                        z3 = false;
                    }
                    Preconditions.checkState(z3, "realCall already set to %s", iVar);
                    ScheduledFuture scheduledFuture = this.f142803a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f = m0Var;
                    hVar = this.e;
                    this.f142806g = g2Var;
                    z3 = false;
                } else if (z) {
                    return;
                } else {
                    hVar = null;
                }
                if (z3) {
                    g(new au0.x5(8, (Object) this, false, (Object) g2Var));
                } else {
                    if (hVar != null) {
                        this.f142804b.execute(new n0(this, hVar, g2Var));
                    }
                    h();
                }
                f3 f3Var = (f3) this;
                f3Var.o.d.f142719n.execute(new com.bumptech.glide.k(f3Var, 5));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.d) {
                    runnable.run();
                } else {
                    this.f142807h.add(runnable);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f142807h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f142807h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L24
            gcm.o0 r0 = r3.i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f142804b
            gcm.k0 r2 = new gcm.k0
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f142807h     // Catch: java.lang.Throwable -> L24
            r3.f142807h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.p0.h():void");
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("realCall", this.f).toString();
    }
}
