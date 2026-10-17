package s0k;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.marketnews.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, j0k.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/marketnews/impl/databinding/FlowWealthNewsOverviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.flowWealthNewsOverview_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.flowWealthNewsOverview_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.flowWealthNewsOverview_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    return new j0k.b((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, tabs);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
