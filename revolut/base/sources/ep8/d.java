package ep8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f128115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f128116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f128117c;

    public d(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f128115a = controllerContainerCoordinatorLayout;
        this.f128116b = basicNavBar;
        this.f128117c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f128115a;
    }
}
