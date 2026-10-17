package t6g;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import c4g.n;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsPostBookingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelFlightsPostBookingScreen_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.travelFlightsPostBookingScreen_pager;
            if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.travelFlightsPostBookingScreen_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    return new n((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, tabs);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
