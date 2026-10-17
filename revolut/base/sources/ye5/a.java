package ye5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f312768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithBigTile f312769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainerHeaderView f312770c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithBigTile navBarWithBigTile, NavBarWithContainerHeaderView navBarWithContainerHeaderView) {
        this.f312768a = controllerContainerCoordinatorLayout;
        this.f312769b = navBarWithBigTile;
        this.f312770c = navBarWithContainerHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f312768a;
    }
}
