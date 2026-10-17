package hge;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f152172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f152173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f152174c;

    public c(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f152172a = controllerContainerCoordinatorLayout;
        this.f152173b = largeActionButton;
        this.f152174c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f152172a;
    }
}
