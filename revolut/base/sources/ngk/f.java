package ngk;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f215194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f215195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionFooterView f215196c;
    public final NavBarLargeCentred d;
    public final ScreenContentRecyclerView e;

    public f(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, AnimatedBackgroundView animatedBackgroundView, ActionFooterView actionFooterView, NavBarLargeCentred navBarLargeCentred, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f215194a = controllerContainerCoordinatorLayout;
        this.f215195b = animatedBackgroundView;
        this.f215196c = actionFooterView;
        this.d = navBarLargeCentred;
        this.e = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215194a;
    }
}
