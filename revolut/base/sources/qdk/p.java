package qdk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.plan_rewards.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.q implements Function1 {
    public static final p f = new p();

    public p() {
        super(1, cdk.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/plan_rewards/impl/databinding/ScreenMonthlyDrawHubBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.monthlyDrawsScreen_actionFooterView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.monthlyDrawsScreen_background;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.monthlyDrawsScreen_navBarLargeCentred;
                NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
                if (navBarLargeCentred != null) {
                    i = R$id.monthlyDrawsScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new cdk.b((ControllerContainerCoordinatorLayout) p0, actionFooterView, animatedBackgroundView, navBarLargeCentred);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
