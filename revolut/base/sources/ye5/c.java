package ye5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f312774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f312775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f312776c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithContainer navBarWithContainer, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f312774a = controllerContainerCoordinatorLayout;
        this.f312775b = navBarWithContainer;
        this.f312776c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f312774a;
    }
}
