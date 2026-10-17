package rrj;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.impl.budgeting.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.q implements Function1 {
    public static final p f = new p();

    public p() {
        super(1, crj.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/impl/budgeting/databinding/ScreenCategoryBudgetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCategoryBudget_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.screenCategoryBudget_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                return new crj.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
