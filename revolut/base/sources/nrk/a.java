package nrk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.stockdetails.impl.R$id;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f218660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinHorizontalButton f218661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f218662c;
    public final Tabs d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, TwinHorizontalButton twinHorizontalButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs) {
        this.f218660a = controllerContainerCoordinatorLayout;
        this.f218661b = twinHorizontalButton;
        this.f218662c = navBarWithToolbar;
        this.d = tabs;
    }

    public static a a(View view) {
        int i = R$id.flowStockDetails_buySellPanel;
        TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) ViewBindings.findChildViewById(view, i);
        if (twinHorizontalButton != null) {
            i = R$id.flowStockDetails_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.flowStockDetails_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(view, i);
                if (tabs != null) {
                    i = R$id.flowStockDetails_viewPager;
                    if (((ViewPager2) ViewBindings.findChildViewById(view, i)) != null) {
                        return new a((ControllerContainerCoordinatorLayout) view, twinHorizontalButton, navBarWithToolbar, tabs);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f218660a;
    }
}
