package f2c;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, u1c.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullBannerGridControllerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.revPointsSpareChangeFullBannerGridControllerScreen_footer;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.revPointsSpareChangeFullBannerGridControllerScreen_navBar;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
            if (navBarWithBigTile != null) {
                i = R$id.revPointsSpareChangeFullBannerGridControllerScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new u1c.b(controllerContainerCoordinatorLayout, actionFooterView, navBarWithBigTile, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
