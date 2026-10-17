package rac;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f252810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f252811b;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar) {
        this.f252810a = controllerContainerCoordinatorLayout;
        this.f252811b = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f252810a;
    }
}
