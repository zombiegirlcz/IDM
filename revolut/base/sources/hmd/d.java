package hmd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f153681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithBigTile f153682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f153683c;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f153681a = controllerContainerCoordinatorLayout;
        this.f153682b = navBarWithBigTile;
        this.f153683c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f153681a;
    }
}
