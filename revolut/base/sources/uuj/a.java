package uuj;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f283238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormsActionButton f283239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs f283240c;
    public final NavBarWithBigTile d;
    public final ScreenContentRecyclerView e;
    public final SlidingFromTopViewContainer f;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FormsActionButton formsActionButton, Tabs tabs, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView, SlidingFromTopViewContainer slidingFromTopViewContainer) {
        this.f283238a = controllerContainerCoordinatorLayout;
        this.f283239b = formsActionButton;
        this.f283240c = tabs;
        this.d = navBarWithBigTile;
        this.e = screenContentRecyclerView;
        this.f = slidingFromTopViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f283238a;
    }
}
