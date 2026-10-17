package bx0;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.ui.views.view.debug.CameraKitDebugOverlayHeaderView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.core.ui_kit.views.status.StatusView;
import et0.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp0.s0;
import mx0.b5;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19446b;

    public /* synthetic */ q(Object obj2, int i) {
        this.f19445a = i;
        this.f19446b = obj2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent e) {
        int i = this.f19445a;
        Object obj2 = this.f19446b;
        switch (i) {
            case 4:
                Intrinsics.checkNotNullParameter(e, "e");
                ((kp0.u) obj2).f188104n.invoke();
                return true;
            case 5:
                Intrinsics.checkNotNullParameter(e, "e");
                ((s0) obj2).f188091m.invoke();
                return true;
            case 6:
            case 7:
            case 8:
            case 10:
            default:
                return super.onDoubleTap(e);
            case 9:
                Intrinsics.checkNotNullParameter(e, "e");
                nyl.b bVar = (nyl.b) obj2;
                if (bVar.f220924j && bVar.k) {
                    float f = bVar.f;
                    float maxZoom = f <= 1.0f ? bVar.getMaxZoom() : 1.0f;
                    ValueAnimator valueAnimator = bVar.f220923h;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, maxZoom);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(bVar, e, 22));
                    valueAnimatorOfFloat.start();
                    bVar.f220923h = valueAnimatorOfFloat;
                }
                return true;
            case 11:
                Intrinsics.checkNotNullParameter(e, "e");
                ((CameraKitDebugOverlayHeaderView) obj2).f50892a.k(Unit.f186387a);
                return false;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        switch (this.f19445a) {
            case 0:
                Intrinsics.checkNotNullParameter(e, "e");
                return ((r) this.f19446b).f19447a;
            case 1:
                Intrinsics.checkNotNullParameter(e, "e");
                z0 z0Var = (z0) this.f19446b;
                if (!z0Var.D.isFinished()) {
                    z0Var.D.abortAnimation();
                }
                z0Var.c(e);
                return true;
            case 8:
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            case 10:
                Intrinsics.checkNotNullParameter(e, "e");
                SegmentedGaugeChartView segmentedGaugeChartView = (SegmentedGaugeChartView) this.f19446b;
                if (segmentedGaugeChartView.getGesturesEnabled()) {
                    int i = pt0.q.f239582a[segmentedGaugeChartView.getData().c().ordinal()];
                    if (i == 1) {
                        return true;
                    }
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return false;
            case 12:
                Intrinsics.checkNotNullParameter(e, "e");
                ((xu0.g) this.f19446b).f308866h = false;
                return true;
            default:
                return super.onDown(e);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        switch (this.f19445a) {
            case 0:
                r rVar = (r) this.f19446b;
                Intrinsics.checkNotNullParameter(e2, "e2");
                if (motionEvent != null) {
                    float y2 = e2.getY() - motionEvent.getY();
                    float x3 = e2.getX() - motionEvent.getX();
                    if (Math.abs(x3) > Math.abs(y2) && Math.abs(x3) > 50.0f && Math.abs(f) > 20.0f && x3 > BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    if (Math.abs(x3) > Math.abs(y2) && Math.abs(x3) > 50.0f && Math.abs(f) > 20.0f && x3 < BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    if (Math.abs(y2) > 50.0f && Math.abs(f4) > 20.0f && y2 > BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    if (Math.abs(y2) > 50.0f && Math.abs(f4) > 20.0f && y2 < BitmapDescriptorFactory.HUE_RED) {
                        rVar.a();
                        return true;
                    }
                }
                return false;
            case 1:
                Intrinsics.checkNotNullParameter(e2, "e2");
                z0 z0Var = (z0) this.f19446b;
                z0Var.D.fling(z0Var.getScrollX(), z0Var.getScrollY(), -((int) f), 0, 0, Math.max(0, z0Var.v - z0Var.getWidth()), 0, 0);
                z0Var.postInvalidateOnAnimation();
                return true;
            case 2:
                Intrinsics.checkNotNullParameter(e2, "e2");
                StatusView statusView = (StatusView) this.f19446b;
                if (!statusView.getAllowSwipeToDismiss()) {
                    return false;
                }
                if (f4 <= BitmapDescriptorFactory.HUE_RED || statusView.getScrollY() != 0) {
                    return super.onFling(motionEvent, e2, f, f4);
                }
                statusView.s();
                return true;
            case 12:
                Intrinsics.checkNotNullParameter(e2, "e2");
                ((xu0.g) this.f19446b).f308866h = true;
                return false;
            default:
                return super.onFling(motionEvent, e2, f, f4);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e) {
        switch (this.f19445a) {
            case 1:
                Intrinsics.checkNotNullParameter(e, "e");
                z0 z0Var = (z0) this.f19446b;
                if (!z0Var.K.H) {
                    z0Var.a();
                    z0Var.performLongClick();
                } else {
                    z0Var.a();
                }
                break;
            case 2:
            default:
                super.onLongPress(e);
                break;
            case 3:
                hu0.f fVar = (hu0.f) this.f19446b;
                View.OnLongClickListener onLongClickListener = fVar.f155499q;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(fVar.f155493h);
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(e, "e");
                kp0.u uVar = (kp0.u) this.f19446b;
                uVar.i.performHapticFeedback(0);
                uVar.f188103m.invoke();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(e, "e");
                ((s0) this.f19446b).f188090l.invoke();
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        int i = this.f19445a;
        Object obj2 = this.f19446b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(e2, "e2");
                z0 z0Var = (z0) obj2;
                int i2 = z0.O;
                z0Var.a();
                int iMax = Math.max(0, z0Var.v - z0Var.getWidth());
                int i3 = (int) f;
                int scrollX = z0Var.getScrollX() + i3;
                if (!z0Var.N) {
                    if (scrollX < 0) {
                        EdgeEffectCompat.onPullDistance(z0Var.F, (-f) / z0Var.getWidth(), 1.0f - (e2.getY() / z0Var.getHeight()));
                        if (!z0Var.G.isFinished()) {
                            z0Var.G.onRelease();
                        }
                    } else if (scrollX > iMax) {
                        EdgeEffectCompat.onPullDistance(z0Var.G, f / z0Var.getWidth(), e2.getY() / z0Var.getHeight());
                        if (!z0Var.F.isFinished()) {
                            z0Var.F.onRelease();
                        }
                    }
                }
                z0Var.scrollBy(i3, 0);
                if (!z0Var.N && (!z0Var.F.isFinished() || !z0Var.G.isFinished())) {
                    z0Var.postInvalidateOnAnimation();
                }
                return true;
            case 7:
                Intrinsics.checkNotNullParameter(e2, "e2");
                ((b5) obj2).f209598r.postTranslate(-f, -f4);
                return true;
            case 9:
                Intrinsics.checkNotNullParameter(e2, "e2");
                nyl.b bVar = (nyl.b) obj2;
                PointF pointF = bVar.d;
                if (!bVar.i && bVar.f > 1.0f) {
                    pointF.offset(-f, -f4);
                    float f5 = pointF.x;
                    PointF pointF2 = bVar.e;
                    pointF.x = kotlin.ranges.f.f(f5, -pointF2.x, BitmapDescriptorFactory.HUE_RED);
                    pointF.y = kotlin.ranges.f.f(pointF.y, -pointF2.y, BitmapDescriptorFactory.HUE_RED);
                    bVar.invalidate();
                }
                return super.onScroll(motionEvent, e2, f, f4);
            case 12:
                Intrinsics.checkNotNullParameter(e2, "e2");
                xu0.g gVar = (xu0.g) obj2;
                ViewDragHelper viewDragHelper = gVar.f308870n;
                zu0.e eVar = gVar.f308863b;
                SwipeToActionLayout swipeToActionLayout = gVar.f308862a;
                gVar.f308866h = true;
                vu0.r.Companion.getClass();
                gVar.i = f > BitmapDescriptorFactory.HUE_RED ? vu0.r.END_TO_START : vu0.r.START_TO_END;
                Rect rect = eVar.f325197c;
                zu0.i iVar = eVar.f325196b;
                int iD = eVar.d() + iVar.g() + rect.left;
                int iG = (rect.right - iVar.g()) - eVar.d();
                vu0.r rVar = gVar.i;
                vu0.r rVar2 = vu0.r.START_TO_END;
                if (rVar != rVar2 || swipeToActionLayout.getMainView().getLeft() <= iD) {
                    vu0.r rVar3 = gVar.i;
                    vu0.r rVar4 = vu0.r.END_TO_START;
                    if (rVar3 == rVar4 && swipeToActionLayout.getMainView().getRight() < iG) {
                        swipeToActionLayout.setState$ui_kit_components_release(vu0.u.DRAG_FULLY_OPENED);
                    } else if (viewDragHelper.getViewDragState() == 1 && gVar.i == rVar4 && swipeToActionLayout.getMainView().getLeft() < iD) {
                        swipeToActionLayout.setState$ui_kit_components_release(vu0.u.CLOSING_MANUALLY);
                    } else if (viewDragHelper.getViewDragState() == 1 && gVar.i == rVar2 && swipeToActionLayout.getMainView().getRight() > iG) {
                        swipeToActionLayout.setState$ui_kit_components_release(vu0.u.CLOSING_MANUALLY);
                    }
                } else {
                    swipeToActionLayout.setState$ui_kit_components_release(vu0.u.DRAG_FULLY_OPENED);
                }
                return false;
            default:
                return super.onScroll(motionEvent, e2, f, f4);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent e) {
        switch (this.f19445a) {
            case 4:
                Intrinsics.checkNotNullParameter(e, "e");
                ((kp0.u) this.f19446b).f188102l.invoke();
                return true;
            case 5:
                Intrinsics.checkNotNullParameter(e, "e");
                ((s0) this.f19446b).k.invoke();
                return true;
            default:
                return super.onSingleTapConfirmed(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSingleTapUp(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx0.q.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public q(xu0.g callback) {
        this.f19445a = 12;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f19446b = callback;
    }
}
