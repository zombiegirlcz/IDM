package iu7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f168524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f168525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f168526c;

    public a(LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f168524a = controllerContainerCoordinatorLayout;
        this.f168525b = largeActionButton;
        this.f168526c = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f168524a;
    }
}
