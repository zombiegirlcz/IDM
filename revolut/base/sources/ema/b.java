package ema;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f127639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarLargeCentred f127640b;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarLargeCentred navBarLargeCentred) {
        this.f127639a = controllerContainerCoordinatorLayout;
        this.f127640b = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f127639a;
    }
}
