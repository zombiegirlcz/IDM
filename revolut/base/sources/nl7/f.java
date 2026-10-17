package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f217059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f217060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f217061c;

    public f(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarWithToolbar navBarWithToolbar) {
        this.f217059a = controllerContainerCoordinatorLayout;
        this.f217060b = collapsingActionButton;
        this.f217061c = navBarWithToolbar;
    }

    public static f a(View view) {
        int i = R$id.screenCollapsingButton_button;
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) ViewBindings.findChildViewById(view, i);
        if (collapsingActionButton != null) {
            i = R$id.screenCollapsingButton_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenCollapsingButton_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new f((ControllerContainerCoordinatorLayout) view, collapsingActionButton, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217059a;
    }
}
