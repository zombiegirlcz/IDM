package i3e;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.store.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, h2e.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/store/impl/databinding/FlowStoreHomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.storeHome_floatingBottomBarView;
        FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) ViewBindings.findChildViewById(p0, i);
        if (floatingBottomBarView != null) {
            i = R$id.storeHome_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.storeHome_pager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                if (viewPager2 != null) {
                    return new h2e.b(controllerContainerCoordinatorLayout, floatingBottomBarView, navBarWithToolbar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
