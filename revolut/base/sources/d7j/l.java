package d7j;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.commodity.order_flow.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, p6j.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/commodity/order_flow/impl/databinding/ScreenCommodityOrderEditBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.commodity_order_flow_edit_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.commodity_order_flow_edit_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.footerView;
                ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
                if (actionFooterView != null) {
                    return new p6j.a(actionFooterView, navBarWithToolbar, (ControllerContainerConstraintLayout) p0, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
