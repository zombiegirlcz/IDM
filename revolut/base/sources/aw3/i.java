package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerLinearLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f10692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyContentContainerLinearLayout f10693c;
    public final NavBarWithToolbar d;
    public final LargeActionButton e;

    public i(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, LegacyContentContainerLinearLayout legacyContentContainerLinearLayout, NavBarWithToolbar navBarWithToolbar, LargeActionButton largeActionButton2) {
        this.f10691a = controllerContainerCoordinatorLayout;
        this.f10692b = largeActionButton;
        this.f10693c = legacyContentContainerLinearLayout;
        this.d = navBarWithToolbar;
        this.e = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10691a;
    }
}
