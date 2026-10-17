package kpf;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f188235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f188236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f188237c;

    public d(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f188235a = controllerContainerCoordinatorLayout;
        this.f188236b = navBarWithToolbar;
        this.f188237c = largeActionButton;
    }

    public static d a(View view) {
        int i = R$id.transferScreenReason_navigationBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
        if (navBarWithToolbar != null) {
            i = R$id.transferScreenReason_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                i = R$id.transferScreenReason_submitButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                if (largeActionButton != null) {
                    return new d(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f188235a;
    }
}
