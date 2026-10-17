package zn9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f323685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithBigTile f323686b;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithBigTile navBarWithBigTile) {
        this.f323685a = controllerContainerCoordinatorLayout;
        this.f323686b = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f323685a;
    }
}
