package c4g;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f21243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f21244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f21245c;
    public final ActionsView d;
    public final ScreenContentRecyclerView e;
    public final InputTravelSearchView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InputTravelSearchItemView f21246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f21247h;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, BasicNavBar basicNavBar, ActionsView actionsView, ScreenContentRecyclerView screenContentRecyclerView, InputTravelSearchView inputTravelSearchView, InputTravelSearchItemView inputTravelSearchItemView, FrameLayout frameLayout) {
        this.f21243a = controllerContainerCoordinatorLayout;
        this.f21244b = controllerContainerCoordinatorLayout2;
        this.f21245c = basicNavBar;
        this.d = actionsView;
        this.e = screenContentRecyclerView;
        this.f = inputTravelSearchView;
        this.f21246g = inputTravelSearchItemView;
        this.f21247h = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21243a;
    }
}
