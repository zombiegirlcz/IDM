package eoi;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements LifecycleEventObserver, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f127919a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static aoi.c f127920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static aoi.h f127921c;
    public static int d;
    public static long e;
    public static int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f127922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f127923h;
    public static long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f127924j;
    public static long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f127925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f127926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f127927n;
    public static long o;

    private c() {
    }

    public static String a(int i2, long j2) {
        return "{\"total_ms\":" + j2 + ",\"count\":" + i2 + "}";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = b.f127912a[event.ordinal()];
        if (i2 == 1) {
            aoi.c cVar = f127920b;
            if (cVar == null) {
                Intrinsics.r("analyticsInteractor");
                throw null;
            }
            aoi.h hVarE = cVar.e("APP_IN_FOREGROUND");
            hVarE.start();
            f127921c = hVarE;
            d = 0;
            e = 0L;
            f127923h = 0;
            i = 0L;
            f127924j = 0;
            k = 0L;
            f = 0;
            f127922g = 0L;
            f127925l = 0;
            f127926m = 0;
            f127927n = 0L;
            o = 0L;
            return;
        }
        if (i2 != 2) {
            return;
        }
        aoi.c cVar2 = f127920b;
        if (cVar2 == null) {
            Intrinsics.r("analyticsInteractor");
            throw null;
        }
        aoi.h hVarB = cVar2.b("FULL_SCREEN_LOADER_VISIBLE");
        if (hVarB != null) {
            hVarB.a("stoppedByGoingToBackground", "true");
        }
        aoi.c cVar3 = f127920b;
        if (cVar3 == null) {
            Intrinsics.r("analyticsInteractor");
            throw null;
        }
        aoi.h hVarF = cVar3.f("FULL_SCREEN_LOADER_VISIBLE");
        aoi.h hVar = f127921c;
        if (hVar != null) {
            f127921c = null;
            hVar.a("shimmer_info", a(d, e));
            hVar.a("spinner_info", a(f, f127922g));
            hVar.a("empty_info", a(f127923h, i));
            hVar.a("first_data_frame_ui_processing_info", a(f127924j, k));
            if (hVarF != null && hVarF.getDuration() >= 0) {
                long duration = hVarF.getDuration();
                f++;
                f127922g += duration;
            }
            int i3 = f127925l;
            if (i3 != 0) {
                long j2 = o;
                if (j2 != 0) {
                    hVar.a("frames", a0.d.j(100 - ((f127927n * 100) / j2), "}", com.google.android.gms.internal.mlkit_vision_face.a.v((((long) f127926m) * 100) / ((long) i3), "{\"slow\":", ",\"miss_ui\":")));
                }
            }
            hVar.stop();
        }
    }
}
