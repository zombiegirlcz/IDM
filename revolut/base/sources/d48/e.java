package d48;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f111253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f111254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f111255c;

    public e(LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f111253a = controllerContainerCoordinatorLayout;
        this.f111254b = largeActionButton;
        this.f111255c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f111253a;
    }
}
