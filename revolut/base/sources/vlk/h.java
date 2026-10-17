package vlk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, ngk.f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanContextualSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.planContextualSelection_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            i = R$id.planContextualSelection_footer;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                i = R$id.planContextualSelection_navBar;
                NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
                if (navBarLargeCentred != null) {
                    i = R$id.planContextualSelection_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        return new ngk.f((ControllerContainerCoordinatorLayout) p0, animatedBackgroundView, actionFooterView, navBarLargeCentred, screenContentRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
