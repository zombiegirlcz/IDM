package d48;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f111245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f111246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f111247c;

    public b(TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f111245a = controllerContainerCoordinatorLayout;
        this.f111246b = navBarWithToolbar;
        this.f111247c = twinVerticalButton;
    }

    public static b a(View view) {
        int i = R$id.consentScreen_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
        if (navBarWithToolbar != null) {
            i = R$id.consentScreen_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                i = R$id.consentScreen_twinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(view, i);
                if (twinVerticalButton != null) {
                    return new b(twinVerticalButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f111245a;
    }
}
