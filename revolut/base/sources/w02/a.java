package w02;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f293617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f293618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f293619c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f293617a = controllerContainerCoordinatorLayout;
        this.f293618b = animatedBackgroundView;
        this.f293619c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    public static a a(View view) {
        int i = R$id.apmArea_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(view, i);
        if (animatedBackgroundView != null) {
            i = R$id.apmArea_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.apmArea_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new a((ControllerContainerCoordinatorLayout) view, animatedBackgroundView, navBarWithToolbar, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293617a;
    }
}
