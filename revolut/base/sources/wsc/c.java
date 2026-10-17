package wsc;

import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import wr1.s;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends h80.a implements Activity$ScreenCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f299697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f299698b;

    public c(d dVar) {
        this.f299698b = dVar;
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            activity.registerScreenCaptureCallback(this.f299698b.f299699a.getMainExecutor(), this);
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, null, "Screen capture callback has been registered for activity " + activity, null, null, 16);
        } catch (IllegalStateException e) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.VERBOSE, null, "Screen capture callback has been already registered for activity " + activity, e, null, 16);
        }
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            activity.unregisterScreenCaptureCallback(this);
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, null, "Screen capture callback has been unregistered from activity " + activity, null, null, 16);
        } catch (IllegalStateException e) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.VERBOSE, null, "Screen capture callback has been already unregistered from activity " + activity, e, null, 16);
        }
    }

    public final void onScreenCaptured() {
        if (this.f299697a) {
            d dVar = this.f299698b;
            CoroutineScope coroutineScope = dVar.f299700b;
            p0 p0Var = p0.f264001a;
            e0.C(coroutineScope, elm.f.f127540b, null, new s(dVar, null, 2), 2);
        }
    }
}
