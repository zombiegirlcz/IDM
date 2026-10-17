package cr0;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ViewDragHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredStateBottomSheetBehavior f108163a;

    public c(AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior) {
        this.f108163a = anchoredStateBottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        return child.getLeft();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior = this.f108163a;
        int i3 = anchoredStateBottomSheetBehavior.f55883c ? anchoredStateBottomSheetBehavior.A : anchoredStateBottomSheetBehavior.z;
        int i5 = anchoredStateBottomSheetBehavior.f55882b ? anchoredStateBottomSheetBehavior.f55888m : anchoredStateBottomSheetBehavior.B;
        return i < i3 ? i3 : i > i5 ? i5 : i;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewVerticalDragRange(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior = this.f108163a;
        if (anchoredStateBottomSheetBehavior.f55882b) {
            return anchoredStateBottomSheetBehavior.f55888m - (anchoredStateBottomSheetBehavior.f55883c ? anchoredStateBottomSheetBehavior.A : anchoredStateBottomSheetBehavior.z);
        }
        return anchoredStateBottomSheetBehavior.B - (anchoredStateBottomSheetBehavior.f55883c ? anchoredStateBottomSheetBehavior.A : anchoredStateBottomSheetBehavior.z);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            this.f108163a.h(1);
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        this.f108163a.dispatchOnSlide(i2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewReleased(View releasedChild, float f, float f4) {
        Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
        int[] iArr = new int[2];
        AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior = this.f108163a;
        anchoredStateBottomSheetBehavior.a(releasedChild, f, f4, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        ViewDragHelper viewDragHelper = anchoredStateBottomSheetBehavior.f55886j;
        Intrinsics.h(viewDragHelper);
        if (!viewDragHelper.settleCapturedViewAt(releasedChild.getLeft(), i)) {
            anchoredStateBottomSheetBehavior.h(i2);
            return;
        }
        anchoredStateBottomSheetBehavior.h(2);
        anchoredStateBottomSheetBehavior.c(i2);
        anchoredStateBottomSheetBehavior.e(i2, releasedChild);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View child, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior = this.f108163a;
        int i2 = anchoredStateBottomSheetBehavior.i;
        if (i2 == 1 || anchoredStateBottomSheetBehavior.f55894t) {
            return false;
        }
        if (i2 == 3) {
            WeakReference weakReference = anchoredStateBottomSheetBehavior.o;
            Intrinsics.h(weakReference);
            View view = (View) weakReference.get();
            if (view != null && ViewCompat.canScrollVertically(view, -1)) {
                return false;
            }
        }
        WeakReference weakReference2 = anchoredStateBottomSheetBehavior.f55889n;
        return (weakReference2 != null ? (View) weakReference2.get() : null) == child;
    }
}
