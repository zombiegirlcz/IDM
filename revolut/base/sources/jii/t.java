package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f174560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyContentContainerFrameLayout f174561c;
    public final FooterTextView d;
    public final ScreenContentRecyclerView e;
    public final LargeActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarWithToolbar f174562g;

    public t(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, LegacyContentContainerFrameLayout legacyContentContainerFrameLayout, FooterTextView footerTextView, ScreenContentRecyclerView screenContentRecyclerView, LargeActionButton largeActionButton2, NavBarWithToolbar navBarWithToolbar) {
        this.f174559a = controllerContainerCoordinatorLayout;
        this.f174560b = largeActionButton;
        this.f174561c = legacyContentContainerFrameLayout;
        this.d = footerTextView;
        this.e = screenContentRecyclerView;
        this.f = largeActionButton2;
        this.f174562g = navBarWithToolbar;
    }

    public static t a(View view) {
        int i = R$id.screenRecyclerNavbarFooterTwoButtons_firstButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.screenRecyclerNavbarFooterTwoButtons_footerContainer;
            LegacyContentContainerFrameLayout legacyContentContainerFrameLayout = (LegacyContentContainerFrameLayout) ViewBindings.findChildViewById(view, i);
            if (legacyContentContainerFrameLayout != null) {
                i = R$id.screenRecyclerNavbarFooterTwoButtons_footerView;
                FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(view, i);
                if (footerTextView != null) {
                    i = R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (screenContentRecyclerView != null) {
                        i = R$id.screenRecyclerNavbarFooterTwoButtons_secondButton;
                        LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                        if (largeActionButton2 != null) {
                            i = R$id.screenRecyclerNavbarFooterTwoButtons_toolbar;
                            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
                            if (navBarWithToolbar != null) {
                                return new t((ControllerContainerCoordinatorLayout) view, largeActionButton, legacyContentContainerFrameLayout, footerTextView, screenContentRecyclerView, largeActionButton2, navBarWithToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174559a;
    }
}
