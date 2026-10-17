package com.revolut.core.ui_kit.views.slider_layout;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import dy0.o;
import dy0.p;
import dy0.q;
import dy0.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderLayout f59681a;

    public b(SliderLayout sliderLayout) {
        this.f59681a = sliderLayout;
    }

    public static final float a(b bVar, float f) {
        SliderLayout sliderLayout = bVar.f59681a;
        SliderLayout.a aVar = SliderLayout.Companion;
        if (!sliderLayout.K().f59679a.getConfig().d) {
            return f;
        }
        float slidingViewFullOffset = sliderLayout.getSlidingViewFullOffset();
        return (f * slidingViewFullOffset) / ((f / 1.3f) + slidingViewFullOffset);
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [ix0.a2, java.lang.Object] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        float fH;
        q qVar;
        Intrinsics.checkNotNullParameter(e2, "e2");
        SliderLayout sliderLayout = this.f59681a;
        SliderLayout.SlidingSpec slidingSpec = sliderLayout.f59659g;
        if (slidingSpec == null || !sliderLayout.getSlidingEnabled() || !sliderLayout.getSlideByTouchStarted() || !sliderLayout.y(slidingSpec)) {
            return false;
        }
        o oVar = slidingSpec.f59675c;
        if (oVar == null) {
            oVar = slidingSpec.f59673a;
        }
        o oVar2 = oVar;
        int i = p.f121005a[oVar2.ordinal()];
        if (i == 1 || i == 2) {
            fH = f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fH = f4;
        }
        if (sliderLayout.f59661j == null) {
            sliderLayout.B("Update sliding view when it is null");
        }
        View viewI = sliderLayout.I();
        ?? r72 = sliderLayout.v;
        if (r72 != 0) {
            r72.cancel();
        }
        if (!ViewCompat.isLaidOut(viewI) || viewI.isLayoutRequested()) {
            q qVar2 = new q(viewI, sliderLayout, sliderLayout, fH, oVar2);
            viewI.addOnLayoutChangeListener(qVar2);
            qVar = qVar2;
        } else {
            qVar = null;
            sliderLayout.v = null;
            if (sliderLayout.getAbsoluteTransitionProgress() < 0.25f && Math.abs(fH) < sliderLayout.k && Math.signum(fH) == oVar2.a()) {
                fH = SliderLayout.h(sliderLayout);
            }
            sliderLayout.settleSlideView(fH);
        }
        sliderLayout.v = qVar;
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [ix0.a2, java.lang.Object] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        o oVar;
        o oVar2;
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (motionEvent == null) {
            return false;
        }
        SliderLayout sliderLayout = this.f59681a;
        if (!sliderLayout.getSlidingEnabled()) {
            return false;
        }
        float y2 = e2.getY() - motionEvent.getY();
        float x3 = e2.getX() - motionEvent.getX();
        SliderLayout.SlidingSpec slidingSpec = sliderLayout.f59659g;
        q qVar = null;
        if (slidingSpec != null) {
            oVar = slidingSpec.f59675c;
            if (oVar == null) {
                oVar = slidingSpec.f59673a;
            }
        } else {
            oVar = null;
        }
        o oVar3 = o.BOTTOM;
        float fSignum = BitmapDescriptorFactory.HUE_RED;
        if (oVar != oVar3) {
            o oVar4 = o.RIGHT;
            if (oVar == oVar4 || oVar == (oVar2 = o.LEFT)) {
                y2 = x3;
            } else if (Math.abs(y2) >= Math.abs(x3)) {
                slidingSpec = new SliderLayout.SlidingSpec(oVar3, true);
            } else {
                slidingSpec = x3 > BitmapDescriptorFactory.HUE_RED ? new SliderLayout.SlidingSpec(oVar4, true) : new SliderLayout.SlidingSpec(oVar2, true);
                y2 = x3;
            }
        }
        float f5 = sliderLayout.f59670w;
        if (f5 == Float.MIN_VALUE) {
            float fSignum2 = Math.signum(y2) * ViewConfiguration.get(sliderLayout.getContext()).getScaledTouchSlop();
            f5 = Math.abs(fSignum2) < Math.abs(y2) ? fSignum2 : 0.0f;
            sliderLayout.f59670w = f5;
        }
        float f6 = sliderLayout.f59671x;
        if (f6 != Float.MIN_VALUE) {
            if (sliderLayout.f59672y == Float.MIN_VALUE) {
                fSignum = f6;
            } else {
                float fAbs = ((Math.abs(y2 - f5) - Math.abs(sliderLayout.f59672y)) * 2) / 3;
                sliderLayout.f59672y = Float.MIN_VALUE;
                fSignum = Math.signum(y2) * fAbs;
            }
        }
        sliderLayout.f59671x = fSignum;
        float f32 = f5 + fSignum;
        if (Math.abs(f32) >= Math.abs(y2)) {
            f32 = y2;
        }
        float f35 = y2 - f32;
        if (Math.signum(f35) != slidingSpec.f59673a.a() && sliderLayout.getCurrentState() == r.HIDDEN) {
            return false;
        }
        r currentState = sliderLayout.getCurrentState();
        r rVar = r.SHOWN;
        if ((currentState == rVar && Math.signum(f35) != sliderLayout.getVelocitySign()) || !sliderLayout.y(slidingSpec)) {
            return false;
        }
        boolean slideByTouchStarted = sliderLayout.getSlideByTouchStarted();
        sliderLayout.f = true;
        if (!Intrinsics.f(sliderLayout.f59659g, slidingSpec)) {
            sliderLayout.f59659g = slidingSpec;
            sliderLayout.f59672y = f35;
            sliderLayout.F(slidingSpec, true);
        }
        if (sliderLayout.getCurrentState() == rVar && !slideByTouchStarted) {
            sliderLayout.f59672y = f35;
            sliderLayout.t(true);
        }
        if (sliderLayout.f59661j == null) {
            sliderLayout.B("Update sliding view when it is null");
        }
        View viewI = sliderLayout.I();
        ?? r87 = sliderLayout.v;
        if (r87 != 0) {
            r87.cancel();
        }
        if (!ViewCompat.isLaidOut(viewI) || viewI.isLayoutRequested()) {
            q qVar2 = new q(viewI, sliderLayout, sliderLayout, this, f35);
            viewI.addOnLayoutChangeListener(qVar2);
            qVar = qVar2;
        } else {
            sliderLayout.v = null;
            sliderLayout.S((int) a(this, Math.abs(f35)));
        }
        sliderLayout.v = qVar;
        SliderLayout.i(sliderLayout);
        return true;
    }
}
