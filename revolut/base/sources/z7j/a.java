package z7j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f320021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ButtonsActionsView f320022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f320023c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ButtonsActionsView buttonsActionsView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f320021a = controllerContainerCoordinatorLayout;
        this.f320022b = buttonsActionsView;
        this.f320023c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f320021a;
    }
}
