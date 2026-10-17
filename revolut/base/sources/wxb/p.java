package wxb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f300846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwipeableCardsView f300847b;

    public p(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, SwipeableCardsView swipeableCardsView) {
        this.f300846a = controllerContainerCoordinatorLayout;
        this.f300847b = swipeableCardsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300846a;
    }
}
