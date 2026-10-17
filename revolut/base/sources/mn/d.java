package mn;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.Window;
import com.revolut.analytics.tracking.v3.l;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import no.j2;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends fsi.c {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fsi.b f207320j = new fsi.b("OVERLAY_APPS_TRACKING_ACTIVITY_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f207321h;
    public final j2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, j2 settingsTracker) {
        super(f207320j);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(settingsTracker, "settingsTracker");
        this.f207321h = activity;
        this.i = settingsTracker;
    }

    @Override // fsi.a
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Activity activity = this.f207321h;
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        boolean z = (window.getAttributes().flags & 8192) != 0;
        if (motionEvent != null && z) {
            boolean z3 = (motionEvent.getFlags() & 1) != 0;
            boolean z4 = (motionEvent.getFlags() & 2) != 0;
            if (motionEvent.getAction() == 1 && (z3 || z4)) {
                String activityRef = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(activityRef, "getName(...)");
                l lVar = (l) this.i;
                lVar.getClass();
                gpk.c cVar = lVar.f50342h;
                Intrinsics.checkNotNullParameter(activityRef, "activityRef");
                Object objC = lVar.d.c();
                if (objC == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "SettingsTracker", "Overlay screen is null for activity:".concat(activityRef), null, h0Var);
                    e0.C(cVar.c(), null, null, new x(lVar, null, 26), 3);
                    return false;
                }
                WeakReference weakReference = lVar.o;
                if (!Intrinsics.f(weakReference != null ? weakReference.get() : null, objC)) {
                    lVar.o = new WeakReference(objC);
                    e0.C(cVar.c(), null, null, new x(lVar, null, 26), 3);
                }
            }
        }
        return false;
    }
}
