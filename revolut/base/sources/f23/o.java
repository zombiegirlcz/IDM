package f23;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function1 {
    public static final o f = new o();

    public o() {
        super(1, n13.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_order_new/impl/databinding/ControllerOrderNewCardFlowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.orderNewCardFlowNavBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.orderNewCardFlowPager;
            if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.orderNewCardFlowTabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    return new n13.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, tabs);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
