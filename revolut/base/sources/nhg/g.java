package nhg;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function1 {
    public static final g f = new g();

    public g() {
        super(1, rfg.o.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightSearchResultsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.travelMilesFlightSearchResultsScreen_navBarWithToolbar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.travelMilesFlightSearchResultsScreen_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.travelMilesFlightSearchResultsScreen_searchFieldsInputView;
                InputTravelSearchView inputTravelSearchView = (InputTravelSearchView) ViewBindings.findChildViewById(p0, i);
                if (inputTravelSearchView != null) {
                    i = R$id.travelMilesFlightSearchResultsScreen_searchInputView;
                    InputTravelSearchItemView inputTravelSearchItemView = (InputTravelSearchItemView) ViewBindings.findChildViewById(p0, i);
                    if (inputTravelSearchItemView != null) {
                        i = R$id.travelMilesFlightSearchResultsScreen_searchInputsContainer;
                        if (((FrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new rfg.o(controllerContainerCoordinatorLayout, basicNavBar, screenContentRecyclerView, inputTravelSearchView, inputTravelSearchItemView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
