package kjd;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomExpandableDialogView f184371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f184372c;

    public /* synthetic */ f(BottomExpandableDialogView bottomExpandableDialogView, CoordinatorLayout coordinatorLayout, int i) {
        this.f184370a = i;
        this.f184371b = bottomExpandableDialogView;
        this.f184372c = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f184370a) {
            case 0:
                CoordinatorLayout coordinatorLayout = this.f184372c;
                this.f184371b.setAnchoredStateOffset(coordinatorLayout.getHeight() / 2);
                coordinatorLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            default:
                CoordinatorLayout coordinatorLayout2 = this.f184372c;
                this.f184371b.setAnchoredStateOffset(coordinatorLayout2.getHeight() / 2);
                coordinatorLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
        }
    }
}
