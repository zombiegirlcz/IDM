package com.google.firebase.perf.metrics;

import a0.d;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import ce.j;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nf.a;
import pd.g;
import rf.b;
import wf.e;
import xf.m0;
import xf.n;
import xf.q0;
import xf.t0;

/* JADX INFO: loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    public static final Timer v = new Timer();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f49562w = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static volatile AppStartTrace f49563x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static ThreadPoolExecutor f49564y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f49566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f49567c;
    public final q0 d;
    public Application e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Timer f49568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Timer f49569h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PerfSession f49575q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49565a = false;
    public boolean f = false;
    public Timer i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f49570j = null;
    public Timer k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f49571l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Timer f49572m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Timer f49573n = null;
    public Timer o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Timer f49574p = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f49576r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f49577s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f49578t = new b(this);
    public boolean u = false;

    public AppStartTrace(e eVar, ah.a aVar, a aVar2, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.f49566b = eVar;
        this.f49567c = aVar2;
        f49564y = threadPoolExecutor;
        q0 q0VarNewBuilder = t0.newBuilder();
        q0VarNewBuilder.l("_experiment_app_start_ttid");
        this.d = q0VarNewBuilder;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        long micros2 = timeUnit.toMicros(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f49568g = new Timer((micros - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + micros2, micros);
        pd.a aVar3 = (pd.a) g.c().b(pd.a.class);
        if (aVar3 != null) {
            long micros3 = timeUnit.toMicros(aVar3.f235012b);
            timer = new Timer((micros3 - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros3);
        }
        this.f49569h = timer;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strR = d.r(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strR))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.f49569h;
        return timer != null ? timer : v;
    }

    public final Timer b() {
        Timer timer = this.f49568g;
        return timer != null ? timer : a();
    }

    public final void d(q0 q0Var) {
        if (this.f49573n == null || this.o == null || this.f49574p == null) {
            return;
        }
        f49564y.execute(new j(this, q0Var, 19));
        e();
    }

    public final synchronized void e() {
        if (this.f49565a) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
            this.e.unregisterActivityLifecycleCallbacks(this);
            this.f49565a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.f49576r && this.i == null) {
                this.u = this.u || c(this.e);
                new WeakReference(activity);
                this.i = new Timer();
                if (b().b(this.i) > f49562w) {
                    this.f = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f49576r || this.f || !this.f49567c.f() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f49578t);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [rf.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f49576r && !this.f) {
                boolean zF = this.f49567c.f();
                if (zF && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f49578t);
                    final int i = 0;
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(new com.google.firebase.perf.util.d(viewFindViewById, new Runnable(this) { // from class: rf.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f253663b;

                        {
                            this.f253663b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            AppStartTrace appStartTrace = this.f253663b;
                            switch (i2) {
                                case 0:
                                    q0 q0Var = appStartTrace.d;
                                    if (appStartTrace.f49574p == null) {
                                        appStartTrace.f49574p = new Timer();
                                        q0 q0VarNewBuilder = t0.newBuilder();
                                        q0VarNewBuilder.l("_experiment_onDrawFoQ");
                                        q0VarNewBuilder.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder.k(appStartTrace.b().b(appStartTrace.f49574p));
                                        q0Var.h((t0) q0VarNewBuilder.a());
                                        if (appStartTrace.f49568g != null) {
                                            q0 q0VarNewBuilder2 = t0.newBuilder();
                                            q0VarNewBuilder2.l("_experiment_procStart_to_classLoad");
                                            q0VarNewBuilder2.j(appStartTrace.b().f49592a);
                                            q0VarNewBuilder2.k(appStartTrace.b().b(appStartTrace.a()));
                                            q0Var.h((t0) q0VarNewBuilder2.a());
                                        }
                                        String str = appStartTrace.u ? "true" : "false";
                                        q0Var.c();
                                        ((t0) q0Var.f49761b).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                        q0Var.i(appStartTrace.f49577s, "onDrawCount");
                                        m0 m0VarA = appStartTrace.f49575q.a();
                                        q0Var.c();
                                        ((t0) q0Var.f49761b).addPerfSessions(m0VarA);
                                        appStartTrace.d(q0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    q0 q0Var2 = appStartTrace.d;
                                    if (appStartTrace.f49573n == null) {
                                        appStartTrace.f49573n = new Timer();
                                        q0Var2.j(appStartTrace.b().f49592a);
                                        q0Var2.k(appStartTrace.b().b(appStartTrace.f49573n));
                                        appStartTrace.d(q0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    q0 q0Var3 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        q0 q0VarNewBuilder3 = t0.newBuilder();
                                        q0VarNewBuilder3.l("_experiment_preDrawFoQ");
                                        q0VarNewBuilder3.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder3.k(appStartTrace.b().b(appStartTrace.o));
                                        q0Var3.h((t0) q0VarNewBuilder3.a());
                                        appStartTrace.d(q0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.v;
                                    q0 q0VarNewBuilder4 = t0.newBuilder();
                                    q0VarNewBuilder4.l(com.google.firebase.perf.util.b.APP_START_TRACE_NAME.toString());
                                    q0VarNewBuilder4.j(appStartTrace.a().f49592a);
                                    q0VarNewBuilder4.k(appStartTrace.a().b(appStartTrace.k));
                                    ArrayList arrayList = new ArrayList(3);
                                    q0 q0VarNewBuilder5 = t0.newBuilder();
                                    q0VarNewBuilder5.l(com.google.firebase.perf.util.b.ON_CREATE_TRACE_NAME.toString());
                                    q0VarNewBuilder5.j(appStartTrace.a().f49592a);
                                    q0VarNewBuilder5.k(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((t0) q0VarNewBuilder5.a());
                                    if (appStartTrace.f49570j != null) {
                                        q0 q0VarNewBuilder6 = t0.newBuilder();
                                        q0VarNewBuilder6.l(com.google.firebase.perf.util.b.ON_START_TRACE_NAME.toString());
                                        q0VarNewBuilder6.j(appStartTrace.i.f49592a);
                                        q0VarNewBuilder6.k(appStartTrace.i.b(appStartTrace.f49570j));
                                        arrayList.add((t0) q0VarNewBuilder6.a());
                                        q0 q0VarNewBuilder7 = t0.newBuilder();
                                        q0VarNewBuilder7.l(com.google.firebase.perf.util.b.ON_RESUME_TRACE_NAME.toString());
                                        q0VarNewBuilder7.j(appStartTrace.f49570j.f49592a);
                                        q0VarNewBuilder7.k(appStartTrace.f49570j.b(appStartTrace.k));
                                        arrayList.add((t0) q0VarNewBuilder7.a());
                                    }
                                    q0VarNewBuilder4.c();
                                    ((t0) q0VarNewBuilder4.f49761b).addAllSubtraces(arrayList);
                                    m0 m0VarA2 = appStartTrace.f49575q.a();
                                    q0VarNewBuilder4.c();
                                    ((t0) q0VarNewBuilder4.f49761b).addPerfSessions(m0VarA2);
                                    appStartTrace.f49566b.c((t0) q0VarNewBuilder4.a(), n.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                    final int i2 = 1;
                    final int i3 = 2;
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new com.google.firebase.perf.util.g(viewFindViewById, new Runnable(this) { // from class: rf.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f253663b;

                        {
                            this.f253663b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            AppStartTrace appStartTrace = this.f253663b;
                            switch (i22) {
                                case 0:
                                    q0 q0Var = appStartTrace.d;
                                    if (appStartTrace.f49574p == null) {
                                        appStartTrace.f49574p = new Timer();
                                        q0 q0VarNewBuilder = t0.newBuilder();
                                        q0VarNewBuilder.l("_experiment_onDrawFoQ");
                                        q0VarNewBuilder.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder.k(appStartTrace.b().b(appStartTrace.f49574p));
                                        q0Var.h((t0) q0VarNewBuilder.a());
                                        if (appStartTrace.f49568g != null) {
                                            q0 q0VarNewBuilder2 = t0.newBuilder();
                                            q0VarNewBuilder2.l("_experiment_procStart_to_classLoad");
                                            q0VarNewBuilder2.j(appStartTrace.b().f49592a);
                                            q0VarNewBuilder2.k(appStartTrace.b().b(appStartTrace.a()));
                                            q0Var.h((t0) q0VarNewBuilder2.a());
                                        }
                                        String str = appStartTrace.u ? "true" : "false";
                                        q0Var.c();
                                        ((t0) q0Var.f49761b).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                        q0Var.i(appStartTrace.f49577s, "onDrawCount");
                                        m0 m0VarA = appStartTrace.f49575q.a();
                                        q0Var.c();
                                        ((t0) q0Var.f49761b).addPerfSessions(m0VarA);
                                        appStartTrace.d(q0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    q0 q0Var2 = appStartTrace.d;
                                    if (appStartTrace.f49573n == null) {
                                        appStartTrace.f49573n = new Timer();
                                        q0Var2.j(appStartTrace.b().f49592a);
                                        q0Var2.k(appStartTrace.b().b(appStartTrace.f49573n));
                                        appStartTrace.d(q0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    q0 q0Var3 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        q0 q0VarNewBuilder3 = t0.newBuilder();
                                        q0VarNewBuilder3.l("_experiment_preDrawFoQ");
                                        q0VarNewBuilder3.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder3.k(appStartTrace.b().b(appStartTrace.o));
                                        q0Var3.h((t0) q0VarNewBuilder3.a());
                                        appStartTrace.d(q0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.v;
                                    q0 q0VarNewBuilder4 = t0.newBuilder();
                                    q0VarNewBuilder4.l(com.google.firebase.perf.util.b.APP_START_TRACE_NAME.toString());
                                    q0VarNewBuilder4.j(appStartTrace.a().f49592a);
                                    q0VarNewBuilder4.k(appStartTrace.a().b(appStartTrace.k));
                                    ArrayList arrayList = new ArrayList(3);
                                    q0 q0VarNewBuilder5 = t0.newBuilder();
                                    q0VarNewBuilder5.l(com.google.firebase.perf.util.b.ON_CREATE_TRACE_NAME.toString());
                                    q0VarNewBuilder5.j(appStartTrace.a().f49592a);
                                    q0VarNewBuilder5.k(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((t0) q0VarNewBuilder5.a());
                                    if (appStartTrace.f49570j != null) {
                                        q0 q0VarNewBuilder6 = t0.newBuilder();
                                        q0VarNewBuilder6.l(com.google.firebase.perf.util.b.ON_START_TRACE_NAME.toString());
                                        q0VarNewBuilder6.j(appStartTrace.i.f49592a);
                                        q0VarNewBuilder6.k(appStartTrace.i.b(appStartTrace.f49570j));
                                        arrayList.add((t0) q0VarNewBuilder6.a());
                                        q0 q0VarNewBuilder7 = t0.newBuilder();
                                        q0VarNewBuilder7.l(com.google.firebase.perf.util.b.ON_RESUME_TRACE_NAME.toString());
                                        q0VarNewBuilder7.j(appStartTrace.f49570j.f49592a);
                                        q0VarNewBuilder7.k(appStartTrace.f49570j.b(appStartTrace.k));
                                        arrayList.add((t0) q0VarNewBuilder7.a());
                                    }
                                    q0VarNewBuilder4.c();
                                    ((t0) q0VarNewBuilder4.f49761b).addAllSubtraces(arrayList);
                                    m0 m0VarA2 = appStartTrace.f49575q.a();
                                    q0VarNewBuilder4.c();
                                    ((t0) q0VarNewBuilder4.f49761b).addPerfSessions(m0VarA2);
                                    appStartTrace.f49566b.c((t0) q0VarNewBuilder4.a(), n.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: rf.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f253663b;

                        {
                            this.f253663b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i3;
                            AppStartTrace appStartTrace = this.f253663b;
                            switch (i22) {
                                case 0:
                                    q0 q0Var = appStartTrace.d;
                                    if (appStartTrace.f49574p == null) {
                                        appStartTrace.f49574p = new Timer();
                                        q0 q0VarNewBuilder = t0.newBuilder();
                                        q0VarNewBuilder.l("_experiment_onDrawFoQ");
                                        q0VarNewBuilder.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder.k(appStartTrace.b().b(appStartTrace.f49574p));
                                        q0Var.h((t0) q0VarNewBuilder.a());
                                        if (appStartTrace.f49568g != null) {
                                            q0 q0VarNewBuilder2 = t0.newBuilder();
                                            q0VarNewBuilder2.l("_experiment_procStart_to_classLoad");
                                            q0VarNewBuilder2.j(appStartTrace.b().f49592a);
                                            q0VarNewBuilder2.k(appStartTrace.b().b(appStartTrace.a()));
                                            q0Var.h((t0) q0VarNewBuilder2.a());
                                        }
                                        String str = appStartTrace.u ? "true" : "false";
                                        q0Var.c();
                                        ((t0) q0Var.f49761b).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                        q0Var.i(appStartTrace.f49577s, "onDrawCount");
                                        m0 m0VarA = appStartTrace.f49575q.a();
                                        q0Var.c();
                                        ((t0) q0Var.f49761b).addPerfSessions(m0VarA);
                                        appStartTrace.d(q0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    q0 q0Var2 = appStartTrace.d;
                                    if (appStartTrace.f49573n == null) {
                                        appStartTrace.f49573n = new Timer();
                                        q0Var2.j(appStartTrace.b().f49592a);
                                        q0Var2.k(appStartTrace.b().b(appStartTrace.f49573n));
                                        appStartTrace.d(q0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    q0 q0Var3 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        q0 q0VarNewBuilder3 = t0.newBuilder();
                                        q0VarNewBuilder3.l("_experiment_preDrawFoQ");
                                        q0VarNewBuilder3.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder3.k(appStartTrace.b().b(appStartTrace.o));
                                        q0Var3.h((t0) q0VarNewBuilder3.a());
                                        appStartTrace.d(q0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.v;
                                    q0 q0VarNewBuilder4 = t0.newBuilder();
                                    q0VarNewBuilder4.l(com.google.firebase.perf.util.b.APP_START_TRACE_NAME.toString());
                                    q0VarNewBuilder4.j(appStartTrace.a().f49592a);
                                    q0VarNewBuilder4.k(appStartTrace.a().b(appStartTrace.k));
                                    ArrayList arrayList = new ArrayList(3);
                                    q0 q0VarNewBuilder5 = t0.newBuilder();
                                    q0VarNewBuilder5.l(com.google.firebase.perf.util.b.ON_CREATE_TRACE_NAME.toString());
                                    q0VarNewBuilder5.j(appStartTrace.a().f49592a);
                                    q0VarNewBuilder5.k(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((t0) q0VarNewBuilder5.a());
                                    if (appStartTrace.f49570j != null) {
                                        q0 q0VarNewBuilder6 = t0.newBuilder();
                                        q0VarNewBuilder6.l(com.google.firebase.perf.util.b.ON_START_TRACE_NAME.toString());
                                        q0VarNewBuilder6.j(appStartTrace.i.f49592a);
                                        q0VarNewBuilder6.k(appStartTrace.i.b(appStartTrace.f49570j));
                                        arrayList.add((t0) q0VarNewBuilder6.a());
                                        q0 q0VarNewBuilder7 = t0.newBuilder();
                                        q0VarNewBuilder7.l(com.google.firebase.perf.util.b.ON_RESUME_TRACE_NAME.toString());
                                        q0VarNewBuilder7.j(appStartTrace.f49570j.f49592a);
                                        q0VarNewBuilder7.k(appStartTrace.f49570j.b(appStartTrace.k));
                                        arrayList.add((t0) q0VarNewBuilder7.a());
                                    }
                                    q0VarNewBuilder4.c();
                                    ((t0) q0VarNewBuilder4.f49761b).addAllSubtraces(arrayList);
                                    m0 m0VarA2 = appStartTrace.f49575q.a();
                                    q0VarNewBuilder4.c();
                                    ((t0) q0VarNewBuilder4.f49761b).addPerfSessions(m0VarA2);
                                    appStartTrace.f49566b.c((t0) q0VarNewBuilder4.a(), n.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.k != null) {
                    return;
                }
                new WeakReference(activity);
                this.k = new Timer();
                this.f49575q = SessionManager.getInstance().perfSession();
                qf.a.d().a("onResume(): " + activity.getClass().getName() + ": " + a().b(this.k) + " microseconds");
                final int i5 = 3;
                f49564y.execute(new Runnable(this) { // from class: rf.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f253663b;

                    {
                        this.f253663b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i22 = i5;
                        AppStartTrace appStartTrace = this.f253663b;
                        switch (i22) {
                            case 0:
                                q0 q0Var = appStartTrace.d;
                                if (appStartTrace.f49574p == null) {
                                    appStartTrace.f49574p = new Timer();
                                    q0 q0VarNewBuilder = t0.newBuilder();
                                    q0VarNewBuilder.l("_experiment_onDrawFoQ");
                                    q0VarNewBuilder.j(appStartTrace.b().f49592a);
                                    q0VarNewBuilder.k(appStartTrace.b().b(appStartTrace.f49574p));
                                    q0Var.h((t0) q0VarNewBuilder.a());
                                    if (appStartTrace.f49568g != null) {
                                        q0 q0VarNewBuilder2 = t0.newBuilder();
                                        q0VarNewBuilder2.l("_experiment_procStart_to_classLoad");
                                        q0VarNewBuilder2.j(appStartTrace.b().f49592a);
                                        q0VarNewBuilder2.k(appStartTrace.b().b(appStartTrace.a()));
                                        q0Var.h((t0) q0VarNewBuilder2.a());
                                    }
                                    String str = appStartTrace.u ? "true" : "false";
                                    q0Var.c();
                                    ((t0) q0Var.f49761b).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                    q0Var.i(appStartTrace.f49577s, "onDrawCount");
                                    m0 m0VarA = appStartTrace.f49575q.a();
                                    q0Var.c();
                                    ((t0) q0Var.f49761b).addPerfSessions(m0VarA);
                                    appStartTrace.d(q0Var);
                                    break;
                                }
                                break;
                            case 1:
                                q0 q0Var2 = appStartTrace.d;
                                if (appStartTrace.f49573n == null) {
                                    appStartTrace.f49573n = new Timer();
                                    q0Var2.j(appStartTrace.b().f49592a);
                                    q0Var2.k(appStartTrace.b().b(appStartTrace.f49573n));
                                    appStartTrace.d(q0Var2);
                                    break;
                                }
                                break;
                            case 2:
                                q0 q0Var3 = appStartTrace.d;
                                if (appStartTrace.o == null) {
                                    appStartTrace.o = new Timer();
                                    q0 q0VarNewBuilder3 = t0.newBuilder();
                                    q0VarNewBuilder3.l("_experiment_preDrawFoQ");
                                    q0VarNewBuilder3.j(appStartTrace.b().f49592a);
                                    q0VarNewBuilder3.k(appStartTrace.b().b(appStartTrace.o));
                                    q0Var3.h((t0) q0VarNewBuilder3.a());
                                    appStartTrace.d(q0Var3);
                                    break;
                                }
                                break;
                            default:
                                Timer timer = AppStartTrace.v;
                                q0 q0VarNewBuilder4 = t0.newBuilder();
                                q0VarNewBuilder4.l(com.google.firebase.perf.util.b.APP_START_TRACE_NAME.toString());
                                q0VarNewBuilder4.j(appStartTrace.a().f49592a);
                                q0VarNewBuilder4.k(appStartTrace.a().b(appStartTrace.k));
                                ArrayList arrayList = new ArrayList(3);
                                q0 q0VarNewBuilder5 = t0.newBuilder();
                                q0VarNewBuilder5.l(com.google.firebase.perf.util.b.ON_CREATE_TRACE_NAME.toString());
                                q0VarNewBuilder5.j(appStartTrace.a().f49592a);
                                q0VarNewBuilder5.k(appStartTrace.a().b(appStartTrace.i));
                                arrayList.add((t0) q0VarNewBuilder5.a());
                                if (appStartTrace.f49570j != null) {
                                    q0 q0VarNewBuilder6 = t0.newBuilder();
                                    q0VarNewBuilder6.l(com.google.firebase.perf.util.b.ON_START_TRACE_NAME.toString());
                                    q0VarNewBuilder6.j(appStartTrace.i.f49592a);
                                    q0VarNewBuilder6.k(appStartTrace.i.b(appStartTrace.f49570j));
                                    arrayList.add((t0) q0VarNewBuilder6.a());
                                    q0 q0VarNewBuilder7 = t0.newBuilder();
                                    q0VarNewBuilder7.l(com.google.firebase.perf.util.b.ON_RESUME_TRACE_NAME.toString());
                                    q0VarNewBuilder7.j(appStartTrace.f49570j.f49592a);
                                    q0VarNewBuilder7.k(appStartTrace.f49570j.b(appStartTrace.k));
                                    arrayList.add((t0) q0VarNewBuilder7.a());
                                }
                                q0VarNewBuilder4.c();
                                ((t0) q0VarNewBuilder4.f49761b).addAllSubtraces(arrayList);
                                m0 m0VarA2 = appStartTrace.f49575q.a();
                                q0VarNewBuilder4.c();
                                ((t0) q0VarNewBuilder4.f49761b).addPerfSessions(m0VarA2);
                                appStartTrace.f49566b.c((t0) q0VarNewBuilder4.a(), n.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zF) {
                    e();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f49576r && this.f49570j == null && !this.f) {
            this.f49570j = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f49576r || this.f || this.f49572m != null) {
            return;
        }
        this.f49572m = new Timer();
        q0 q0VarNewBuilder = t0.newBuilder();
        q0VarNewBuilder.l("_experiment_firstBackgrounding");
        q0VarNewBuilder.j(b().f49592a);
        q0VarNewBuilder.k(b().b(this.f49572m));
        this.d.h((t0) q0VarNewBuilder.a());
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.f49576r || this.f || this.f49571l != null) {
            return;
        }
        this.f49571l = new Timer();
        q0 q0VarNewBuilder = t0.newBuilder();
        q0VarNewBuilder.l("_experiment_firstForegrounding");
        q0VarNewBuilder.j(b().f49592a);
        q0VarNewBuilder.k(b().b(this.f49571l));
        this.d.h((t0) q0VarNewBuilder.a());
    }
}
