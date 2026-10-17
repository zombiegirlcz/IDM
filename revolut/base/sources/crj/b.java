package crj;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f108392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f108393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f108394c;
    public final ScreenContentRecyclerView d;
    public final SlidingFromTopViewContainer e;
    public final LargeActionButton f;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, RecyclerView recyclerView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, SlidingFromTopViewContainer slidingFromTopViewContainer, LargeActionButton largeActionButton) {
        this.f108392a = controllerContainerCoordinatorLayout;
        this.f108393b = recyclerView;
        this.f108394c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
        this.e = slidingFromTopViewContainer;
        this.f = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f108392a;
    }
}
