package evf;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f129784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f129785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DraggableTabsView f129786c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, DraggableTabsView draggableTabsView) {
        this.f129784a = controllerContainerCoordinatorLayout;
        this.f129785b = navBarWithToolbar;
        this.f129786c = draggableTabsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f129784a;
    }
}
