package zf;

import ag.m;
import ag.u;
import ag.v;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements cg.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Clock f321813j = DefaultClock.getInstance();
    public static final Random k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f321814l = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f321816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f321817c;
    public final pd.g d;
    public final df.e e;
    public final qd.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cf.b f321818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f321819h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f321815a = new HashMap();
    public final HashMap i = new HashMap();

    public g(Context context, ScheduledExecutorService scheduledExecutorService, pd.g gVar, df.e eVar, qd.b bVar, cf.b bVar2) {
        this.f321816b = context;
        this.f321817c = scheduledExecutorService;
        this.d = gVar;
        this.e = eVar;
        this.f = bVar;
        this.f321818g = bVar2;
        gVar.a();
        this.f321819h = gVar.f235025c.f235031b;
        AtomicReference atomicReference = f.f321812a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = f.f321812a;
        if (atomicReference2.get() == null) {
            f fVar = new f();
            while (true) {
                if (atomicReference2.compareAndSet(null, fVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(fVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new af.d(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized zf.a a(java.lang.String r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            java.lang.String r0 = "fetch"
            ag.e r7 = r14.c(r15, r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "activate"
            ag.e r8 = r14.c(r15, r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "defaults"
            ag.e r9 = r14.c(r15, r0)     // Catch: java.lang.Throwable -> Lb9
            android.content.Context r0 = r14.f321816b     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = r14.f321819h     // Catch: java.lang.Throwable -> Lb9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = "frc_"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb9
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = "_"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb9
            r2.append(r15)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = "_settings"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lb9
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> Lb9
            ag.u r12 = new ag.u     // Catch: java.lang.Throwable -> Lb9
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lb9
            ag.o r11 = new ag.o     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.ScheduledExecutorService r0 = r14.f321817c     // Catch: java.lang.Throwable -> Lb9
            r11.<init>(r0, r8, r9)     // Catch: java.lang.Throwable -> Lb9
            pd.g r0 = r14.d     // Catch: java.lang.Throwable -> Lb9
            cf.b r1 = r14.f321818g     // Catch: java.lang.Throwable -> Lb9
            r0.a()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = r0.f235024b     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "[DEFAULT]"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L62
            java.lang.String r0 = "firebase"
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L62
            cpi.g r0 = new cpi.g     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L7d
            zf.d r1 = new zf.d     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.HashSet r2 = r11.f4713a     // Catch: java.lang.Throwable -> L7a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7a
            java.util.HashSet r0 = r11.f4713a     // Catch: java.lang.Throwable -> L74
            r0.add(r1)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            goto L7d
        L74:
            r0 = move-exception
            r15 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r15     // Catch: java.lang.Throwable -> L7a
        L78:
            r1 = r14
            goto Lbc
        L7a:
            r0 = move-exception
            r15 = r0
            goto L78
        L7d:
            ao.h r0 = new ao.h     // Catch: java.lang.Throwable -> Lb9
            r1 = 3
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lb9
            r0.f7847b = r8     // Catch: java.lang.Throwable -> Lb9
            r0.f7848c = r9     // Catch: java.lang.Throwable -> Lb9
            com.google.firebase.messaging.t r13 = new com.google.firebase.messaging.t     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.ScheduledExecutorService r1 = r14.f321817c     // Catch: java.lang.Throwable -> Lb9
            r2 = 2
            r3 = 0
            r13.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> Lb9
            r2.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)     // Catch: java.lang.Throwable -> Lb9
            r13.e = r2     // Catch: java.lang.Throwable -> Lb9
            r13.f49543b = r8     // Catch: java.lang.Throwable -> Lb9
            r13.f49544c = r0     // Catch: java.lang.Throwable -> Lb9
            r13.d = r1     // Catch: java.lang.Throwable -> Lb9
            pd.g r2 = r14.d     // Catch: java.lang.Throwable -> Lb9
            df.e r4 = r14.e     // Catch: java.lang.Throwable -> Lb9
            qd.b r5 = r14.f     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.ScheduledExecutorService r6 = r14.f321817c     // Catch: java.lang.Throwable -> Lb9
            ag.m r10 = r14.d(r15, r7, r12)     // Catch: java.lang.Throwable -> Lb9
            r1 = r14
            r3 = r15
            zf.a r15 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r14)
            return r15
        Lb6:
            r0 = move-exception
        Lb7:
            r15 = r0
            goto Lbc
        Lb9:
            r0 = move-exception
            r1 = r14
            goto Lb7
        Lbc:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lb6
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.g.a(java.lang.String):zf.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized zf.a b(pd.g r14, java.lang.String r15, df.e r16, qd.b r17, java.util.concurrent.Executor r18, ag.e r19, ag.e r20, ag.e r21, ag.m r22, ag.o r23, ag.u r24, com.google.firebase.messaging.t r25) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.util.HashMap r0 = r13.f321815a     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.containsKey(r15)     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L7c
            zf.a r10 = new zf.a     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "firebase"
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L23
            r14.a()     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r14.f235024b     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L23
            r11 = r17
            goto L25
        L23:
            r0 = 0
            r11 = r0
        L25:
            android.content.Context r5 = r13.f321816b     // Catch: java.lang.Throwable -> L75
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L75
            r12 = r10
            jpf.a r10 = new jpf.a     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.ScheduledExecutorService r9 = r13.f321817c     // Catch: java.lang.Throwable -> L78
            r10.<init>()     // Catch: java.lang.Throwable -> L78
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L78
            r7.<init>()     // Catch: java.lang.Throwable -> L78
            r10.f177267a = r7     // Catch: java.lang.Throwable -> L78
            ag.s r0 = new ag.s     // Catch: java.lang.Throwable -> L78
            r1 = r14
            r6 = r15
            r2 = r16
            r4 = r20
            r3 = r22
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            r10.f177268b = r0     // Catch: java.lang.Throwable -> L78
            r10.f177269c = r9     // Catch: java.lang.Throwable -> L78
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L75
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r2 = r11
            r1 = r12
            r11 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L75
            r12 = r1
            r20.b()     // Catch: java.lang.Throwable -> L75
            r21.b()     // Catch: java.lang.Throwable -> L75
            r19.b()     // Catch: java.lang.Throwable -> L75
            java.util.HashMap r0 = r13.f321815a     // Catch: java.lang.Throwable -> L75
            r0.put(r15, r12)     // Catch: java.lang.Throwable -> L75
            java.util.HashMap r0 = zf.g.f321814l     // Catch: java.lang.Throwable -> L75
            r0.put(r15, r12)     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r0 = move-exception
            r14 = r0
            goto L86
        L78:
            r0 = move-exception
            r14 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L78
            throw r14     // Catch: java.lang.Throwable -> L75
        L7c:
            java.util.HashMap r0 = r13.f321815a     // Catch: java.lang.Throwable -> L75
            java.lang.Object r14 = r0.get(r15)     // Catch: java.lang.Throwable -> L75
            zf.a r14 = (zf.a) r14     // Catch: java.lang.Throwable -> L75
            monitor-exit(r13)
            return r14
        L86:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L75
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.g.b(pd.g, java.lang.String, df.e, qd.b, java.util.concurrent.Executor, ag.e, ag.e, ag.e, ag.m, ag.o, ag.u, com.google.firebase.messaging.t):zf.a");
    }

    public final ag.e c(String str, String str2) {
        v vVar;
        ag.e eVar;
        String strI = v0.a.i(v0.a.m("frc_", this.f321819h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f321817c;
        Context context = this.f321816b;
        HashMap map = v.f4742c;
        synchronized (v.class) {
            try {
                HashMap map2 = v.f4742c;
                if (!map2.containsKey(strI)) {
                    map2.put(strI, new v(context, strI));
                }
                vVar = (v) map2.get(strI);
            } finally {
            }
        }
        HashMap map3 = ag.e.d;
        synchronized (ag.e.class) {
            try {
                String str3 = vVar.f4744b;
                HashMap map4 = ag.e.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new ag.e(scheduledExecutorService, vVar));
                }
                eVar = (ag.e) map4.get(str3);
            } finally {
            }
        }
        return eVar;
    }

    public final synchronized m d(String str, ag.e eVar, u uVar) {
        df.e eVar2;
        cf.b bVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        pd.g gVar;
        try {
            eVar2 = this.e;
            pd.g gVar2 = this.d;
            gVar2.a();
            bVar = gVar2.f235024b.equals("[DEFAULT]") ? this.f321818g : new cf.b() { // from class: zf.e
                @Override // cf.b
                public final Object get() {
                    Clock clock2 = g.f321813j;
                    return null;
                }
            };
            scheduledExecutorService = this.f321817c;
            clock = f321813j;
            random = k;
            pd.g gVar3 = this.d;
            gVar3.a();
            str2 = gVar3.f235025c.f235030a;
            gVar = this.d;
            gVar.a();
        } catch (Throwable th10) {
            throw th10;
        }
        return new m(eVar2, bVar, scheduledExecutorService, clock, random, eVar, new ConfigFetchHttpClient(this.f321816b, gVar.f235025c.f235031b, str2, str, uVar.c(), uVar.c()), uVar, this.i);
    }
}
