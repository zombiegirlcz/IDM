package l2c;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, u1c.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullMultiplierControllerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.revPointsSpareChangeFullMultiplierControllerScreen_background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.revPointsSpareChangeFullMultiplierControllerScreen_footer;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i2);
            if (actionFooterView != null) {
                i2 = R$id.revPointsSpareChangeFullMultiplierControllerScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    i2 = R$id.revPointsSpareChangeFullMultiplierControllerScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new u1c.e(animatedBackgroundView, actionFooterView, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
