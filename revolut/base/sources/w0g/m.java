package w0g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f293719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputTravelSearchItemView f293720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f293721c;
    public final ActionsView d;
    public final InputTravelSearchItemView e;
    public final SlidingFromTopViewContainer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SlidingFromTopViewContainer f293722g;

    public m(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, InputTravelSearchItemView inputTravelSearchItemView, NavBarWithToolbar navBarWithToolbar, ActionsView actionsView, InputTravelSearchItemView inputTravelSearchItemView2, SlidingFromTopViewContainer slidingFromTopViewContainer, SlidingFromTopViewContainer slidingFromTopViewContainer2) {
        this.f293719a = controllerContainerCoordinatorLayout;
        this.f293720b = inputTravelSearchItemView;
        this.f293721c = navBarWithToolbar;
        this.d = actionsView;
        this.e = inputTravelSearchItemView2;
        this.f = slidingFromTopViewContainer;
        this.f293722g = slidingFromTopViewContainer2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293719a;
    }
}
