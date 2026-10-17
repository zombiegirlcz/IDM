package mn;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import az0.r1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.l;
import grl.ta;
import ho.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import no.j2;
import no.r0;
import no.s0;
import no.t0;
import no.t2;
import no.u0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver, e0m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru0.d f207317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ru0.d f207318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru0.d f207319c;
    public final voi.a d;
    public boolean e;
    public boolean f;

    public a(ru0.d analyticsSender, ru0.d diagnosticEventsTracker, ru0.d settingsEventsTracker, voi.a onCreate) {
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        Intrinsics.checkNotNullParameter(onCreate, "onCreate");
        this.f207317a = analyticsSender;
        this.f207318b = diagnosticEventsTracker;
        this.f207319c = settingsEventsTracker;
        this.d = onCreate;
    }

    public final void a() {
        l lVar = (l) ((j2) this.f207319c.invoke());
        gpk.c cVar = lVar.f50342h;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "SettingsTracker", "startTrackingChanges ", null, null, 16);
        lVar.i3();
        Job jobC = lVar.f50347p;
        int i = 0;
        Continuation continuation = null;
        if (jobC == null) {
            CoroutineScope coroutineScopeC = cVar.c();
            p0 p0Var = p0.f264001a;
            jobC = e0.C(coroutineScopeC, elm.f.f127540b, null, new t2(lVar, continuation, i), 2);
        }
        lVar.f50347p = jobC;
        CoroutineScope coroutineScopeC2 = cVar.c();
        p0 p0Var2 = p0.f264001a;
        elm.f fVar = elm.f.f127540b;
        int i2 = 1;
        e0.C(coroutineScopeC2, fVar, null, new t2(lVar, continuation, i2), 2);
        com.revolut.analytics.tracking.v3.f fVar2 = (com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) this.f207318b.invoke());
        gpk.c cVar2 = fVar2.f50314a;
        e0.C(cVar2.c(), fVar, null, new r0(fVar2, continuation, i), 2);
        e0.C(cVar2.c(), fVar, null, new r0(fVar2, continuation, i2), 2);
        ((z) this.f207317a.invoke()).resume();
    }

    @Override // e0m.d
    public final void init() {
        if (this.f) {
            a();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        int i = 1;
        this.f = true;
        j2 j2Var = (j2) this.f207319c.invoke();
        ta event = ta.opened;
        l lVar = (l) j2Var;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.m3(AnalyticsProduct.Shared.Environment.f, true, new ite.d(event, 15));
        ru0.d dVar = this.f207318b;
        com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) dVar.invoke());
        CoroutineScope coroutineScopeC = fVar.f50314a.c();
        p0 p0Var = p0.f264001a;
        elm.f fVar2 = elm.f.f127540b;
        Continuation continuation = null;
        com.revolut.analytics.tracking.v3.e eVar = new com.revolut.analytics.tracking.v3.e(fVar, null);
        int i2 = 2;
        e0.C(coroutineScopeC, fVar2, null, eVar, 2);
        if (!this.e) {
            this.e = true;
            com.revolut.analytics.tracking.v3.f fVar3 = (com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) dVar.invoke());
            gpk.c cVar = fVar3.f50314a;
            e0.C(cVar.c(), fVar2, null, new u0(fVar3, null), 2);
            e0.C(cVar.c(), null, null, new r1(fVar3, continuation, 10), 3);
            e0.C(cVar.c(), fVar2, null, new t0(fVar3, continuation, i), 2);
            e0.C(cVar.c(), fVar2, null, new s0(fVar3, continuation, i2), 2);
            e0.C(cVar.c(), fVar2, null, new s0(fVar3, continuation, 3), 2);
            e0.C(cVar.c(), fVar2, null, new s0(fVar3, continuation, 4), 2);
            this.d.invoke();
        }
        a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this.f = false;
        l lVar = (l) ((j2) this.f207319c.invoke());
        Job job2 = lVar.f50347p;
        if (job2 != null) {
            job2.f(null);
        }
        lVar.f50347p = null;
        ta event = ta.closed;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.m3(AnalyticsProduct.Shared.Environment.f, true, new ite.d(event, 15));
        ((z) this.f207317a.invoke()).pause();
    }
}
