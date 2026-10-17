package imk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.productintro.view.FullscreenProductIntroView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.q implements Function1 {
    public static final q f = new q();

    public q() {
        super(1, ngk.h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanHubV2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.planHubV2Screen_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            i = R$id.planHubV2Screen_introView;
            FullscreenProductIntroView fullscreenProductIntroView = (FullscreenProductIntroView) ViewBindings.findChildViewById(p0, i);
            if (fullscreenProductIntroView != null) {
                i = R$id.planHubV2Screen_navBarAccountContent;
                AccountSelectionNavBarContentView accountSelectionNavBarContentView = (AccountSelectionNavBarContentView) ViewBindings.findChildViewById(p0, i);
                if (accountSelectionNavBarContentView != null) {
                    i = R$id.planHubV2Screen_navBarWithBigTile;
                    NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithBigTile != null) {
                        i = R$id.planHubV2Screen_navBarWithContainer;
                        NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithContainer != null) {
                            i = R$id.planHubV2Screen_navBarWithToolbar;
                            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                            if (navBarWithToolbar != null) {
                                i = R$id.planHubV2Screen_recyclerView;
                                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                                if (screenContentRecyclerView != null) {
                                    ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                                    return new ngk.h(controllerContainerCoordinatorLayout, animatedBackgroundView, fullscreenProductIntroView, accountSelectionNavBarContentView, navBarWithBigTile, navBarWithContainer, navBarWithToolbar, screenContentRecyclerView, controllerContainerCoordinatorLayout);
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
