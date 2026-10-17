package xmb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f307106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f307107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarLargeCentred f307108c;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarLargeCentred navBarLargeCentred) {
        this.f307106a = controllerContainerCoordinatorLayout;
        this.f307107b = largeActionButton;
        this.f307108c = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307106a;
    }
}
