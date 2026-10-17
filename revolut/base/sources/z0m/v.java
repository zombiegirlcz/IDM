package z0m;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.core.util.Consumer;
import androidx.preference.PreferenceManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.fourthline.vision.internal.sh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import z0m.i;
import z0m.j;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public final class v {

    @NotNull
    public static final t Companion = new t();
    public boolean A;
    public boolean B;
    public boolean C;
    public u0m.a D;
    public final u E;
    public final u F;
    public final u G;
    public final u H;
    public final u I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f318670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f318671c;
    public final y0m.k d;
    public final String e;
    public final AtomicBoolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f318672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s0m.c f318673h;
    public s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x0m.f f318674j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i1m.b f318675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i1m.c f318676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f318677n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f318678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TimeUnit f318679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f318680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f318681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f318682t;
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f318683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f318684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable[] f318685y;
    public boolean z;

    public v(final s0m.c emitter, String appId, List list, i1m.d dVar, final Context context, Function1 function1) {
        u uVar;
        u uVar2;
        u uVar3;
        int i;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Intrinsics.checkNotNullParameter("com.fourthline.sdk", "namespace");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318669a = appId;
        this.d = new y0m.k();
        this.e = "andr-6.2.0";
        final int i2 = 1;
        this.f = new AtomicBoolean(true);
        this.f318672g = new o(list, dVar == null ? new i1m.d() : dVar, context);
        this.f318673h = emitter;
        i1m.b bVar = y.f318686a;
        this.k = true;
        this.f318675l = y.f318686a;
        this.f318676m = y.f318687b;
        this.f318677n = 1800L;
        this.o = 1800L;
        final int i3 = 0;
        this.f318678p = false;
        TimeUnit timeUnit = y.f318688c;
        this.f318679q = timeUnit;
        this.f318680r = y.i;
        this.f318681s = false;
        this.f318682t = y.f318691j;
        this.u = y.f318693m;
        this.v = y.k;
        this.f318683w = false;
        Runnable[] runnableArr = {null, null, null, null};
        this.f318685y = runnableArr;
        this.z = y.d;
        this.A = false;
        this.B = y.e;
        this.C = y.f318690h;
        u uVar4 = new u(this, 3);
        this.E = uVar4;
        u uVar5 = new u(this, 4);
        this.F = uVar5;
        u uVar6 = new u(this, 2);
        this.G = uVar6;
        u uVar7 = new u(this, 1);
        this.H = uVar7;
        u uVar8 = new u(this, 0);
        this.I = uVar8;
        this.f318671c = context;
        ((c) function1).invoke(this);
        s0m.f.a(false, emitter.f258999a, new Runnable() { // from class: s0m.a
            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        c this$0 = (c) emitter;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AtomicBoolean atomicBoolean = this$0.f259001c;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            try {
                                this$0.c();
                                this$0.a((g1m.e) this$0.f259015y.get());
                            } catch (Throwable th10) {
                                atomicBoolean.set(false);
                                String TAG = this$0.f258999a;
                                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                                j.b(TAG, "Received error during emission process: %s", th10);
                                return;
                            }
                        }
                        break;
                    default:
                        Context context2 = (Context) emitter;
                        Intrinsics.checkNotNullParameter(context2, "$context");
                        z0m.e.Companion.getClass();
                        if (PreferenceManager.getDefaultSharedPreferences(context2).getString("installed_before", null) == null) {
                            z0m.e eVar = new z0m.e();
                            z0m.h hVar = i.Companion;
                            z0m.c callback = new z0m.c(eVar, context2, 0);
                            hVar.getClass();
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(callback, "callback");
                            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context2).build();
                            installReferrerClientBuild.startConnection(new g1m.c(installReferrerClientBuild, callback));
                        }
                        break;
                }
            }
        });
        String str = this.f318684x;
        if (str != null) {
            String strReplace = new Regex("[^A-Za-z0-9.-]").replace(str, "");
            if (strReplace.length() > 0) {
                String str2 = this.e + zsc.p.SPACE_CHAR + strReplace;
                if (!this.f318670b) {
                    this.e = str2;
                }
            }
        }
        if (this.f318681s && this.f318676m == i1m.c.OFF) {
            i1m.c level = i1m.c.ERROR;
            Intrinsics.checkNotNullParameter(level, "level");
            if (!this.f318670b) {
                this.f318676m = level;
            }
        }
        i1m.c newLevel = this.f318676m;
        Intrinsics.checkNotNullParameter(newLevel, "newLevel");
        j.f318646a = newLevel.a();
        if (this.z) {
            uVar = uVar6;
            uVar3 = uVar8;
            uVar2 = uVar7;
            this.f318674j = x0m.f.Companion.a(context, this.f318677n, this.o, timeUnit, runnableArr, this.f318678p);
        } else {
            uVar = uVar6;
            uVar2 = uVar7;
            uVar3 = uVar8;
        }
        a1m.d.a("SnowplowTrackerDiagnostic", uVar2);
        a1m.d.a("SnowplowScreenView", uVar5);
        a1m.d.a("SnowplowLifecycleTracking", uVar4);
        a1m.d.a("SnowplowInstallTracking", uVar);
        a1m.d.a("SnowplowCrashReporting", uVar3);
        if (this.f318680r && !(Thread.getDefaultUncaughtExceptionHandler() instanceof g)) {
            Thread.setDefaultUncaughtExceptionHandler(new g());
        }
        if (this.u) {
            e.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            s0m.f.a(false, "e", new Runnable() { // from class: s0m.a
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            c this$0 = (c) context;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            AtomicBoolean atomicBoolean = this$0.f259001c;
                            if (atomicBoolean.compareAndSet(false, true)) {
                                try {
                                    this$0.c();
                                    this$0.a((g1m.e) this$0.f259015y.get());
                                } catch (Throwable th10) {
                                    atomicBoolean.set(false);
                                    String TAG = this$0.f258999a;
                                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                                    j.b(TAG, "Received error during emission process: %s", th10);
                                    return;
                                }
                            }
                            break;
                        default:
                            Context context2 = (Context) context;
                            Intrinsics.checkNotNullParameter(context2, "$context");
                            z0m.e.Companion.getClass();
                            if (PreferenceManager.getDefaultSharedPreferences(context2).getString("installed_before", null) == null) {
                                z0m.e eVar = new z0m.e();
                                z0m.h hVar = i.Companion;
                                z0m.c callback = new z0m.c(eVar, context2, 0);
                                hVar.getClass();
                                Intrinsics.checkNotNullParameter(context2, "context");
                                Intrinsics.checkNotNullParameter(callback, "callback");
                                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context2).build();
                                installReferrerClientBuild.startConnection(new g1m.c(installReferrerClientBuild, callback));
                            }
                            break;
                    }
                }
            });
        }
        if (this.v) {
            synchronized (b.Companion) {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (b.f318642b == null) {
                        b bVar2 = new b();
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        if (application != null) {
                            application.registerActivityLifecycleCallbacks(bVar2);
                        }
                        b.f318642b = bVar2;
                    }
                    Intrinsics.h(b.f318642b);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        if (this.f318682t) {
            synchronized (x0m.d.Companion) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (x0m.d.f301662a == x0m.c.NONE) {
                    x0m.d.f301662a = x0m.c.IN_PROGRESS;
                    new Handler(context.getMainLooper()).post(new x0m.a());
                }
            }
            a(new y0m.f());
        }
        x0m.f fVar = this.f318674j;
        if (fVar != null) {
            i = 0;
            fVar.d(false);
            Intrinsics.checkNotNullExpressionValue("v", "TAG");
            j.a("v", "Session checking has been resumed.", new Object[0]);
        } else {
            i = 0;
        }
        this.f318670b = true;
        Intrinsics.checkNotNullExpressionValue("v", "TAG");
        j.e("v", "Tracker created successfully.", new Object[i]);
    }

    public final void a(y0m.i stateMachine) {
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        y0m.k kVar = this.d;
        synchronized (kVar) {
            try {
                Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
                y0m.i iVar = (y0m.i) kVar.f310233a.get(stateMachine.getIdentifier());
                if (iVar != null) {
                    if (stateMachine.getClass().equals(iVar.getClass())) {
                        return;
                    } else {
                        kVar.d(stateMachine.getIdentifier());
                    }
                }
                kVar.f310233a.put(stateMachine.getIdentifier(), stateMachine);
                kVar.f310234b.put(stateMachine, stateMachine.getIdentifier());
                y0m.k.a(kVar.f310235c, stateMachine.b(), stateMachine);
                y0m.k.a(kVar.d, stateMachine.i(), stateMachine);
                y0m.k.a(kVar.e, stateMachine.j(), stateMachine);
                y0m.k.a(kVar.f, stateMachine.l(), stateMachine);
                y0m.k.a(kVar.f310236g, stateMachine.f(), stateMachine);
                y0m.k.a(kVar.f310237h, stateMachine.c(), stateMachine);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void b() {
        x0m.f fVar = this.f318674j;
        if (fVar != null) {
            fVar.d(true);
            Intrinsics.checkNotNullExpressionValue("v", "TAG");
            j.a("v", "Session checking has been paused.", new Object[0]);
        }
    }

    public final UUID c(f1m.a event) {
        LinkedList linkedList;
        List listD;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f.get()) {
            return null;
        }
        y0m.k kVar = this.d;
        synchronized (kVar) {
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                linkedList = new LinkedList();
                if (event instanceof f1m.a) {
                    LinkedList<y0m.i> linkedList2 = new LinkedList();
                    List list = (List) kVar.f310237h.get(event.b());
                    if (list != null) {
                        linkedList2.addAll(list);
                    }
                    List list2 = (List) kVar.f310237h.get("*");
                    if (list2 != null) {
                        linkedList2.addAll(list2);
                    }
                    for (y0m.i iVar : linkedList2) {
                        if (((String) kVar.f310234b.get(iVar)) != null && (listD = iVar.d(event)) != null) {
                            linkedList.addAll(listD);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList<f1m.a> arrayListE0 = d0.E0(zhm.u.c(event), linkedList);
        Iterator it8 = arrayListE0.iterator();
        while (it8.hasNext()) {
            ((f1m.a) it8.next()).getClass();
            Intrinsics.checkNotNullParameter(this, "tracker");
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListE0, 10));
                for (f1m.a aVar : arrayListE0) {
                    z zVar = new z(aVar, this.d.e(aVar));
                    d(zVar);
                    arrayList.add(new Pair(aVar, zVar));
                }
                ref$ObjectRef.f186409a = arrayList;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        s0m.f.a(!(event instanceof f1m.k), "v", new sh(ref$ObjectRef, this, 5));
        return ((z) ((Pair) d0.m0((List) ref$ObjectRef.f186409a)).f186386b).e;
    }

    public final void d(z zVar) {
        e1m.a aVar;
        Consumer consumer;
        if (zVar.f318697g || !this.z) {
            return;
        }
        String eventId = zVar.e.toString();
        Intrinsics.checkNotNullExpressionValue(eventId, "event.eventId.toString()");
        long j2 = zVar.f;
        x0m.f fVar = this.f318674j;
        if (fVar == null) {
            Intrinsics.checkNotNullExpressionValue("v", "TAG");
            j.d("v", "Session not ready or method getHasLoadedFromFile returned false with eventId: %s", eventId);
            return;
        }
        boolean z = this.f318683w;
        synchronized (fVar) {
            try {
                Intrinsics.checkNotNullParameter(eventId, "eventId");
                Intrinsics.checkNotNullExpressionValue("f", "TAG");
                j.e("f", "Getting session context...", new Object[0]);
                aVar = null;
                if (fVar.f301667h) {
                    if (!fVar.f301666g.get()) {
                        i1m.f fVar2 = fVar.e;
                        Long l2 = fVar2 != null ? fVar2.i : null;
                        if (l2 != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j3 = fVar.f.get() ? fVar.f301668j : fVar.i;
                            if (jCurrentTimeMillis < l2.longValue() || jCurrentTimeMillis - l2.longValue() > j3) {
                            }
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue("f", "TAG");
                    j.a("f", "Update session information.", new Object[0]);
                    fVar.e(j2, eventId);
                    i1m.f fVar3 = fVar.e;
                    if (fVar3 != null && (consumer = fVar.o) != null) {
                        Thread thread = new Thread(new sh(consumer, fVar3, 3));
                        thread.setDaemon(true);
                        thread.start();
                    }
                    if (fVar.f.get()) {
                        x0m.f.a(fVar.f301671n);
                    } else {
                        x0m.f.a(fVar.f301670m);
                    }
                    if (!fVar.f301663a) {
                        fVar.c();
                    }
                }
                i1m.f fVar4 = fVar.e;
                if (fVar4 == null) {
                    Intrinsics.checkNotNullExpressionValue("f", "TAG");
                    j.e("f", "Session state not present", new Object[0]);
                } else {
                    boolean z3 = fVar.f301667h;
                    Integer num = fVar4.f157659h;
                    fVar4.f157659h = Integer.valueOf((num != null ? num.intValue() : 0) + 1);
                    if (z3) {
                        fVar4.i = Long.valueOf(System.currentTimeMillis());
                    }
                    if (fVar.f301663a) {
                        fVar.c();
                    }
                    HashMap values = new HashMap(fVar4.a());
                    if (z) {
                        values.put("userId", "00000000-0000-0000-0000-000000000000");
                        values.put("previousSessionId", null);
                    }
                    Intrinsics.checkNotNullParameter(values, "values");
                    aVar = new e1m.a("iglu:com.snowplowanalytics.snowplow/client_session/jsonschema/1-0-2", values);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (aVar != null) {
            ((ArrayList) zVar.b()).add(aVar);
        }
    }
}
