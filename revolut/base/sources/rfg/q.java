package rfg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f253819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f253820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f253821c;
    public final ScreenContentRecyclerView d;

    public q(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f253819a = controllerContainerCoordinatorLayout;
        this.f253820b = actionFooterView;
        this.f253821c = navBarWithBigTile;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f253819a;
    }
}
