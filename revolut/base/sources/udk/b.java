package udk;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.TitleView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.plan_rewards.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, cdk.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/plan_rewards/impl/databinding/ScreenPlanRewardsRevealBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.planRewardsReveal_actionFooter;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.planRewardsReveal_background;
            VideoBackgroundView videoBackgroundView = (VideoBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (videoBackgroundView != null) {
                i = R$id.planRewardsReveal_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                if (linearLayout != null) {
                    i = R$id.planRewardsReveal_errorState;
                    FullScreenStateView fullScreenStateView = (FullScreenStateView) ViewBindings.findChildViewById(p0, i);
                    if (fullScreenStateView != null) {
                        i = R$id.planRewardsReveal_navBar;
                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                        if (basicNavBar != null) {
                            i = R$id.planRewardsReveal_planBackground;
                            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
                            if (animatedBackgroundView != null) {
                                i = R$id.planRewardsReveal_titleView;
                                TitleView titleView = (TitleView) ViewBindings.findChildViewById(p0, i);
                                if (titleView != null) {
                                    return new cdk.c((ControllerContainerCoordinatorLayout) p0, actionFooterView, videoBackgroundView, linearLayout, fullScreenStateView, basicNavBar, animatedBackgroundView, titleView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
