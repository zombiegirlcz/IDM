package ua;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f278509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f278510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f278511c;
    public final ScreenContentRecyclerView d;
    public final DraggableTabsView e;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, DraggableTabsView draggableTabsView) {
        this.f278509a = controllerContainerCoordinatorLayout;
        this.f278510b = collapsingActionButton;
        this.f278511c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = draggableTabsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f278509a;
    }
}
