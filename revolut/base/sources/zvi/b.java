package zvi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f325684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormsActionButton f325685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f325686c;
    public final NavBarWithBigTile d;
    public final ScreenContentRecyclerView e;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FormsActionButton formsActionButton, LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f325684a = controllerContainerCoordinatorLayout;
        this.f325685b = formsActionButton;
        this.f325686c = largeActionButton;
        this.d = navBarWithBigTile;
        this.e = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f325684a;
    }
}
