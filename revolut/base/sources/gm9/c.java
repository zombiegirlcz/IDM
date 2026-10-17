package gm9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f144799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarBottomSheet f144800b;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarBottomSheet navBarBottomSheet) {
        this.f144799a = controllerContainerCoordinatorLayout;
        this.f144800b = navBarBottomSheet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f144799a;
    }
}
