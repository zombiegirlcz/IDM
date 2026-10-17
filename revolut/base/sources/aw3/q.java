package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerLinearLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyContentContainerLinearLayout f10717c;
    public final NavBarWithBigTile d;
    public final LargeActionButton e;

    public q(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, LegacyContentContainerLinearLayout legacyContentContainerLinearLayout, NavBarWithBigTile navBarWithBigTile, LargeActionButton largeActionButton2) {
        this.f10715a = controllerContainerCoordinatorLayout;
        this.f10716b = largeActionButton;
        this.f10717c = legacyContentContainerLinearLayout;
        this.d = navBarWithBigTile;
        this.e = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10715a;
    }
}
