package lk7;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.insurance.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, cj7.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/insurance/impl/databinding/ScreenCfacInsuranceDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCFACInsuranceDetails_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.screenCFACInsuranceDetails_navBarWithBigTile;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i2);
            if (navBarWithBigTile != null) {
                i2 = R$id.screenCFACInsuranceDetails_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                    return new cj7.a(largeActionButton, navBarWithBigTile, controllerContainerCoordinatorLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
