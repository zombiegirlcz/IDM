package jr0;

import android.R;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.h1;
import ix0.i1;
import jq0.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f177892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f177893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f177894c;

    public c(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f177892a = new n(target);
        this.f177893b = (ViewGroup) target.getRootView().findViewById(R.id.content);
    }

    @Override // jr0.l
    public final void a(float f) {
        h hVar = this.f177894c;
        if (hVar != null) {
            float fA = i1.a(BitmapDescriptorFactory.HUE_RED, 0.25f, f);
            float fA2 = i1.a(0.6666667f, 1.0f, f);
            Interpolator interpolator = r.f177396h;
            hVar.setDimProgress(interpolator.getInterpolation(fA) - interpolator.getInterpolation(fA2));
        }
    }

    @Override // jr0.l
    public final void b() {
        this.f177892a.b();
        h hVar = this.f177894c;
        if (hVar != null) {
            hVar.setClickable(false);
            hVar.setAlpha(BitmapDescriptorFactory.HUE_RED);
            ViewParent parent = hVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                h1.b(new d0.c(hVar, viewGroup, 28));
            }
        }
        this.f177894c = null;
    }

    @Override // jr0.l
    public final void onStart() {
        ViewGroup viewGroup;
        if (this.f177894c == null && (viewGroup = this.f177893b) != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            viewGroup.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            h hVar = new h(context);
            viewGroup.addView(hVar);
            if (viewGroup.isLaidOut()) {
                hVar.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
            }
            this.f177894c = hVar;
            this.f177892a.onStart();
        }
    }
}
