package ep8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f128106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f128107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f128108c;
    public final ScreenContentRecyclerView d;

    public a(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f128106a = controllerContainerCoordinatorLayout;
        this.f128107b = largeActionButton;
        this.f128108c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f128106a;
    }
}
