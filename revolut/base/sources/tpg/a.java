package tpg;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f273364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f273365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f273366c;
    public final LargeActionButton d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f273364a = controllerContainerCoordinatorLayout;
        this.f273365b = navBarWithAvatar;
        this.f273366c = largeActionButton;
        this.d = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f273364a;
    }
}
