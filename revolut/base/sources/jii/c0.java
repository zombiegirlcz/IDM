package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f174504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f174505c;
    public final ScreenContentRecyclerView d;

    public c0(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174503a = controllerContainerCoordinatorLayout;
        this.f174504b = actionFooterView;
        this.f174505c = navBarWithBigTile;
        this.d = screenContentRecyclerView;
    }

    public static c0 a(View view) {
        int i = R$id.screenRecyclerNavBarWithBigTileActionFooter_actionFooterView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(view, i);
        if (actionFooterView != null) {
            i = R$id.screenRecyclerNavBarWithBigTileActionFooter_navBarWithBigTile;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(view, i);
            if (navBarWithBigTile != null) {
                i = R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new c0((ControllerContainerCoordinatorLayout) view, actionFooterView, navBarWithBigTile, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174503a;
    }
}
