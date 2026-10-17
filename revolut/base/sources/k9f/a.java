package k9f;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f182328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f182329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinHorizontalButton f182330c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithAvatar navBarWithAvatar, TwinHorizontalButton twinHorizontalButton) {
        this.f182328a = controllerContainerCoordinatorLayout;
        this.f182329b = navBarWithAvatar;
        this.f182330c = twinHorizontalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f182328a;
    }
}
