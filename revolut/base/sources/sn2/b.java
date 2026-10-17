package sn2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f264477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f264478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarBottomSheet f264479c;
    public final LargeActionButton d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarBottomSheet navBarBottomSheet, LargeActionButton largeActionButton2) {
        this.f264477a = controllerContainerCoordinatorLayout;
        this.f264478b = largeActionButton;
        this.f264479c = navBarBottomSheet;
        this.d = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f264477a;
    }
}
