package pwb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.giftcards.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, fwb.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/giftcards/impl/databinding/FlowRevPointsGiftcardsHomePagerFlowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.revPointsGiftcardsHomePagerFlow_floatingBottomBarView;
        FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) ViewBindings.findChildViewById(p0, i);
        if (floatingBottomBarView != null) {
            i = R$id.revPointsGiftcardsHomePagerFlow_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.revPointsGiftcardsHomePagerFlow_pager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new fwb.a(controllerContainerCoordinatorLayout, floatingBottomBarView, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
