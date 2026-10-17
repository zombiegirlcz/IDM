package hge;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f152169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountsNavBarContentView f152170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f152171c;
    public final NavBarWithContainer d;
    public final ScreenContentRecyclerView e;
    public final SmallActionButton f;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AccountsNavBarContentView accountsNavBarContentView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, NavBarWithContainer navBarWithContainer, ScreenContentRecyclerView screenContentRecyclerView, SmallActionButton smallActionButton) {
        this.f152169a = controllerContainerCoordinatorLayout;
        this.f152170b = accountsNavBarContentView;
        this.f152171c = controllerContainerCoordinatorLayout2;
        this.d = navBarWithContainer;
        this.e = screenContentRecyclerView;
        this.f = smallActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f152169a;
    }
}
