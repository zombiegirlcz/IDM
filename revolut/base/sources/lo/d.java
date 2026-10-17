package lo;

import androidx.lifecycle.Lifecycle;
import com.revolut.analytics.tracking.memory.HighMemoryConsumptionException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import uo.q0;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends nri.a implements e0m.d, od0.e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.analytics.tracking.impl.a f197312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f197313c;
    public final j d;
    public final sh0.a e;
    public final uo.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f197314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lifecycle f197315h;
    public final gpk.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2 f197316j;
    public b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f197317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f197318m;

    public d(com.revolut.retail.analytics.tracking.impl.a appAnalyticsToggles, i snapshotProvider, j statusFormatter, sh0.a crashlytics, uo.b activeScreenHolder, q0 screenNameFinder, Lifecycle appLifecycle, gpk.c coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(appAnalyticsToggles, "appAnalyticsToggles");
        Intrinsics.checkNotNullParameter(snapshotProvider, "snapshotProvider");
        Intrinsics.checkNotNullParameter(statusFormatter, "statusFormatter");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(appLifecycle, "appLifecycle");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f197312b = appAnalyticsToggles;
        this.f197313c = snapshotProvider;
        this.d = statusFormatter;
        this.e = crashlytics;
        this.f = activeScreenHolder;
        this.f197314g = screenNameFinder;
        this.f197315h = appLifecycle;
        this.i = coroutineScopeProvider;
        this.f197317l = new AtomicInteger(0);
        this.f197318m = new AtomicBoolean(false);
    }

    @Override // od0.e
    public final void clear() {
        a2 a2Var = this.f197316j;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f197316j = null;
        b bVar = this.k;
        if (bVar != null) {
            this.f197315h.removeObserver(bVar);
        }
        this.k = null;
    }

    @Override // nri.a
    public final void i3() {
        this.f197312b.getClass();
        b bVar = new b(this);
        this.k = bVar;
        this.f197315h.addObserver(bVar);
    }

    public final void j3(g gVar, String str) {
        Object objA;
        int i = gVar.f197323h;
        AtomicBoolean atomicBoolean = this.f197318m;
        if (i < 80) {
            atomicBoolean.set(false);
            return;
        }
        try {
            m.Companion companion = m.INSTANCE;
            Object objC = this.f.c();
            objA = objC != null ? this.f197314g.e(objC).f281496a : null;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        String str2 = (String) objA;
        if (str2 != null) {
            str = com.google.android.gms.internal.mlkit_vision_face.a.o(str, ", screen: ", str2);
        }
        String status = str;
        if (!atomicBoolean.compareAndSet(false, true)) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "MemoryConsumptionTracker", status, null, null, 16);
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        HighMemoryConsumptionException highMemoryConsumptionException = new HighMemoryConsumptionException(j6.a.q("High memory consumption detected. ", status));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "MemoryConsumptionTracker", null, highMemoryConsumptionException, h0Var);
    }
}
