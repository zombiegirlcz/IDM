package io;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import com.revolut.RevolutApplication;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.q0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h80.a implements c {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f162983g = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.analytics.tracking.impl.a f162984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f162985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gpk.c f162986c;
    public volatile boolean d;
    public volatile RevolutApplication e;
    public final ConcurrentHashMap f;

    public f(com.revolut.retail.analytics.tracking.impl.a appAnalyticsToggles, phm.a diagnosticEventsTrackerProvider, gpk.c coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(appAnalyticsToggles, "appAnalyticsToggles");
        Intrinsics.checkNotNullParameter(diagnosticEventsTrackerProvider, "diagnosticEventsTrackerProvider");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f162984a = appAnalyticsToggles;
        this.f162985b = diagnosticEventsTrackerProvider;
        this.f162986c = coroutineScopeProvider;
        this.f = new ConcurrentHashMap();
    }

    public static void c(Activity activity, String str) {
        String simpleName = activity.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        if (simpleName.length() > 0) {
            StringBuilder sb6 = new StringBuilder();
            String strValueOf = String.valueOf(simpleName.charAt(0));
            Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            sb6.append((Object) lowerCase);
            String strSubstring = simpleName.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb6.append(strSubstring);
            simpleName = sb6.toString();
        }
        String strR = a0.d.r(simpleName, str);
        c.Companion.getClass();
        a.a(strR);
    }

    public final void a(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f.putIfAbsent(key, value);
    }

    public final void b(b scenario) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        RevolutApplication revolutApplication = this.e;
        if (revolutApplication != null) {
            revolutApplication.unregisterActivityLifecycleCallbacks(this);
        }
        c.Companion.getClass();
        if (a.f162980b.compareAndSet(true, false)) {
            long startUptimeMillis = Process.getStartUptimeMillis();
            long jUptimeMillis = SystemClock.uptimeMillis() - startUptimeMillis;
            if (jUptimeMillis > f162983g) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "AppStartupTracker", p.a.n(jUptimeMillis, "app start complete, duration ", " above limit, skipping"), null, null, 16);
                return;
            }
            int i2 = e.f162982a[scenario.ordinal()];
            if (i2 == 1) {
                str = "onboarding";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.d) {
                    str = "login_restored";
                } else {
                    ConcurrentHashMap concurrentHashMap = a.f162981c;
                    if (concurrentHashMap.containsKey("externalDeeplinkRoutingActivityCreateStarted")) {
                        str = "deeplink";
                    } else {
                        Set setKeySet = concurrentHashMap.keySet();
                        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it8 = setKeySet.iterator();
                            i = 0;
                            while (it8.hasNext()) {
                                if (a0.y((String) it8.next(), "ActivityCreateStarted", false) && (i = i + 1) < 0) {
                                    v.r();
                                    throw null;
                                }
                            }
                        }
                        str = i > 1 ? "other" : "login";
                    }
                }
            }
            Pair pair = new Pair("scenario", str);
            qp.a.Companion.getClass();
            LinkedHashMap linkedHashMapP = r0.p(r0.k(pair, new Pair("experiment", Boolean.valueOf(qp.a.f248226a != null))), this.f);
            c.Companion.getClass();
            ConcurrentHashMap concurrentHashMap2 = a.f162981c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(concurrentHashMap2.size()));
            for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                linkedHashMap.put(entry.getKey(), Long.valueOf(((Number) entry.getValue()).longValue() - startUptimeMillis));
            }
            LinkedHashMap linkedHashMapP2 = r0.p(linkedHashMapP, linkedHashMap);
            Object obj2 = this.f162985b.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            ((com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) obj2)).j("app_startup", jUptimeMillis, linkedHashMapP2, AnalyticsProduct.Shared.MobilePlatform.f);
        }
    }

    public final void d() {
        CoroutineScope coroutineScopeC = this.f162986c.c();
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScopeC, elm.f.f127540b, null, new iaf.d(this, null, 15), 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, "CreateFinished");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, "ResumeFinished");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, "StartFinished");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, "CreateStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, "ResumeStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, "StartStarted");
    }
}
