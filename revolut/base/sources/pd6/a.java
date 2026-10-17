package pd6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f235112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwipeableCardsView f235113b;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, SwipeableCardsView swipeableCardsView) {
        this.f235112a = controllerContainerCoordinatorLayout;
        this.f235113b = swipeableCardsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f235112a;
    }
}
