package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f174521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tabs f174522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f174523c;

    public g(ControllerContainerConstraintLayout controllerContainerConstraintLayout, Tabs tabs, NavBarWithToolbar navBarWithToolbar) {
        this.f174521a = controllerContainerConstraintLayout;
        this.f174522b = tabs;
        this.f174523c = navBarWithToolbar;
    }

    public static g a(View view) {
        int i = R$id.screenNavbarTabsPager_pager;
        if (((ViewPager2) ViewBindings.findChildViewById(view, i)) != null) {
            i = R$id.screenNavbarTabsPager_tabs;
            Tabs tabs = (Tabs) ViewBindings.findChildViewById(view, i);
            if (tabs != null) {
                i = R$id.screenNavbarTabsPager_toolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
                if (navBarWithToolbar != null) {
                    return new g((ControllerContainerConstraintLayout) view, tabs, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174521a;
    }
}
