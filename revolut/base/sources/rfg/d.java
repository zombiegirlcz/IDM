package rfg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f253783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f253784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f253785c;

    public d(LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f253783a = controllerContainerCoordinatorLayout;
        this.f253784b = navBarWithAvatar;
        this.f253785c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f253783a;
    }
}
