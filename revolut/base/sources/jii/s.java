package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f174557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f174558c;
    public final ScreenContentRecyclerView d;
    public final NavBarWithToolbar e;

    public s(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, FooterTextView footerTextView, ScreenContentRecyclerView screenContentRecyclerView, NavBarWithToolbar navBarWithToolbar) {
        this.f174556a = controllerContainerCoordinatorLayout;
        this.f174557b = largeActionButton;
        this.f174558c = footerTextView;
        this.d = screenContentRecyclerView;
        this.e = navBarWithToolbar;
    }

    public static s a(View view) {
        int i = R$id.screenRecyclerNavbarFooterNextbutton_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.screenRecyclerNavbarFooterNextbutton_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(view, i);
            if (footerTextView != null) {
                i = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.screenRecyclerNavbarFooterNextbutton_toolbar;
                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
                    if (navBarWithToolbar != null) {
                        return new s((ControllerContainerCoordinatorLayout) view, largeActionButton, footerTextView, screenContentRecyclerView, navBarWithToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174556a;
    }
}
