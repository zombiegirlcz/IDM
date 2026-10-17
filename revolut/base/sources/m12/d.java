package m12;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f201198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f201199b;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar) {
        this.f201198a = controllerContainerCoordinatorLayout;
        this.f201199b = navBarWithToolbar;
    }

    public static d a(View view) {
        int i = R$id.apmTransactionList_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
        if (navBarWithToolbar != null) {
            i = R$id.apmTransactionList_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                return new d((ControllerContainerCoordinatorLayout) view, navBarWithToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f201198a;
    }
}
