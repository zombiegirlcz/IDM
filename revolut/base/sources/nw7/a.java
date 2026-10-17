package nw7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f219786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f219787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f219788c;
    public final NavBarWithBigTile d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile) {
        this.f219786a = controllerContainerCoordinatorLayout;
        this.f219787b = animatedBackgroundView;
        this.f219788c = largeActionButton;
        this.d = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f219786a;
    }
}
