package wf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.i;
import java.util.concurrent.TimeUnit;
import nf.h;
import nf.t;
import nf.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final long i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f296842b;
    public final i e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f296844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f296845h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f296843c = 500;
    public double d = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f296841a = new Timer();

    static {
        qf.a.d();
        i = TimeUnit.SECONDS.toMicros(1L);
    }

    public c(i iVar, ah.a aVar, nf.a aVar2, String str) {
        nf.i iVar2;
        long jLongValue;
        h hVar;
        long jLongValue2;
        t tVar;
        u uVar;
        this.f296842b = iVar;
        long jK = str == "Trace" ? aVar2.k() : aVar2.k();
        if (str == "Trace") {
            synchronized (u.class) {
                try {
                    if (u.f214787a == null) {
                        u.f214787a = new u();
                    }
                    uVar = u.f214787a;
                } finally {
                }
            }
            RemoteConfigManager remoteConfigManager = aVar2.f214765a;
            uVar.getClass();
            f fVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (fVar.b() && nf.a.l(((Long) fVar.a()).longValue())) {
                aVar2.f214767c.e(((Long) fVar.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jLongValue = ((Long) fVar.a()).longValue();
            } else {
                f fVarC = aVar2.c(uVar);
                jLongValue = (fVarC.b() && nf.a.l(((Long) fVarC.a()).longValue())) ? ((Long) fVarC.a()).longValue() : 300L;
            }
        } else {
            synchronized (nf.i.class) {
                try {
                    if (nf.i.f214775a == null) {
                        nf.i.f214775a = new nf.i();
                    }
                    iVar2 = nf.i.f214775a;
                } finally {
                }
            }
            RemoteConfigManager remoteConfigManager2 = aVar2.f214765a;
            iVar2.getClass();
            f fVar2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (fVar2.b() && nf.a.l(((Long) fVar2.a()).longValue())) {
                aVar2.f214767c.e(((Long) fVar2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                jLongValue = ((Long) fVar2.a()).longValue();
            } else {
                f fVarC2 = aVar2.c(iVar2);
                jLongValue = (fVarC2.b() && nf.a.l(((Long) fVarC2.a()).longValue())) ? ((Long) fVarC2.a()).longValue() : 700L;
            }
        }
        long j2 = jLongValue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new i(j2, jK, timeUnit);
        this.f296844g = j2;
        long jK2 = str == "Trace" ? aVar2.k() : aVar2.k();
        if (str == "Trace") {
            synchronized (t.class) {
                try {
                    if (t.f214786a == null) {
                        t.f214786a = new t();
                    }
                    tVar = t.f214786a;
                } finally {
                }
            }
            RemoteConfigManager remoteConfigManager3 = aVar2.f214765a;
            tVar.getClass();
            f fVar3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (fVar3.b() && nf.a.l(((Long) fVar3.a()).longValue())) {
                aVar2.f214767c.e(((Long) fVar3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                jLongValue2 = ((Long) fVar3.a()).longValue();
            } else {
                f fVarC3 = aVar2.c(tVar);
                jLongValue2 = (fVarC3.b() && nf.a.l(((Long) fVarC3.a()).longValue())) ? ((Long) fVarC3.a()).longValue() : 30L;
            }
        } else {
            synchronized (h.class) {
                try {
                    if (h.f214774a == null) {
                        h.f214774a = new h();
                    }
                    hVar = h.f214774a;
                } finally {
                }
            }
            RemoteConfigManager remoteConfigManager4 = aVar2.f214765a;
            hVar.getClass();
            f fVar4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (fVar4.b() && nf.a.l(((Long) fVar4.a()).longValue())) {
                aVar2.f214767c.e(((Long) fVar4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                jLongValue2 = ((Long) fVar4.a()).longValue();
            } else {
                f fVarC4 = aVar2.c(hVar);
                jLongValue2 = (fVarC4.b() && nf.a.l(((Long) fVarC4.a()).longValue())) ? ((Long) fVarC4.a()).longValue() : 70L;
            }
        }
        long j3 = jLongValue2;
        this.f = new i(j3, jK2, timeUnit);
        this.f296845h = j3;
    }

    public final synchronized void a(boolean z) {
        try {
            this.f296842b = z ? this.e : this.f;
            this.f296843c = z ? this.f296844g : this.f296845h;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0001, B:9:0x002e, B:14:0x0056, B:16:0x0061, B:19:0x0072, B:21:0x007a, B:10:0x0036, B:11:0x003f, B:12:0x0042, B:13:0x004c), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0001, B:9:0x002e, B:14:0x0056, B:16:0x0061, B:19:0x0072, B:21:0x007a, B:10:0x0036, B:11:0x003f, B:12:0x0042, B:13:0x004c), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.firebase.perf.util.Timer r0 = new com.google.firebase.perf.util.Timer     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            com.google.firebase.perf.util.Timer r1 = r13.f296841a     // Catch: java.lang.Throwable -> L70
            r1.getClass()     // Catch: java.lang.Throwable -> L70
            long r2 = r0.f49593b     // Catch: java.lang.Throwable -> L70
            long r4 = r1.f49593b     // Catch: java.lang.Throwable -> L70
            long r2 = r2 - r4
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L70
            com.google.firebase.perf.util.i r3 = r13.f296842b     // Catch: java.lang.Throwable -> L70
            long r4 = r3.f49607b     // Catch: java.lang.Throwable -> L70
            long r6 = r3.f49606a     // Catch: java.lang.Throwable -> L70
            int[] r8 = com.google.firebase.perf.util.h.f49605a     // Catch: java.lang.Throwable -> L70
            java.io.Serializable r3 = r3.f49608c     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.TimeUnit r3 = (java.util.concurrent.TimeUnit) r3     // Catch: java.lang.Throwable -> L70
            int r9 = r3.ordinal()     // Catch: java.lang.Throwable -> L70
            r8 = r8[r9]     // Catch: java.lang.Throwable -> L70
            r9 = 1
            r10 = 1
            if (r8 == r9) goto L4c
            r12 = 2
            if (r8 == r12) goto L42
            r12 = 3
            if (r8 == r12) goto L36
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L70
            long r3 = r3.toSeconds(r4)     // Catch: java.lang.Throwable -> L70
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L70
            double r6 = r6 / r3
            goto L56
        L36:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L70
            double r3 = (double) r4     // Catch: java.lang.Throwable -> L70
            double r6 = r6 / r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L70
            long r3 = r3.toMillis(r10)     // Catch: java.lang.Throwable -> L70
        L3f:
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L70
            double r6 = r6 * r3
            goto L56
        L42:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L70
            double r3 = (double) r4     // Catch: java.lang.Throwable -> L70
            double r6 = r6 / r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L70
            long r3 = r3.toMicros(r10)     // Catch: java.lang.Throwable -> L70
            goto L3f
        L4c:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L70
            double r3 = (double) r4     // Catch: java.lang.Throwable -> L70
            double r6 = r6 / r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L70
            long r3 = r3.toNanos(r10)     // Catch: java.lang.Throwable -> L70
            goto L3f
        L56:
            double r1 = r1 * r6
            long r3 = wf.c.i     // Catch: java.lang.Throwable -> L70
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L70
            double r1 = r1 / r3
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L72
            double r3 = r13.d     // Catch: java.lang.Throwable -> L70
            double r3 = r3 + r1
            long r1 = r13.f296843c     // Catch: java.lang.Throwable -> L70
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L70
            double r1 = java.lang.Math.min(r3, r1)     // Catch: java.lang.Throwable -> L70
            r13.d = r1     // Catch: java.lang.Throwable -> L70
            r13.f296841a = r0     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r0 = move-exception
            goto L82
        L72:
            double r0 = r13.d     // Catch: java.lang.Throwable -> L70
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7f
            double r0 = r0 - r2
            r13.d = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r13)
            return r9
        L7f:
            monitor-exit(r13)
            r0 = 0
            return r0
        L82:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L70
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.c.b():boolean");
    }
}
