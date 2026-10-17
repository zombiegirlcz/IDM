package wej;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.esim.impl.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f296796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f296797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f296798c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f296796a = controllerContainerCoordinatorLayout;
        this.f296797b = collapsingActionButton;
        this.f296798c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    public static a a(View view) {
        int i = R$id.screenEsimCheckout_collapsingGoToButton;
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) ViewBindings.findChildViewById(view, i);
        if (collapsingActionButton != null) {
            i = R$id.screenEsimCheckout_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenEsimCheckout_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new a((ControllerContainerCoordinatorLayout) view, collapsingActionButton, navBarWithToolbar, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296796a;
    }
}
