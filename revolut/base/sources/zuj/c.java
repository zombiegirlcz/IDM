package zuj;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.impl.travel_trips.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, uuj.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/impl/travel_trips/databinding/ScreenTravelItineraryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.travelItineraryScreen_formsActionButton;
        FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
        if (formsActionButton != null) {
            i = R$id.travelItineraryScreen_monthTabs;
            Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
            if (tabs != null) {
                i = R$id.travelItineraryScreen_navBar;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                if (navBarWithBigTile != null) {
                    i = R$id.travelItineraryScreen_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        i = R$id.travelItineraryScreen_slidingContainer;
                        SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                        if (slidingFromTopViewContainer != null) {
                            return new uuj.a(controllerContainerCoordinatorLayout, formsActionButton, tabs, navBarWithBigTile, screenContentRecyclerView, slidingFromTopViewContainer);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
