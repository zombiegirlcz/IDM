package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f174554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f174555c;

    public r(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterTextView footerTextView, NavBarWithToolbar navBarWithToolbar) {
        this.f174553a = controllerContainerCoordinatorLayout;
        this.f174554b = footerTextView;
        this.f174555c = navBarWithToolbar;
    }

    public static r a(View view) {
        int i = R$id.footerView;
        FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(view, i);
        if (footerTextView != null) {
            i = R$id.navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new r((ControllerContainerCoordinatorLayout) view, footerTextView, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174553a;
    }
}
