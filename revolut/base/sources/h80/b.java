package h80;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import voi.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f149928a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f149929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f149930c;
    public i d;

    public final Set a() {
        Set _activities = this.f149928a;
        Intrinsics.checkNotNullExpressionValue(_activities, "_activities");
        return _activities;
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f149928a.add(activity);
        this.f149929b = true;
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f149928a.remove(activity);
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        b bVar = c.f149931a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = c.d;
        if (activity == (weakReference != null ? (Activity) weakReference.get() : null)) {
            c.d = null;
        }
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f149930c = new WeakReference(activity);
        b bVar = c.f149931a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        c.d = new WeakReference(activity);
        LinkedHashSet linkedHashSet = c.f;
        ActivityManager activityManager = c.e;
        if (activityManager == null) {
            Intrinsics.r("activityManager");
            throw null;
        }
        linkedHashSet.addAll(c.d(activityManager));
        ArrayList arrayList = c.f149933c;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            ((Function1) it8.next()).invoke(activity);
        }
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f149930c = new WeakReference(activity);
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f149930c;
        if (activity == (weakReference != null ? (Activity) weakReference.get() : null)) {
            this.f149930c = null;
        }
    }
}
