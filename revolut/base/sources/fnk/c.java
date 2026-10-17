package fnk;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, ngk.k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanPreviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.planPreviewScreen_actionFooter;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.planPreviewScreen_navBarWithBigTile;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i2);
            if (navBarWithBigTile != null) {
                i2 = R$id.planPreviewScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                    return new ngk.k(controllerContainerCoordinatorLayout, actionFooterView, navBarWithBigTile);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
