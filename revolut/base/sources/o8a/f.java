package o8a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f222978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f222979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f222980c;

    public f(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f222978a = controllerContainerCoordinatorLayout;
        this.f222979b = largeActionButton;
        this.f222980c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f222978a;
    }
}
