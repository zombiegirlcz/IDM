package rfg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f253813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f253814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f253815c;
    public final InputTravelSearchView d;
    public final InputTravelSearchItemView e;

    public o(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, ScreenContentRecyclerView screenContentRecyclerView, InputTravelSearchView inputTravelSearchView, InputTravelSearchItemView inputTravelSearchItemView) {
        this.f253813a = controllerContainerCoordinatorLayout;
        this.f253814b = basicNavBar;
        this.f253815c = screenContentRecyclerView;
        this.d = inputTravelSearchView;
        this.e = inputTravelSearchItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f253813a;
    }
}
