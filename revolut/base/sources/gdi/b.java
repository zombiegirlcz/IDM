package gdi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f143185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObjectCarouselNavBarContentView f143186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f143187c;
    public final NavBarWithContainer d;
    public final LargeActionButton e;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ObjectCarouselNavBarContentView objectCarouselNavBarContentView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout2, NavBarWithContainer navBarWithContainer, LargeActionButton largeActionButton) {
        this.f143185a = controllerContainerCoordinatorLayout;
        this.f143186b = objectCarouselNavBarContentView;
        this.f143187c = controllerContainerCoordinatorLayout2;
        this.d = navBarWithContainer;
        this.e = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f143185a;
    }
}
