package azl;

import android.graphics.Rect;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.revolut.uicomponent.swipe_layout.SwipeToActionLayout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends ViewDragHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeToActionLayout f11492a;

    public p(SwipeToActionLayout swipeToActionLayout) {
        this.f11492a = swipeToActionLayout;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        SwipeToActionLayout swipeToActionLayout = this.f11492a;
        ArrayList arrayList = swipeToActionLayout.f107266n;
        ArrayList arrayList2 = swipeToActionLayout.f107264l;
        Rect rect = swipeToActionLayout.f107267p;
        int i3 = o.f11491b[swipeToActionLayout.f107262h.ordinal()];
        if (i3 == 1) {
            return MathUtils.clamp(i, rect.left - ((!swipeToActionLayout.i || arrayList.isEmpty()) ? swipeToActionLayout.getMaxActionsWidth() : rect.width()), rect.left);
        }
        if (i3 == 2) {
            return MathUtils.clamp(i, rect.left, rect.left + ((!swipeToActionLayout.i || arrayList2.isEmpty()) ? swipeToActionLayout.getMaxActionsWidth() : rect.width()));
        }
        if (!swipeToActionLayout.i || arrayList2.isEmpty() || arrayList.isEmpty()) {
            return MathUtils.clamp(i, rect.left - swipeToActionLayout.getMaxActionsWidth(), swipeToActionLayout.getMaxActionsWidth() + rect.left);
        }
        return i;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onEdgeDragStarted(int i, int i2) {
        super.onEdgeDragStarted(i, i2);
        SwipeToActionLayout swipeToActionLayout = this.f11492a;
        if (swipeToActionLayout.isDragLocked) {
            return;
        }
        ViewDragHelper viewDragHelper = swipeToActionLayout.f107273x;
        View view = swipeToActionLayout.f;
        if (view != null) {
            viewDragHelper.captureChildView(view, i2);
        } else {
            Intrinsics.r("mainView");
            throw null;
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        super.onViewDragStateChanged(i);
        if (i == 0) {
            SwipeToActionLayout swipeToActionLayout = this.f11492a;
            View view = swipeToActionLayout.f;
            if (view == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            if (view.getLeft() == swipeToActionLayout.f107267p.left) {
                swipeToActionLayout.setState(m.CLOSE);
            } else {
                swipeToActionLayout.setState(m.OPEN);
            }
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onViewPositionChanged(changedView, i, i2, i3, i5);
        int i6 = SwipeToActionLayout.z;
        SwipeToActionLayout swipeToActionLayout = this.f11492a;
        swipeToActionLayout.f();
        View view = swipeToActionLayout.f;
        if (view == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        view.getLeft();
        int i21 = swipeToActionLayout.f107261g;
        swipeToActionLayout.getOnSwipeListener();
        View view2 = swipeToActionLayout.f;
        if (view2 == null) {
            Intrinsics.r("mainView");
            throw null;
        }
        swipeToActionLayout.f107261g = view2.getLeft();
        ViewCompat.postInvalidateOnAnimation(swipeToActionLayout);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewReleased(View releasedChild, float f, float f4) {
        Function2<View, Object, Unit> onLongActionClickListener;
        Function2<View, Object, Unit> onLongActionClickListener2;
        Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
        SwipeToActionLayout swipeToActionLayout = this.f11492a;
        Rect rect = swipeToActionLayout.f107267p;
        int thresholdToOpenView = (int) ((swipeToActionLayout.getThresholdToOpenView() * swipeToActionLayout.getMaxActionsWidth()) + rect.left);
        int overscrollThreshold = swipeToActionLayout.getOverscrollThreshold() + swipeToActionLayout.getMaxActionsWidth() + rect.left;
        int thresholdToOpenView2 = (int) (rect.right - (swipeToActionLayout.getThresholdToOpenView() * swipeToActionLayout.getMaxActionsWidth()));
        int maxActionsWidth = (rect.right - swipeToActionLayout.getMaxActionsWidth()) - swipeToActionLayout.getOverscrollThreshold();
        int i = o.f11490a[swipeToActionLayout.u.ordinal()];
        if (i == 1) {
            int i2 = thresholdToOpenView + 1;
            int left = releasedChild.getLeft();
            if (i2 <= left && left <= overscrollThreshold) {
                SwipeToActionLayout.g(swipeToActionLayout);
                return;
            }
            if (releasedChild.getLeft() > overscrollThreshold && (onLongActionClickListener = swipeToActionLayout.getOnLongActionClickListener()) != null) {
                onLongActionClickListener.invoke(d0.b0(swipeToActionLayout.f107265m), d0.b0(swipeToActionLayout.f107264l));
            }
            swipeToActionLayout.d();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        int right = releasedChild.getRight();
        if (maxActionsWidth <= right && right < thresholdToOpenView2) {
            SwipeToActionLayout.g(swipeToActionLayout);
            return;
        }
        if (releasedChild.getRight() < maxActionsWidth && (onLongActionClickListener2 = swipeToActionLayout.getOnLongActionClickListener()) != null) {
            onLongActionClickListener2.invoke(d0.m0(swipeToActionLayout.o), d0.m0(swipeToActionLayout.f107266n));
        }
        swipeToActionLayout.d();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View child, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        int i2 = SwipeToActionLayout.z;
        SwipeToActionLayout swipeToActionLayout = this.f11492a;
        swipeToActionLayout.getClass();
        if (swipeToActionLayout.isDragLocked) {
            return false;
        }
        ViewDragHelper viewDragHelper = swipeToActionLayout.f107273x;
        View view = swipeToActionLayout.f;
        if (view != null) {
            viewDragHelper.captureChildView(view, i);
            return false;
        }
        Intrinsics.r("mainView");
        throw null;
    }
}
