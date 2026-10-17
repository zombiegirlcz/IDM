package aw3;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f10680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f10681c;
    public final NavBarLargeCentred d;

    public e(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, FrameLayout frameLayout, NavBarLargeCentred navBarLargeCentred) {
        this.f10679a = controllerContainerCoordinatorLayout;
        this.f10680b = largeActionButton;
        this.f10681c = frameLayout;
        this.d = navBarLargeCentred;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10679a;
    }
}
