package lv1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f200274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f200275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f200276c;

    public b(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f200274a = controllerContainerCoordinatorLayout;
        this.f200275b = largeActionButton;
        this.f200276c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f200274a;
    }
}
