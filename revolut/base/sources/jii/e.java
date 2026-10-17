package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f174513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarBottomSheet f174514c;
    public final ScreenContentRecyclerView d;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarBottomSheet navBarBottomSheet, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174512a = controllerContainerCoordinatorLayout;
        this.f174513b = actionFooterView;
        this.f174514c = navBarBottomSheet;
        this.d = screenContentRecyclerView;
    }

    public static e a(View view) {
        int i = R$id.bottomSheetControllerBase_footerView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(view, i);
        if (actionFooterView != null) {
            i = R$id.bottomSheetControllerBase_navBar;
            NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(view, i);
            if (navBarBottomSheet != null) {
                i = R$id.bottomSheetControllerBase_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new e((ControllerContainerCoordinatorLayout) view, actionFooterView, navBarBottomSheet, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174512a;
    }
}
