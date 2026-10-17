package d09;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f110333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwipeableCardsView f110334b;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, SwipeableCardsView swipeableCardsView) {
        this.f110333a = controllerContainerCoordinatorLayout;
        this.f110334b = swipeableCardsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f110333a;
    }
}
