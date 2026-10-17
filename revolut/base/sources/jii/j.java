package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f174530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f174531c;

    public j(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174529a = controllerContainerCoordinatorLayout;
        this.f174530b = basicNavBar;
        this.f174531c = screenContentRecyclerView;
    }

    public static j a(View view) {
        int i = R$id.basicNavbar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(view, i);
        if (basicNavBar != null) {
            i = R$id.recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
            if (screenContentRecyclerView != null) {
                return new j((ControllerContainerCoordinatorLayout) view, basicNavBar, screenContentRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174529a;
    }
}
