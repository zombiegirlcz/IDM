package cr0;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends js0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f108162c;
    public final int d;
    public final /* synthetic */ AnchoredStateBottomSheetBehavior e;

    public b(AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior, View mView, int i, int i2) {
        this.f108161b = i2;
        switch (i2) {
            case 1:
                Intrinsics.checkNotNullParameter(mView, "mView");
                this.e = anchoredStateBottomSheetBehavior;
                this.f108162c = mView;
                this.d = i;
                break;
            default:
                Intrinsics.checkNotNullParameter(mView, "mView");
                this.e = anchoredStateBottomSheetBehavior;
                this.f108162c = mView;
                this.d = i;
                break;
        }
    }

    @Override // js0.a
    public final void a() {
        switch (this.f108161b) {
            case 0:
                AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior = this.e;
                ViewDragHelper viewDragHelper = anchoredStateBottomSheetBehavior.f55886j;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    ViewCompat.postOnAnimation(this.f108162c, this);
                } else {
                    anchoredStateBottomSheetBehavior.C = null;
                    anchoredStateBottomSheetBehavior.h(this.d);
                }
                break;
            default:
                AnchoredStateBottomSheetBehavior anchoredStateBottomSheetBehavior2 = this.e;
                anchoredStateBottomSheetBehavior2.D = null;
                anchoredStateBottomSheetBehavior2.i(this.d, this.f108162c);
                break;
        }
    }
}
