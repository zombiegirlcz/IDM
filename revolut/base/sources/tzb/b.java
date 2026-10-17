package tzb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, wxb.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsPersonalisationTargetingOnboardingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.revPointsPersonalisationTargetingOnboardingScreen_button;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.revPointsPersonalisationTargetingOnboardingScreen_navBar;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i2);
            if (navBarWithBigTile != null) {
                i2 = R$id.revPointsPersonalisationTargetingOnboardingScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                    return new wxb.g(controllerContainerCoordinatorLayout, actionFooterView, navBarWithBigTile);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
