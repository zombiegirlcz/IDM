package tle;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarContentViewSwitcher;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f272052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmallActionButton f272053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarContentViewSwitcher f272054c;
    public final NavBarWithContainer d;
    public final AccountsNavBarContentView e;
    public final ScreenContentRecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScrollerNavBarContentView f272055g;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, SmallActionButton smallActionButton, NavBarContentViewSwitcher navBarContentViewSwitcher, NavBarWithContainer navBarWithContainer, AccountsNavBarContentView accountsNavBarContentView, ScreenContentRecyclerView screenContentRecyclerView, ScrollerNavBarContentView scrollerNavBarContentView) {
        this.f272052a = controllerContainerCoordinatorLayout;
        this.f272053b = smallActionButton;
        this.f272054c = navBarContentViewSwitcher;
        this.d = navBarWithContainer;
        this.e = accountsNavBarContentView;
        this.f = screenContentRecyclerView;
        this.f272055g = scrollerNavBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f272052a;
    }
}
