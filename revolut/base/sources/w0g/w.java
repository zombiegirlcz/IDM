package w0g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f293747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f293748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarBottomSheet f293749c;

    public w(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarBottomSheet navBarBottomSheet) {
        this.f293747a = controllerContainerCoordinatorLayout;
        this.f293748b = largeActionButton;
        this.f293749c = navBarBottomSheet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293747a;
    }
}
