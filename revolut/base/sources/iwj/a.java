package iwj;

import akl.v;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import ang.f;
import cn0.g;
import com.revolut.retail.feature.api.userauth.location_enforce.LocationEnforceDestination;
import com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.LocationEnforceFlow;
import e0m.d;
import iv0.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import mm0.n;
import nhi.k;
import od0.e;
import skm.c2;
import skm.e0;
import skm.g1;
import skm.p0;
import sri.m;
import vkm.q;
import vkm.q0;
import w39.b;
import zh9.u0;
import zhm.h0;
import zm0.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends nri.a implements Application.ActivityLifecycleCallbacks, xji.a, d, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f169171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f169172c;
    public final c d;
    public final f e;
    public final Application f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zkm.d f169173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f169174h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f169175j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile String f169176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0m.b f169177m;

    public a(Context context, CoroutineScope appCoroutineScope, b locationInteractor, m navigator, c sessionProvider, f userInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f169171b = locationInteractor;
        this.f169172c = navigator;
        this.d = sessionProvider;
        this.e = userInteractor;
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext instanceof Application ? (Application) applicationContext : null;
        p0 p0Var = p0.f264001a;
        this.f169173g = e0.D(e0.D(appCoroutineScope, new c2((Job) appCoroutineScope.getF100596a().get(g1.f263979a))), elm.f.f127540b);
        this.f169177m = new e0m.b(new p(this, 2));
    }

    @Override // od0.e
    public final void clear() {
        Application application = this.f;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        k.b(this);
        e0.n(this.f169173g.f323100a);
    }

    @Override // nri.a
    public final void i3() {
        Continuation continuation = null;
        q.G(new q0(rd0.e.e(rd0.e.b(rd0.e.p(this.e.d.e(), 250L, 30000L, 25)), h0.f322473a, new v(3, continuation)), new ald.p(this, continuation, 5), 1), this.f169173g);
    }

    public final void j3() {
        if (this.f169174h && (((g) this.d).d() instanceof n)) {
            boolean z = this.i && this.f169175j;
            if (!z && !this.k) {
                this.k = true;
                this.f169172c.c(u0.f(LocationEnforceDestination.f99272a));
            } else if (z) {
                this.f169177m.init();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j3();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // xji.a
    public final void w1(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (controller instanceof LocationEnforceFlow) {
            this.k = false;
        }
    }

    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        j3();
    }
}
