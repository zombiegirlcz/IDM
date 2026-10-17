package l4g;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, c4g.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsHomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelFlightsHome_floatingBottomBar;
        FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) ViewBindings.findChildViewById(p0, i);
        if (floatingBottomBarView != null) {
            i = R$id.travelFlightsHome_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.travelFlightsHome_viewPager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new c4g.g((ControllerContainerCoordinatorLayout) p0, floatingBottomBarView, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
