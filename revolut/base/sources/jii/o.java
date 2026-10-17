package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f174545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarBottomSheet f174546c;
    public final ScreenContentRecyclerView d;

    public o(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarBottomSheet navBarBottomSheet, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174544a = controllerContainerCoordinatorLayout;
        this.f174545b = largeActionButton;
        this.f174546c = navBarBottomSheet;
        this.d = screenContentRecyclerView;
    }

    public static o a(View view) {
        int i = R$id.navBarBottomSheet_Button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) view;
            int i2 = R$id.navBarBottomSheet_NavBar;
            NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(view, i2);
            if (navBarBottomSheet != null) {
                i2 = R$id.navBarBottomSheet_RecyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i2);
                if (screenContentRecyclerView != null) {
                    return new o(controllerContainerCoordinatorLayout, largeActionButton, navBarBottomSheet, screenContentRecyclerView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174544a;
    }
}
