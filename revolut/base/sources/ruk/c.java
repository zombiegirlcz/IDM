package ruk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.stockdetails.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, nrk.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/stockdetails/impl/databinding/ScreenAnalystDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.analystDetails_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.analystDetails_tabs;
            Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i2);
            if (tabs != null) {
                i2 = R$id.analystDetails_viewPager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i2);
                if (viewPager2 != null) {
                    return new nrk.c(viewPager2, tabs, navBarWithToolbar, controllerContainerCoordinatorLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
