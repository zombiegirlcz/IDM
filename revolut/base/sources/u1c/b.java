package u1c;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f276388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f276389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f276390c;
    public final ScreenContentRecyclerView d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f276388a = controllerContainerCoordinatorLayout;
        this.f276389b = actionFooterView;
        this.f276390c = navBarWithBigTile;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f276388a;
    }
}
