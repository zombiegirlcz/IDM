package x1j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f302447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f302448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f302449c;
    public final Tabs d;
    public final TwinVerticalButton e;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, Tabs tabs, TwinVerticalButton twinVerticalButton) {
        this.f302447a = controllerContainerCoordinatorLayout;
        this.f302448b = navBarWithToolbar;
        this.f302449c = screenContentRecyclerView;
        this.d = tabs;
        this.e = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f302447a;
    }
}
