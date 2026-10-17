package jji;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import d9.t0;
import dy0.h0;
import dy0.i0;
import dy0.j0;
import dy0.m0;
import dy0.o0;
import dy0.p0;
import dy0.q0;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174993a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f174994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f174995c;
    public final Object d;

    public x(dy0.h enterTransition, q0 exitTransition) {
        Intrinsics.checkNotNullParameter(enterTransition, "enterTransition");
        Intrinsics.checkNotNullParameter(exitTransition, "exitTransition");
        this.f174995c = enterTransition;
        this.f174994b = exitTransition;
        this.d = yhm.j.b(new d8e.a(this, 22));
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, dy0.r state) {
        switch (this.f174993a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                q0 q0Var = this.f174994b;
                if (q0Var != null) {
                    q0Var.a(view, parent, state);
                    return;
                } else {
                    Intrinsics.r("swipeToZoomTransition");
                    throw null;
                }
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                ((dy0.h) this.f174995c).a(view, parent, state);
                this.f174994b.a(view, parent, state);
                return;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f174994b.a(view, parent, state);
                ZoomableFullScreenVideoView zoomableFullScreenVideoView = (ZoomableFullScreenVideoView) this.f174995c;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                zoomableFullScreenVideoView.f59751c = false;
                int i = iy0.b.f169578a[state.ordinal()];
                if (i == 1) {
                    zoomableFullScreenVideoView.f(true);
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zoomableFullScreenVideoView.f59750b) {
                        zoomableFullScreenVideoView.f(false);
                        return;
                    } else {
                        zoomableFullScreenVideoView.g(0);
                        return;
                    }
                }
        }
    }

    @Override // dy0.m0
    public final void b(View view, SliderLayout parent, float f) throws Throwable {
        switch (this.f174993a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                q0 q0Var = this.f174994b;
                if (q0Var != null) {
                    q0Var.b(view, parent, f);
                    return;
                } else {
                    Intrinsics.r("swipeToZoomTransition");
                    throw null;
                }
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                int i = dy0.a.f120962a[parent.getCurrentState().ordinal()];
                if (i == 1) {
                    this.f174994b.b(view, parent, f);
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((dy0.h) this.f174995c).b(view, parent, f);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                this.f174994b.b(view, parent, f);
                return;
        }
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        switch (this.f174993a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                q0 q0Var = this.f174994b;
                if (q0Var != null) {
                    q0Var.c(view, parent, f);
                    return;
                } else {
                    Intrinsics.r("swipeToZoomTransition");
                    throw null;
                }
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                int i = dy0.a.f120962a[parent.getCurrentState().ordinal()];
                if (i == 1) {
                    this.f174994b.c(view, parent, f);
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((dy0.h) this.f174995c).c(view, parent, f);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                this.f174994b.c(view, parent, f);
                return;
        }
    }

    @Override // dy0.m0
    public final void d(View slidingView, SliderLayout parent, dy0.r targetState) throws Throwable {
        int i = this.f174993a;
        Object obj2 = this.f174995c;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(slidingView, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(targetState, "targetState");
                Class cls = (Class) obj2;
                try {
                    z zVar = a0.Companion;
                    Intrinsics.checkNotNullParameter(zVar, "<this>");
                    Intrinsics.checkNotNullParameter(slidingView, "slidingView");
                    Object tag2 = slidingView.getTag(R$id.zoom_sliding_animation);
                    p0 p0Var = null;
                    ZoomTransitionAnimation zoomTransitionAnimation = tag2 instanceof ZoomTransitionAnimation ? (ZoomTransitionAnimation) tag2 : null;
                    if (zoomTransitionAnimation == null) {
                        throw new IllegalStateException("Couldn't start dismiss by swipe. Zoom finder target is not found");
                    }
                    ParcelableViewTarget parcelableViewTargetC = com.revolut.kompot.common.transition.a.c(zVar, zoomTransitionAnimation);
                    if (parcelableViewTargetC != null || !zoomTransitionAnimation.getF98369g()) {
                        if (parcelableViewTargetC == null) {
                            throw new IllegalStateException("Cannot build zoom source by[" + zoomTransitionAnimation.getF98370a() + "]");
                        }
                        p0Var = new p0(parcelableViewTargetC, false, zoomTransitionAnimation.getF());
                    }
                    q0 q0Var = new q0(p0Var, false, false);
                    this.f174994b = q0Var;
                    q0Var.d(slidingView, parent, targetState);
                    Unit unit = Unit.f186387a;
                    return;
                } catch (Throwable th10) {
                    if (!(th10 instanceof CancellationException)) {
                        t0.a(th10, cls, x.class, "prepare");
                    }
                    throw th10;
                }
            case 1:
                Intrinsics.checkNotNullParameter(slidingView, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(targetState, "targetState");
                int i2 = dy0.a.f120962a[targetState.ordinal()];
                if (i2 == 1) {
                    ((dy0.h) obj2).d(slidingView, parent, targetState);
                    return;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f174994b.d(slidingView, parent, targetState);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(slidingView, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(targetState, "targetState");
                this.f174994b.d(slidingView, parent, targetState);
                ZoomableFullScreenVideoView zoomableFullScreenVideoView = (ZoomableFullScreenVideoView) obj2;
                Intrinsics.checkNotNullParameter(slidingView, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(targetState, "targetState");
                zoomableFullScreenVideoView.f59751c = true;
                if (zoomableFullScreenVideoView.f59750b) {
                    return;
                }
                zoomableFullScreenVideoView.d(0);
                return;
        }
    }

    @Override // dy0.m0
    public final void e(View view, SliderLayout parent, float f) throws Throwable {
        switch (this.f174993a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                q0 q0Var = this.f174994b;
                if (q0Var != null) {
                    q0Var.e(view, parent, f);
                    return;
                } else {
                    Intrinsics.r("swipeToZoomTransition");
                    throw null;
                }
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                int i = dy0.a.f120962a[parent.getCurrentState().ordinal()];
                if (i == 1) {
                    this.f174994b.e(view, parent, f);
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((dy0.h) this.f174995c).e(view, parent, f);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                this.f174994b.e(view, parent, f);
                return;
        }
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        switch (this.f174993a) {
            case 0:
                return (i0) this.d;
            case 1:
                return (i0) ((Lazy) this.d).getValue();
            default:
                return (i0) this.d;
        }
    }

    public x(ZoomableFullScreenVideoView zoomableFullScreenVideoView) {
        this.f174995c = zoomableFullScreenVideoView;
        q0 q0Var = new q0((p0) null, false, false);
        this.f174994b = q0Var;
        this.d = q0Var.f121014c;
    }

    public x(Class ownerClass) {
        Intrinsics.checkNotNullParameter(ownerClass, "ownerClass");
        this.f174995c = ownerClass;
        o0 o0Var = q0.Companion;
        jj2.a aVar = new jj2.a(this, 2);
        o0Var.getClass();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        h0 customSettling = new h0(aVar, aVar, linearInterpolator, linearInterpolator);
        Intrinsics.checkNotNullParameter(customSettling, "customSettling");
        this.d = new i0(new j0(300.0f), customSettling, true, true);
    }
}
