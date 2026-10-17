package lve;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f200368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f200369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f200370c;

    public d(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f200368a = controllerContainerCoordinatorLayout;
        this.f200369b = basicNavBar;
        this.f200370c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f200368a;
    }
}
