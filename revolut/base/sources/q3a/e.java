package q3a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BackgroundContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f241927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f241928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackgroundContentView f241929c;
    public final ScreenContentRecyclerView d;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithContainer navBarWithContainer, BackgroundContentView backgroundContentView, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f241927a = controllerContainerCoordinatorLayout;
        this.f241928b = navBarWithContainer;
        this.f241929c = backgroundContentView;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f241927a;
    }
}
