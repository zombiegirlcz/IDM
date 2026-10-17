package fs2;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.blocked_merchants.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, sr2.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/blocked_merchants/impl/databinding/FlowBlockedPaymentsListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.blockedPaymentsListFlow_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.blockedPaymentsListFlow_tabs;
            DraggableTabsView draggableTabsView = (DraggableTabsView) ViewBindings.findChildViewById(p0, i);
            if (draggableTabsView != null) {
                i = R$id.blockedPaymentsListFlow_viewPager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new sr2.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, draggableTabsView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
