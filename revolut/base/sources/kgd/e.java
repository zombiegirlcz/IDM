package kgd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f183960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f183961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f183962c;
    public final ScreenContentRecyclerView d;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, BasicNavBar basicNavBar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f183960a = controllerContainerCoordinatorLayout;
        this.f183961b = largeActionButton;
        this.f183962c = basicNavBar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f183960a;
    }
}
