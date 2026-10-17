package csi;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import voi.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f108472a;

    public c(i applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f108472a = applicationContext;
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
        a aVar = a.ON_START;
        Intent intent = new Intent("subprocess_screen_interaction_action");
        i iVar = this.f108472a;
        intent.setPackage(iVar.getPackageName());
        iVar.sendBroadcast(intent.putExtra("subprocess_screen_interaction_activity_event_key", aVar.name()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a aVar = a.ON_STOP;
        Intent intent = new Intent("subprocess_screen_interaction_action");
        i iVar = this.f108472a;
        intent.setPackage(iVar.getPackageName());
        iVar.sendBroadcast(intent.putExtra("subprocess_screen_interaction_activity_event_key", aVar.name()));
    }
}
