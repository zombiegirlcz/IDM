package zyl;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.revolut.uicomponent.slidingbottomsheet.MiddleStateBottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends ViewDragHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MiddleStateBottomSheetBehavior f326470a;

    public e(MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior) {
        this.f326470a = middleStateBottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i, int i2) {
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.f326470a;
        int i3 = middleStateBottomSheetBehavior.k ? middleStateBottomSheetBehavior.f107243h : middleStateBottomSheetBehavior.f;
        int i5 = middleStateBottomSheetBehavior.f107244j ? middleStateBottomSheetBehavior.f107249q : middleStateBottomSheetBehavior.i;
        return i < i3 ? i3 : i > i5 ? i5 : i;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewVerticalDragRange(View view) {
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.f326470a;
        if (middleStateBottomSheetBehavior.f107244j) {
            return middleStateBottomSheetBehavior.f107249q - (middleStateBottomSheetBehavior.k ? middleStateBottomSheetBehavior.f107243h : middleStateBottomSheetBehavior.f);
        }
        return middleStateBottomSheetBehavior.i - (middleStateBottomSheetBehavior.k ? middleStateBottomSheetBehavior.f107243h : middleStateBottomSheetBehavior.f);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            this.f326470a.setStateInternal(1);
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i5) {
        this.f326470a.dispatchOnSlide(i2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewReleased(View view, float f, float f4) {
        int[] iArr = new int[2];
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.f326470a;
        middleStateBottomSheetBehavior.a(view, f, f4, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (!middleStateBottomSheetBehavior.f107247n.settleCapturedViewAt(view.getLeft(), i)) {
            middleStateBottomSheetBehavior.setStateInternal(i2);
            return;
        }
        middleStateBottomSheetBehavior.setStateInternal(2);
        middleStateBottomSheetBehavior.c(i2);
        ViewCompat.postOnAnimation(view, new d(middleStateBottomSheetBehavior, view, i2, 1));
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i) {
        WeakReference weakReference;
        View view2;
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.f326470a;
        int i2 = middleStateBottomSheetBehavior.f107246m;
        if (i2 == 1 || middleStateBottomSheetBehavior.f107254x) {
            return false;
        }
        return ((i2 == 3 && middleStateBottomSheetBehavior.v == i && (view2 = (View) middleStateBottomSheetBehavior.f107251s.get()) != null && ViewCompat.canScrollVertically(view2, -1)) || (weakReference = middleStateBottomSheetBehavior.f107250r) == null || weakReference.get() != view) ? false : true;
    }
}
