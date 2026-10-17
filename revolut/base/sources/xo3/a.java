package xo3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f307588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f307589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f307590c;
    public final ScreenContentRecyclerView d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f307588a = controllerContainerCoordinatorLayout;
        this.f307589b = actionFooterView;
        this.f307590c = navBarWithBigTile;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307588a;
    }
}
