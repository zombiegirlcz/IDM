package ru0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.stories.TouchNavigatedViewPager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TouchNavigatedViewPager f257402a;

    public j(TouchNavigatedViewPager touchNavigatedViewPager) {
        this.f257402a = touchNavigatedViewPager;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        h hVar = h.INITIAL;
        TouchNavigatedViewPager touchNavigatedViewPager = this.f257402a;
        touchNavigatedViewPager.f57597g = hVar;
        touchNavigatedViewPager.f = e.getX();
        i touchNavigationListener = touchNavigatedViewPager.getTouchNavigationListener();
        if (touchNavigationListener == null) {
            return false;
        }
        touchNavigationListener.f();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        i touchNavigationListener = this.f257402a.getTouchNavigationListener();
        if (touchNavigationListener != null) {
            touchNavigationListener.e();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        h hVar;
        Intrinsics.checkNotNullParameter(e2, "e2");
        TouchNavigatedViewPager touchNavigatedViewPager = this.f257402a;
        h hVar2 = touchNavigatedViewPager.f57597g;
        h hVar3 = h.CLOSING_SCROLL_CANCELLED;
        if (hVar2 != hVar3 && hVar2 != (hVar = h.OTHER_SCROLL)) {
            if (f4 < BitmapDescriptorFactory.HUE_RED && Math.abs(f4) > Math.abs(f)) {
                hVar3 = h.CLOSING_SCROLL;
            } else if (touchNavigatedViewPager.f57597g != h.CLOSING_SCROLL) {
                hVar3 = hVar;
            }
            touchNavigatedViewPager.f57597g = hVar3;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent event) {
        i iVar;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event.getEventTime() - event.getDownTime() < 300;
        TouchNavigatedViewPager touchNavigatedViewPager = this.f257402a;
        i touchNavigationListener = touchNavigatedViewPager.getTouchNavigationListener();
        if (touchNavigationListener != null) {
            touchNavigationListener.a();
        }
        i touchNavigationListener2 = touchNavigatedViewPager.getTouchNavigationListener();
        if (!(touchNavigationListener2 != null ? touchNavigationListener2.c(event) : false) && z && event.getY() >= touchNavigatedViewPager.topClickPadding && event.getY() <= touchNavigatedViewPager.getHeight() - touchNavigatedViewPager.bottomClickPadding && Math.abs(touchNavigatedViewPager.f - event.getX()) <= touchNavigatedViewPager.f57598h) {
            float x3 = event.getX() / touchNavigatedViewPager.getWidth();
            if (x3 <= 0.4f) {
                i iVar2 = touchNavigatedViewPager.touchNavigationListener;
                if (iVar2 != null) {
                    iVar2.d();
                    return false;
                }
            } else if (x3 >= 0.6f && (iVar = touchNavigatedViewPager.touchNavigationListener) != null) {
                iVar.b();
            }
        }
        return false;
    }
}
