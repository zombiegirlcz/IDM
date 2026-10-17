package thc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f271362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithBigTile f271363b;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithBigTile navBarWithBigTile) {
        this.f271362a = controllerContainerCoordinatorLayout;
        this.f271363b = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f271362a;
    }
}
