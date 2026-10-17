package q3a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f241915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountsNavBarContentView f241916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f241917c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AccountsNavBarContentView accountsNavBarContentView, NavBarWithContainer navBarWithContainer, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f241915a = controllerContainerCoordinatorLayout;
        this.f241916b = accountsNavBarContentView;
        this.f241917c = navBarWithContainer;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f241915a;
    }
}
