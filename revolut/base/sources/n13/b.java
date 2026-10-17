package n13;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f211225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncDiffRecyclerView f211226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardPersonalisationView f211227c;
    public final NavBarWithToolbar d;
    public final TwinVerticalButton e;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AsyncDiffRecyclerView asyncDiffRecyclerView, CardPersonalisationView cardPersonalisationView, NavBarWithToolbar navBarWithToolbar, TwinVerticalButton twinVerticalButton) {
        this.f211225a = controllerContainerCoordinatorLayout;
        this.f211226b = asyncDiffRecyclerView;
        this.f211227c = cardPersonalisationView;
        this.d = navBarWithToolbar;
        this.e = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f211225a;
    }
}
