package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarBottomSheet f174548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f174549c;
    public final TwinVerticalButton d;

    public p(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarBottomSheet navBarBottomSheet, ScreenContentRecyclerView screenContentRecyclerView, TwinVerticalButton twinVerticalButton) {
        this.f174547a = controllerContainerCoordinatorLayout;
        this.f174548b = navBarBottomSheet;
        this.f174549c = screenContentRecyclerView;
        this.d = twinVerticalButton;
    }

    public static p a(View view) {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) view;
        int i = R$id.navBarBottomSheet_NavBar;
        NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(view, i);
        if (navBarBottomSheet != null) {
            i = R$id.navBarBottomSheet_RecyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
            if (screenContentRecyclerView != null) {
                i = R$id.navBarBottomSheet_TwinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(view, i);
                if (twinVerticalButton != null) {
                    return new p(controllerContainerCoordinatorLayout, navBarBottomSheet, screenContentRecyclerView, twinVerticalButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174547a;
    }
}
