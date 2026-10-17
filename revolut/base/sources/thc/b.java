package thc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f271359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f271360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarLargeCentred f271361c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarLargeCentred navBarLargeCentred) {
        this.f271359a = controllerContainerCoordinatorLayout;
        this.f271360b = largeActionButton;
        this.f271361c = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f271359a;
    }
}
