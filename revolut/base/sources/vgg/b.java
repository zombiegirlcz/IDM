package vgg;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, rfg.f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesAirlineDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelMilesAirlineDetails_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.travelMilesAirlineDetails_navBarWithBigTile;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i2);
            if (navBarWithBigTile != null) {
                i2 = R$id.travelMilesAirlineDetails_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                    return new rfg.f(largeActionButton, navBarWithBigTile, controllerContainerCoordinatorLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
