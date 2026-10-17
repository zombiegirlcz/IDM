package thc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f271364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithBigTile f271365b;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithBigTile navBarWithBigTile) {
        this.f271364a = controllerContainerCoordinatorLayout;
        this.f271365b = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f271364a;
    }
}
