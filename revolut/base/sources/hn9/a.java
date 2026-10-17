package hn9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f154074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f154075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f154076c;

    public a(LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f154074a = controllerContainerCoordinatorLayout;
        this.f154075b = navBarWithAvatar;
        this.f154076c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f154074a;
    }
}
