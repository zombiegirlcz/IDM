package gq;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.WorkManager;
import az0.r1;
import cuc.c0;
import ho.t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f, DefaultLifecycleObserver {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f145482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f145483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lifecycle f145484c;
    public final WorkManager d;
    public final AppWidgetManager e;
    public final yf.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zm0.c f145485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f145486h;
    public final AtomicBoolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Object f145487j;

    public i(CoroutineScope scope, Context context, Lifecycle lifecycle, WorkManager workManager, t analyticsTracker, AppWidgetManager appWidgetManager, yf.c appWidgetToggle, zm0.c sessionProvider, n80.b buildInfo, e tokenRefresher) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetToggle, "appWidgetToggle");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
        this.f145482a = scope;
        this.f145483b = context;
        this.f145484c = lifecycle;
        this.d = workManager;
        this.e = appWidgetManager;
        this.f = appWidgetToggle;
        this.f145485g = sessionProvider;
        this.f145486h = tokenRefresher;
        this.i = new AtomicBoolean(false);
        this.f145487j = r0.g();
    }

    public static final Object a(i iVar, b bVar, boolean z, gim.i iVar2) {
        Object objA;
        yf.c cVar = iVar.f;
        Class providerClass = bVar.f145470b.h();
        Intrinsics.checkNotNullParameter(providerClass, "providerClass");
        Context context = (Context) cVar.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, (Class<?>) providerClass));
        return ((componentEnabledSetting == 0 || componentEnabledSetting == 1) && (objA = bVar.a(z, iVar2)) == fim.a.COROUTINE_SUSPENDED) ? objA : Unit.f186387a;
    }

    @Override // od0.e
    public final void clear() {
        if (this.i.compareAndSet(true, false)) {
            this.f145487j = r0.g();
            this.f145484c.removeObserver(this);
            com.revolut.appwidget_core.a.Companion.getClass();
            com.revolut.appwidget_core.a.f50366g.setValue(fq.c.CLEARED);
            this.d.cancelAllWorkByTag("rev_widget_update");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        e0.C(this.f145482a, p0.f264002b, null, new h(this, null), 2);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        e0.C(this.f145482a, p0.f264002b, null, new r1(this, null, 5), 2);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        e0.C(this.f145482a, p0.f264002b, null, new c0(this, null, 3), 2);
    }
}
