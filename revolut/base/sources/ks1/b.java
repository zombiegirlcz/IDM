package ks1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bizum.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f189089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f189090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f189091c;

    public b(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f189089a = controllerContainerCoordinatorLayout;
        this.f189090b = largeActionButton;
        this.f189091c = navBarWithToolbar;
    }

    public static b a(View view) {
        int i = R$id.bizumRegistration_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.bizumRegistration_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.bizumRegistration_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new b(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f189089a;
    }
}
