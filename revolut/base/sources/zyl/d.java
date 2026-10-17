package zyl;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.revolut.uicomponent.slidingbottomsheet.MiddleStateBottomSheetBehavior;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f326468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f326469c;
    public final /* synthetic */ MiddleStateBottomSheetBehavior d;

    public /* synthetic */ d(MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior, View view, int i, int i2) {
        this.f326467a = i2;
        this.f326468b = view;
        this.f326469c = i;
        this.d = middleStateBottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f326467a) {
            case 0:
                View view = this.f326468b;
                this.d.e(this.f326469c, view);
                break;
            default:
                MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.d;
                ViewDragHelper viewDragHelper = middleStateBottomSheetBehavior.f107247n;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    ViewCompat.postOnAnimation(this.f326468b, this);
                } else {
                    middleStateBottomSheetBehavior.setStateInternal(this.f326469c);
                }
                break;
        }
    }
}
