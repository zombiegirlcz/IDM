package sv2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f265827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarBottomSheet f265828b;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarBottomSheet navBarBottomSheet) {
        this.f265827a = controllerContainerCoordinatorLayout;
        this.f265828b = navBarBottomSheet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f265827a;
    }
}
