package voi;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.common.ui.api.Toggles;
import com.revolut.utils.tracking.ab_testing.experiments.DefaultFirebaseFlagExperiment;
import java.time.Clock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import no.x2;
import org.jetbrains.annotations.NotNull;
import te0.w;
import up5.s;
import xv.o;
import yhm.m;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i extends Application implements hf0.c, wy0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final DefaultFirebaseFlagExperiment f290975w = new DefaultFirebaseFlagExperiment("EID_NATIVE_LIBRARY_PATH_REPAIR", "Enables native library path repair after dynamic feature installation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f290976a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f290978c;
    public final mn.a e;
    public final wsc.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ef0.a f290979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pjl.g f290980h;
    public final tta.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z39.f f290981j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0m.b f290982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f290983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f290984n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f290985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f290986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f290987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f290988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f290989t;
    public final Lazy u;
    public final Lazy v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f290977b = yhm.j.b(new ru0.d(this, 8));
    public final fp.d d = new fp.d(0);

    public static final class a {
        private a() {
        }
    }

    public i() {
        int i = 7;
        this.f290976a = w.y0(new ru0.d(this, i));
        int i2 = 11;
        this.f290978c = w.y0(new voi.a(this, i2));
        int i3 = 0;
        int i5 = 12;
        mn.a aVar = new mn.a(new ru0.d(this, 9), new ru0.d(this, 10), new ru0.d(this, i2), new voi.a(this, i5));
        this.e = aVar;
        wsc.f fVar = new wsc.f(new ru0.d(this, i5));
        this.f = fVar;
        ef0.a aVar2 = new ef0.a(this, new ru0.d(this, 13), new ru0.d(this, 14));
        this.f290979g = aVar2;
        int i6 = 3;
        int i21 = 4;
        int i22 = 6;
        int i32 = 1;
        this.f290980h = new pjl.g(new lm.e(this, i6), new lm.e(this, 5), new lm.e(this, i22), new f(this, i3), new lm.e(this, i21), new f(this, i32));
        this.i = new tta.b(new ru0.d(this, 16), new ru0.d(this, 17));
        this.f290981j = new z39.f(new ru0.d(this, 18));
        this.k = v.k(aVar, fVar, aVar2);
        this.f290982l = new e0m.b(new voi.a(this, i3));
        this.f290983m = yhm.j.b(new voi.a(this, i32));
        this.f290984n = yhm.j.b(new voi.a(this, 2));
        this.o = yhm.j.b(new voi.a(this, i6));
        this.f290985p = yhm.j.b(new voi.a(this, i21));
        this.f290986q = yhm.j.b(new voi.a(this, 5));
        this.f290987r = yhm.j.b(new voi.a(this, i22));
        this.f290988s = yhm.j.b(new voi.a(this, i));
        this.f290989t = yhm.j.b(new voi.a(this, 8));
        this.u = yhm.j.b(new voi.a(this, 9));
        this.v = yhm.j.b(new voi.a(this, 10));
        b().getClass();
        b().getClass();
        od0.b environment = od0.b.PRODUCTION;
        od0.a aVar3 = od0.a.f224253a;
        Intrinsics.checkNotNullParameter(environment, "environment");
        AtomicReference atomicReference = od0.a.f224254b;
        if (!m72.b.C(atomicReference, od0.b.UNDEFINED, environment)) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "AppEnvironment", "Unable to update app environment to " + environment + " as it had been already initialised as " + atomicReference, null, null, 16);
        }
        b().getClass();
        g21.c cVar = g21.c.f139760a;
        if (od0.a.e()) {
            od0.a.i();
        }
        Clock clock = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(clock, "systemUTC(...)");
        Intrinsics.checkNotNullParameter(clock, "clock");
        synchronized (cVar) {
            try {
                if (g21.c.f139761b == null) {
                    Intrinsics.checkNotNullParameter(clock, "clock");
                    g21.c.f139761b = new g21.b();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static CoroutineScope c() {
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, rg0.e.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((rg0.e) aVar2.b()).a();
        }
        throw new IllegalStateException(a0.d.q("Api ", rg0.e.class, " is not found"));
    }

    public static poi.b e() {
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, poi.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (poi.b) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", poi.b.class, " is not found"));
    }

    public static an0.c f() {
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, an0.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (an0.c) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", an0.c.class, " is not found"));
    }

    public static ofm.h m() {
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, yn0.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", yn0.a.class, " is not found"));
        }
        pfm.a aVar3 = new pfm.a(((zn0.d) ((yn0.a) aVar2.b()).a()).c(), new a31.a(new s(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new bo.e(12, m.f290994a), l.f290993a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        return hVarW;
    }

    @Override // wy0.a
    public final yy0.f Q() {
        return (yy0.f) this.f290984n.getValue();
    }

    @Override // wy0.a
    public final mz0.a V() {
        return (mz0.a) this.f290985p.getValue();
    }

    @Override // wy0.a
    public final py0.e X() {
        return (py0.e) this.v.getValue();
    }

    @Override // wy0.a
    public final xy0.a Y() {
        return (xy0.a) this.f290989t.getValue();
    }

    @Override // wy0.a
    public final h01.g Z() {
        return (h01.g) this.f290983m.getValue();
    }

    public abstract boolean a();

    @Override // wy0.a
    public final jz0.d a0() {
        return (jz0.d) this.u.getValue();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.d.f137015a.getClass();
        super.attachBaseContext(gpi.a.a(baseContext));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h b() {
        return (h) this.f290978c.getValue();
    }

    @Override // wy0.a
    public final ty0.c b0() {
        return (ty0.c) this.f290986q.getValue();
    }

    @Override // wy0.a
    public final lz0.g c0() {
        return (lz0.g) this.f290988s.getValue();
    }

    public final ite.a d() {
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, ite.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (ite.a) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
    }

    @Override // wy0.a
    public final i01.b d0() {
        return (i01.b) this.f290987r.getValue();
    }

    @Override // wy0.a
    public final /* bridge */ d01.g e0() {
        return null;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return ((jte.d) d().b()).c(Toggles.ProgressiveBlurNavigation.f98583c);
    }

    public void i() {
    }

    public abstract ip.a j();

    public abstract h k();

    /* JADX WARN: Finally extract failed */
    public void l() {
        fp.d dVar = this.d;
        hf0.b bVar = hf0.b.d;
        phm.a aVar = (phm.a) j6.a.j(bVar, jm0.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", jm0.a.class, " is not found"));
        }
        dm0.d deviceIdProvider = ((jm0.a) aVar2.b()).d();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        dVar.f137015a.getClass();
        Handler handler = a3l.e.f1177a;
        b displayDelegates = new b();
        bk0.e headerProvider = ((nj0.d) ((ip.a) bVar.g()).b().F5()).h();
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(displayDelegates, "displayDelegates");
        ReentrantReadWriteLock reentrantReadWriteLock = a3l.e.f1178b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
            Intrinsics.checkNotNullParameter(displayDelegates, "displayDelegates");
            gpk.c cVar = new gpk.c();
            cVar.f145463a = this;
            cVar.f145464b = headerProvider;
            cVar.f145465c = displayDelegates;
            a3l.e.d = cVar;
            Unit unit = Unit.f186387a;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.lock();
            }
            writeLock.unlock();
            o.a(new ook.g());
            int i5 = 1;
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
            m();
            t70.g gVarO = ((ip.a) hf0.b.d.g()).b().D5().o();
            Intrinsics.checkNotNullParameter(gVarO, "<set-?>");
            z2l.a.f319098b = gVarO;
            registerReceiver(new j(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
            try {
                m.Companion companion = yhm.m.INSTANCE;
                Class.forName("android.sec.clipboard.ClipboardUIManager").getDeclaredMethod("getInstance", Context.class).invoke(null, this);
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                yhm.o.a(th10);
            }
            hf0.b bVar2 = hf0.b.d;
            registerActivityLifecycleCallbacks(new bri.b(((r1b.a) ((ip.a) bVar2.g()).b().k.f197487a.t2.get()).a()));
            f5l.e eVar = f5l.e.f132364a;
            registerActivityLifecycleCallbacks(eVar);
            nhi.k.a(eVar);
            nhi.k.a(new mn.h(new g(this, i)));
            nhi.k.a(new mn.e(new jo0.f(this)));
            registerActivityLifecycleCallbacks(new x2(new g(this, i5), new g(this, 2)));
            Lifecycle lifecycle = ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
            lifecycle.addObserver(this.e);
            lifecycle.addObserver(this.f);
            lifecycle.addObserver(this.f290979g);
            lifecycle.addObserver(this.f290980h);
            lifecycle.addObserver(this.f290981j);
            lifecycle.addObserver(this.i);
            emi.a aVar3 = (emi.a) ue0.e.i(bVar2.g(), emi.a.class);
            if (aVar3 != null) {
                lifecycle.addObserver(aVar3.b());
            }
            h80.b bVar3 = h80.c.f149931a;
            Intrinsics.checkNotNullParameter(this, "application");
            h80.b bVar4 = h80.c.f149931a;
            bVar4.getClass();
            Intrinsics.checkNotNullParameter(this, "application");
            if (bVar4.d == null) {
                synchronized (bVar4) {
                    if (bVar4.d == null) {
                        bVar4.d = this;
                        registerActivityLifecycleCallbacks(bVar4);
                        Unit unit2 = Unit.f186387a;
                    }
                }
            }
            Object systemService = getSystemService((Class<Object>) ActivityManager.class);
            Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
            h80.c.e = (ActivityManager) systemService;
        } catch (Throwable th11) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th11;
        }
    }

    @Override // wy0.a
    public final py0.f n0() {
        return (py0.f) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Application
    public void onCreate() {
        th0.l.Companion.e(new voi.a(this, 15));
        a2g.a aVar = aoi.g.f7996a;
        Intrinsics.checkNotNullParameter(this, "context");
        od0.a aVar2 = od0.a.f224253a;
        od0.b bVarB = od0.a.b();
        a2g.a factory = (bVarB == od0.b.BETA || bVarB == od0.b.PRODUCTION) ? new a2g.a(this, 24) : null;
        if (factory != null) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            aoi.g.f7996a = factory;
        }
        aoi.c interactor = aoi.g.a();
        if (interactor.enabled()) {
            eoi.c cVar = eoi.c.f127919a;
            LifecycleOwner appLifecycleOwner = ProcessLifecycleOwner.INSTANCE.get();
            Intrinsics.checkNotNullParameter(interactor, "interactor");
            Intrinsics.checkNotNullParameter(appLifecycleOwner, "appLifecycleOwner");
            eoi.c.f127920b = interactor;
            appLifecycleOwner.getLifecycle().addObserver(cVar);
        }
        i();
        hf0.b bVar = hf0.b.d;
        bVar.d(new voi.a(this, 13));
        phm.a aVar3 = (phm.a) bVar.g().a().get(w0j.a.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", w0j.a.class, " is not found"));
        }
        ((w0j.a) aVar4.b()).a().k();
        super.onCreate();
        zi2.c cVar2 = (zi2.c) this.f290977b.getValue();
        zi2.a aVar5 = zi2.a.f322495a;
        if (Intrinsics.f(cVar2, aVar5)) {
            this.f290982l.init();
        }
        synchronized (this) {
            try {
                phm.a aVar6 = (phm.a) bVar.g().a().get(w0j.a.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 == null) {
                    throw new IllegalStateException("Api " + w0j.a.class + " is not found");
                }
                ((w0j.a) aVar7.b()).a().l();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (Intrinsics.f((zi2.c) this.f290977b.getValue(), aVar5)) {
            ContextCompat.registerReceiver(this, (csi.f) this.f290976a.getValue(), new IntentFilter("subprocess_screen_interaction_action"), 4);
        }
        if (a()) {
            registerActivityLifecycleCallbacks(new csi.c(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        if (Intrinsics.f((zi2.c) this.f290977b.getValue(), zi2.a.f322495a)) {
            unregisterReceiver((csi.f) this.f290976a.getValue());
        }
    }
}
