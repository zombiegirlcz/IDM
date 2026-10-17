package p6e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f233252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f233253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarVaults f233254c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarVaults navBarVaults) {
        this.f233252a = controllerContainerCoordinatorLayout;
        this.f233253b = largeActionButton;
        this.f233254c = navBarVaults;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f233252a;
    }
}
