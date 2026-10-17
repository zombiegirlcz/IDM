package crj;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f108395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f108396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f108397c;

    public c(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f108395a = controllerContainerCoordinatorLayout;
        this.f108396b = largeActionButton;
        this.f108397c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f108395a;
    }
}
