package a60;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f1519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f1521c;
    public final ScreenContentRecyclerView d;
    public final ControllerContainerConstraintLayout e;

    public f(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, ControllerContainerConstraintLayout controllerContainerConstraintLayout2) {
        this.f1519a = controllerContainerConstraintLayout;
        this.f1520b = controllerContainerCoordinatorLayout;
        this.f1521c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = controllerContainerConstraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1519a;
    }
}
