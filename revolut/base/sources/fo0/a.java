package fo0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import cn0.g;
import e0m.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mm0.n;
import nhi.k;
import skm.e0;
import zm0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, xji.a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f136733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f136734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f136735c;
    public final b d;
    public final e0m.b e;

    public a(Context context, CoroutineScope coroutineScope, d4m.a tasks, b sessionController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        this.f136733a = context;
        this.f136734b = coroutineScope;
        this.f136735c = tasks;
        this.d = sessionController;
        this.e = new e0m.b(new androidx.lifecycle.b(this, 17));
    }

    public final void a() {
        if (((g) this.d).d() instanceof n) {
            Context context = this.f136733a;
            Continuation continuation = null;
            Application application = context instanceof Application ? (Application) context : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
            k.b(this);
            Object obj2 = this.f136735c.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            for (eo0.b bVar : (Iterable) obj2) {
                if (Intrinsics.f(bVar.c(), eo0.a.f127858a)) {
                    e0.C(this.f136734b, null, null, new ewa.d(bVar, continuation, 29), 3);
                }
            }
        }
    }

    @Override // e0m.d
    public final void init() {
        this.e.init();
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
        a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        a();
    }
}
