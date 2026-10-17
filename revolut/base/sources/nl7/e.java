package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f217056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterActionButtonView f217057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f217058c;
    public final ScreenContentRecyclerView d;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterActionButtonView footerActionButtonView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f217056a = controllerContainerCoordinatorLayout;
        this.f217057b = footerActionButtonView;
        this.f217058c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    public static e a(View view) {
        int i = R$id.buttonWithFooter_button;
        FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(view, i);
        if (footerActionButtonView != null) {
            i = R$id.buttonWithFooter_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.buttonWithFooter_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new e((ControllerContainerCoordinatorLayout) view, footerActionButtonView, navBarWithToolbar, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217056a;
    }
}
