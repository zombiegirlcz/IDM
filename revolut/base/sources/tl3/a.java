package tl3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.contacts.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f271997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f271998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f271999c;

    public a(LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f271997a = controllerContainerCoordinatorLayout;
        this.f271998b = largeActionButton;
        this.f271999c = navBarWithToolbar;
    }

    public static a a(View view) {
        int i = R$id.addContact_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.addContact_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
            if (navBarWithToolbar != null) {
                i = R$id.addContact_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new a(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f271997a;
    }
}
