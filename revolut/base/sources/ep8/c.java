package ep8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f128112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f128113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f128114c;

    public c(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f128112a = controllerContainerCoordinatorLayout;
        this.f128113b = largeActionButton;
        this.f128114c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f128112a;
    }
}
