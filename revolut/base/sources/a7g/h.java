package a7g;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, c4g.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenSearchResultsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.travelFlightsSearchResultsScreen_navBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.travelFlightsSearchResultsScreen_quickFiltersActions;
            ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
            if (actionsView != null) {
                i = R$id.travelFlightsSearchResultsScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.travelFlightsSearchResultsScreen_searchFieldsInputView;
                    InputTravelSearchView inputTravelSearchView = (InputTravelSearchView) ViewBindings.findChildViewById(p0, i);
                    if (inputTravelSearchView != null) {
                        i = R$id.travelFlightsSearchResultsScreen_searchInputView;
                        InputTravelSearchItemView inputTravelSearchItemView = (InputTravelSearchItemView) ViewBindings.findChildViewById(p0, i);
                        if (inputTravelSearchItemView != null) {
                            i = R$id.travelFlightsSearchResultsScreen_searchInputsContainer;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                            if (frameLayout != null) {
                                return new c4g.a(controllerContainerCoordinatorLayout, controllerContainerCoordinatorLayout, basicNavBar, actionsView, screenContentRecyclerView, inputTravelSearchView, inputTravelSearchItemView, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
