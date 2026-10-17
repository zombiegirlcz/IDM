package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarLargeCentred f174576b;

    public y(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarLargeCentred navBarLargeCentred) {
        this.f174575a = controllerContainerCoordinatorLayout;
        this.f174576b = navBarLargeCentred;
    }

    public static y a(View view) {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) view;
        int i = R$id.screenRecyclerNavBarLargeCentred_navBarLargeCentred;
        NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(view, i);
        if (navBarLargeCentred != null) {
            i = R$id.screenRecyclerNavBarLargeCentred_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                return new y(controllerContainerCoordinatorLayout, navBarLargeCentred);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174575a;
    }
}
