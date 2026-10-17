package ghk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ngk.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/FlowPlanPagerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View viewFindChildViewById;
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.planPagerFlow_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            i = R$id.planPagerFlow_bottomButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                i = R$id.planPagerFlow_footer;
                FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
                if (footerTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(p0, (i = R$id.planPagerFlow_footerBackground))) != null) {
                    i = R$id.planPagerFlow_footerContainer;
                    LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout = (LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i);
                    if (legacyButtonContainerConstraintLayout != null) {
                        i = R$id.planPagerFlow_navBarWithToolbar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithToolbar != null) {
                            i = R$id.planPagerFlow_pager;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                            if (viewPager2 != null) {
                                i = R$id.planPagerFlow_tabs;
                                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                                if (tabs != null) {
                                    i = R$id.planPagerFlow_topButton;
                                    LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                                    if (largeActionButton2 != null) {
                                        return new ngk.a(controllerContainerCoordinatorLayout, animatedBackgroundView, largeActionButton, footerTextView, viewFindChildViewById, legacyButtonContainerConstraintLayout, navBarWithToolbar, viewPager2, tabs, largeActionButton2);
                                    }
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
