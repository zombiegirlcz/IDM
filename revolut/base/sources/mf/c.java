package mf;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xf.m0;
import xf.n;
import xf.q0;
import xf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final qf.a f204801r = qf.a.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile c f204802s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f204803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f204804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f204805c;
    public final WeakHashMap d;
    public final HashMap e;
    public final HashSet f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f204806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f204807h;
    public final wf.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nf.a f204808j;
    public final ah.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f204809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Timer f204810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Timer f204811n;
    public n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f204812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f204813q;

    public c(wf.e eVar, ah.a aVar) {
        nf.a aVarE = nf.a.e();
        qf.a aVar2 = f.e;
        this.f204803a = new WeakHashMap();
        this.f204804b = new WeakHashMap();
        this.f204805c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.f204806g = new HashSet();
        this.f204807h = new AtomicInteger(0);
        this.o = n.BACKGROUND;
        this.f204812p = false;
        this.f204813q = true;
        this.i = eVar;
        this.k = aVar;
        this.f204808j = aVarE;
        this.f204809l = true;
    }

    public static c a() {
        if (f204802s == null) {
            synchronized (c.class) {
                try {
                    if (f204802s == null) {
                        f204802s = new c(wf.e.f296850s, new ah.a(3));
                    }
                } finally {
                }
            }
        }
        return f204802s;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l2 = (Long) this.e.get(str);
                if (l2 == null) {
                    this.e.put(str, 1L);
                } else {
                    this.e.put(str, Long.valueOf(l2.longValue() + 1));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void c() {
        synchronized (this.f204806g) {
            try {
                Iterator it8 = this.f204806g.iterator();
                while (it8.hasNext()) {
                    if (((a) it8.next()) != null) {
                        try {
                            qf.a aVar = lf.b.f194619b;
                        } catch (IllegalStateException e) {
                            lf.c.f194621a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void d(Activity activity) {
        com.google.firebase.perf.util.f fVar;
        WeakHashMap weakHashMap = this.d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        f fVar2 = (f) this.f204804b.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = fVar2.f204818b;
        HashMap map = fVar2.f204819c;
        qf.a aVar = f.e;
        if (fVar2.d) {
            if (!map.isEmpty()) {
                aVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            com.google.firebase.perf.util.f fVarA = fVar2.a();
            try {
                frameMetricsAggregator.remove(fVar2.f204817a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                aVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                fVarA = new com.google.firebase.perf.util.f();
            }
            frameMetricsAggregator.reset();
            fVar2.d = false;
            fVar = fVarA;
        } else {
            aVar.a("Cannot stop because no recording was started");
            fVar = new com.google.firebase.perf.util.f();
        }
        if (fVar.b()) {
            j.a(trace, (rf.c) fVar.a());
            trace.stop();
        } else {
            f204801r.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void e(String str, Timer timer, Timer timer2) {
        if (this.f204808j.o()) {
            q0 q0VarNewBuilder = t0.newBuilder();
            q0VarNewBuilder.l(str);
            q0VarNewBuilder.j(timer.f49592a);
            q0VarNewBuilder.k(timer.b(timer2));
            m0 m0VarA = SessionManager.getInstance().perfSession().a();
            q0VarNewBuilder.c();
            ((t0) q0VarNewBuilder.f49761b).addPerfSessions(m0VarA);
            int andSet = this.f204807h.getAndSet(0);
            synchronized (this.e) {
                try {
                    HashMap map = this.e;
                    q0VarNewBuilder.c();
                    ((t0) q0VarNewBuilder.f49761b).getMutableCountersMap().putAll(map);
                    if (andSet != 0) {
                        q0VarNewBuilder.i(andSet, com.google.firebase.perf.util.a.TRACE_STARTED_NOT_STOPPED.toString());
                    }
                    this.e.clear();
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            this.i.c((t0) q0VarNewBuilder.a(), n.FOREGROUND_BACKGROUND);
        }
    }

    public final void f(Activity activity) {
        if (this.f204809l && this.f204808j.o()) {
            f fVar = new f(activity);
            this.f204804b.put(activity, fVar);
            if (activity instanceof FragmentActivity) {
                e eVar = new e(this.k, this.i, this, fVar);
                this.f204805c.put(activity, eVar);
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(eVar, true);
            }
        }
    }

    public final void g(n nVar) {
        this.o = nVar;
        synchronized (this.f) {
            try {
                Iterator it8 = this.f.iterator();
                while (it8.hasNext()) {
                    b bVar = (b) ((WeakReference) it8.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.o);
                    } else {
                        it8.remove();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f204804b.remove(activity);
        WeakHashMap weakHashMap = this.f204805c;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks((FragmentManager.FragmentLifecycleCallbacks) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f204803a.isEmpty()) {
                this.k.getClass();
                this.f204810m = new Timer();
                this.f204803a.put(activity, Boolean.TRUE);
                if (this.f204813q) {
                    g(n.FOREGROUND);
                    c();
                    this.f204813q = false;
                } else {
                    e(com.google.firebase.perf.util.b.BACKGROUND_TRACE_NAME.toString(), this.f204811n, this.f204810m);
                    g(n.FOREGROUND);
                }
            } else {
                this.f204803a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f204809l && this.f204808j.o()) {
                if (!this.f204804b.containsKey(activity)) {
                    f(activity);
                }
                f fVar = (f) this.f204804b.get(activity);
                Activity activity2 = fVar.f204817a;
                if (fVar.d) {
                    f.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    fVar.f204818b.add(activity2);
                    fVar.d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.i, this.k, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f204809l) {
                d(activity);
            }
            if (this.f204803a.containsKey(activity)) {
                this.f204803a.remove(activity);
                if (this.f204803a.isEmpty()) {
                    this.k.getClass();
                    this.f204811n = new Timer();
                    e(com.google.firebase.perf.util.b.FOREGROUND_TRACE_NAME.toString(), this.f204810m, this.f204811n);
                    g(n.BACKGROUND);
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
