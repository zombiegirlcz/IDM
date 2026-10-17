package u1c;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f276385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f276386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f276387c;
    public final NavBarWithToolbar d;

    public a(LargeActionButton largeActionButton, LargeActionButton largeActionButton2, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f276385a = controllerContainerCoordinatorLayout;
        this.f276386b = largeActionButton;
        this.f276387c = largeActionButton2;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f276385a;
    }
}
