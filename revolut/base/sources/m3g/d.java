package m3g;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, w0g.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesSearchResultsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.experiencesSearchResults_dates;
        InputTravelSearchItemView inputTravelSearchItemView = (InputTravelSearchItemView) ViewBindings.findChildViewById(p0, i);
        if (inputTravelSearchItemView != null) {
            i = R$id.experiencesSearchResults_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.experiencesSearchResults_quickFiltersActions;
                ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
                if (actionsView != null) {
                    i = R$id.experiencesSearchResults_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.experiencesSearchResults_searchInputView;
                        InputTravelSearchItemView inputTravelSearchItemView2 = (InputTravelSearchItemView) ViewBindings.findChildViewById(p0, i);
                        if (inputTravelSearchItemView2 != null) {
                            i = R$id.experiencesSearchResults_slidingContainer;
                            SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                            if (slidingFromTopViewContainer != null) {
                                i = R$id.experiencesSearchResults_slidingContainerFilters;
                                SlidingFromTopViewContainer slidingFromTopViewContainer2 = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                                if (slidingFromTopViewContainer2 != null) {
                                    return new w0g.m((ControllerContainerCoordinatorLayout) p0, inputTravelSearchItemView, navBarWithToolbar, actionsView, inputTravelSearchItemView2, slidingFromTopViewContainer, slidingFromTopViewContainer2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
