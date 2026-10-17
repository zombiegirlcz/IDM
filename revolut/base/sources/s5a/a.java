package s5a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f260052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f260053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f260054c;
    public final Tabs d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, Tabs tabs) {
        this.f260052a = controllerContainerCoordinatorLayout;
        this.f260053b = navBarWithToolbar;
        this.f260054c = screenContentRecyclerView;
        this.d = tabs;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f260052a;
    }
}
