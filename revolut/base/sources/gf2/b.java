package gf2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f143334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f143335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f143336c;

    public b(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f143334a = controllerContainerCoordinatorLayout;
        this.f143335b = largeActionButton;
        this.f143336c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f143334a;
    }
}
