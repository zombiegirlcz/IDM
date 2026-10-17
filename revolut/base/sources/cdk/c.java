package cdk;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.TitleView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f23272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f23273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VideoBackgroundView f23274c;
    public final LinearLayout d;
    public final FullScreenStateView e;
    public final BasicNavBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimatedBackgroundView f23275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TitleView f23276h;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, VideoBackgroundView videoBackgroundView, LinearLayout linearLayout, FullScreenStateView fullScreenStateView, BasicNavBar basicNavBar, AnimatedBackgroundView animatedBackgroundView, TitleView titleView) {
        this.f23272a = controllerContainerCoordinatorLayout;
        this.f23273b = actionFooterView;
        this.f23274c = videoBackgroundView;
        this.d = linearLayout;
        this.e = fullScreenStateView;
        this.f = basicNavBar;
        this.f23275g = animatedBackgroundView;
        this.f23276h = titleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f23272a;
    }
}
