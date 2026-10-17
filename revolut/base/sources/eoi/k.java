package eoi;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements Window.OnFrameMetricsAvailableListener, h, Runnable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy f127949h = yhm.j.b(new af0.a(8));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f127950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aoi.c f127951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f127952c;
    public final u d;
    public volatile j e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f127953g;

    public k(Activity activity, aoi.c performanceAnalyticsInteractor, c sessionMetricsAggregator, u screenNameProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(sessionMetricsAggregator, "sessionMetricsAggregator");
        Intrinsics.checkNotNullParameter(screenNameProvider, "screenNameProvider");
        this.f127950a = activity;
        this.f127951b = performanceAnalyticsInteractor;
        this.f127952c = sessionMetricsAggregator;
        this.d = screenNameProvider;
        this.f127953g = -1L;
    }

    public final void a(boolean z) {
        if (z != this.f) {
            this.f = z;
            Lazy lazy = f127949h;
            Activity activity = this.f127950a;
            try {
                if (z) {
                    Window window = activity.getWindow();
                    Companion.getClass();
                    window.addOnFrameMetricsAvailableListener(this, (Handler) lazy.getValue());
                } else {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this);
                    b(null);
                    Companion.getClass();
                    ((Handler) lazy.getValue()).post(this);
                }
            } catch (Exception e) {
                if (Build.VERSION.SDK_INT > 28) {
                    IllegalStateException illegalStateException = new IllegalStateException("Failed to attach frame metrics listener", e);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
            }
        }
    }

    public final void b(Object obj2) {
        WeakReference weakReferenceC;
        if (obj2 == null && this.e == null) {
            return;
        }
        j jVar = null;
        if (obj2 != null) {
            j jVar2 = this.e;
            if (obj2 == ((jVar2 == null || (weakReferenceC = jVar2.c()) == null) ? null : weakReferenceC.get())) {
                return;
            }
        }
        j jVar3 = this.e;
        if (obj2 != null) {
            WeakReference weakReference = new WeakReference(obj2);
            String strB = this.d.b(obj2);
            String strA = this.d.a(obj2);
            aoi.h hVarE = this.f127951b.e("SCREEN_FRAME_STAT");
            hVarE.start();
            hVarE.a("screenName", strB);
            hVarE.a("analyticsScreenName", strA);
            jVar = new j(weakReference, hVarE, this.f127952c);
        }
        this.e = jVar;
        if (jVar3 != null) {
            jVar3.b();
        }
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        WindowManager windowManager;
        WindowManager windowManager2;
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(frameMetrics, "frameMetrics");
        j jVar = this.e;
        if (jVar == null) {
            return;
        }
        if (this.f127953g == -1) {
            Activity activity = this.f127950a;
            Display defaultDisplay = null;
            if (Build.VERSION.SDK_INT >= 30) {
                Display display = activity.getDisplay();
                if (display == null) {
                    Window window2 = activity.getWindow();
                    if (window2 != null && (windowManager2 = window2.getWindowManager()) != null) {
                        defaultDisplay = windowManager2.getDefaultDisplay();
                    }
                } else {
                    defaultDisplay = display;
                }
            } else {
                Window window3 = activity.getWindow();
                if (window3 != null && (windowManager = window3.getWindowManager()) != null) {
                    defaultDisplay = windowManager.getDefaultDisplay();
                }
            }
            float refreshRate = defaultDisplay != null ? defaultDisplay.getRefreshRate() : -1.0f;
            if (refreshRate >= 60.0f && refreshRate < 200.0f) {
                this.f127953g = (long) ((1000 / refreshRate) * 1000000);
            }
        }
        long j2 = this.f127953g;
        if (j2 < 0) {
            return;
        }
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long metric2 = frameMetrics.getMetric(8);
        if (metric < 0 || metric2 < 0) {
            return;
        }
        long metric3 = frameMetrics.getMetric(11);
        if (metric2 < j2) {
            metric2 = j2;
        }
        if (metric < j2) {
            metric = j2;
        }
        jVar.a(metric3, metric2, metric, j2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f127953g = -1L;
    }
}
