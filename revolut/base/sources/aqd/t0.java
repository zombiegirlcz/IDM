package aqd;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.q implements Function1 {
    public static final t0 f = new t0();

    public t0() {
        super(1, hmd.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/spending_analytics/impl/databinding/ControllerIncomeSorterDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.controllerIncomeSorterDetails_footerButtons;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.controllerIncomeSorterDetails_navBar;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.controllerIncomeSorterDetails_navBarContentView;
                HeaderWithGaugeBarContentView headerWithGaugeBarContentView = (HeaderWithGaugeBarContentView) ViewBindings.findChildViewById(p0, i);
                if (headerWithGaugeBarContentView != null) {
                    i = R$id.controllerIncomeSorterDetails_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new hmd.c((ControllerContainerCoordinatorLayout) p0, actionFooterView, navBarWithContainer, headerWithGaugeBarContentView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
