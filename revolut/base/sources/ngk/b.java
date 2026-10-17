package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f215183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f215184c;
    public final FooterTextView d;
    public final NavBarWithBigTile e;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, LargeActionButton largeActionButton, FooterTextView footerTextView, NavBarWithBigTile navBarWithBigTile) {
        this.f215182a = controllerContainerCoordinatorLayout;
        this.f215183b = animatedBackgroundView;
        this.f215184c = largeActionButton;
        this.d = footerTextView;
        this.e = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215182a;
    }
}
