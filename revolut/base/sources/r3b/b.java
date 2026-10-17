package r3b;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.retail.cfd.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, j2b.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/cfd/impl/databinding/ScreenCfdTradingHomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCfdTradingHome_lineChartNavBarContentView;
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = (AccountSelectionNavBarContentView) ViewBindings.findChildViewById(p0, i);
        if (accountSelectionNavBarContentView != null) {
            i = R$id.screenCfdTradingHome_navBarWithContainer;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.screenCfdTradingHome_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new j2b.b((ControllerContainerCoordinatorLayout) p0, accountSelectionNavBarContentView, navBarWithContainer);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
