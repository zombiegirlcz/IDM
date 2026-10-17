package csj;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.impl.budgeting.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, crj.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/impl/budgeting/databinding/ScreenSetCategoryBudgetsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.setCategoryBudgets_headerRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(p0, i);
        if (recyclerView != null) {
            i = R$id.setCategoryBudgets_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.setCategoryBudgets_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.setCategoryBudgets_slidingContainer;
                    SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                    if (slidingFromTopViewContainer != null) {
                        i = R$id.setOverallBudgetScreen_goToButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            return new crj.b((ControllerContainerCoordinatorLayout) p0, recyclerView, navBarWithToolbar, screenContentRecyclerView, slidingFromTopViewContainer, largeActionButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
