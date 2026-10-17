package ye5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BackgroundContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f312771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackgroundContentView f312772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f312773c;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BackgroundContentView backgroundContentView, NavBarWithContainer navBarWithContainer) {
        this.f312771a = controllerContainerCoordinatorLayout;
        this.f312772b = backgroundContentView;
        this.f312773c = navBarWithContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f312771a;
    }
}
