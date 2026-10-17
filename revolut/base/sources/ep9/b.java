package ep9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f128121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f128122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f128123c;

    public b(LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f128121a = controllerContainerCoordinatorLayout;
        this.f128122b = largeActionButton;
        this.f128123c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f128121a;
    }
}
