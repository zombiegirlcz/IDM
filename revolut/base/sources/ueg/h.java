package ueg;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, c9g.w.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsSearchResultsMapBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelHotelsSearchResultsMapScreen_backgroundView;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
        if (frameLayout != null) {
            i = R$id.travelHotelsSearchResultsMapScreen_coordinatorLayout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(p0, i);
            if (coordinatorLayout != null) {
                i = R$id.travelHotelsSearchResultsMapScreen_dates;
                InputTravelView inputTravelView = (InputTravelView) ViewBindings.findChildViewById(p0, i);
                if (inputTravelView != null) {
                    i = R$id.travelHotelsSearchResultsMapScreen_expandableDialogContainer;
                    BottomExpandableDialogView bottomExpandableDialogView = (BottomExpandableDialogView) ViewBindings.findChildViewById(p0, i);
                    if (bottomExpandableDialogView != null) {
                        i = R$id.travelHotelsSearchResultsMapScreen_formsActionButton;
                        FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
                        if (formsActionButton != null) {
                            i = R$id.travelHotelsSearchResultsMapScreen_guideline;
                            if (((Guideline) ViewBindings.findChildViewById(p0, i)) != null) {
                                i = R$id.travelHotelsSearchResultsMapScreen_inputTravelSearchDatesGuestsContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(p0, i);
                                if (constraintLayout != null) {
                                    i = R$id.travelHotelsSearchResultsMapScreen_map;
                                    MapView mapView = (MapView) ViewBindings.findChildViewById(p0, i);
                                    if (mapView != null) {
                                        i = R$id.travelHotelsSearchResultsMapScreen_mapRecyclerView;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(p0, i);
                                        if (recyclerView != null) {
                                            i = R$id.travelHotelsSearchResultsMapScreen_quickFiltersActions;
                                            ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
                                            if (actionsView != null) {
                                                ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                                                i = R$id.travelHotelsSearchResultsMapScreen_searchButton;
                                                SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                                if (smallActionButton != null) {
                                                    i = R$id.travelHotelsSearchResultsMapScreen_searchInputView;
                                                    InputTravelView inputTravelView2 = (InputTravelView) ViewBindings.findChildViewById(p0, i);
                                                    if (inputTravelView2 != null) {
                                                        i = R$id.travelHotelsSearchResultsMapScreen_toolbar;
                                                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                                                        if (basicNavBar != null) {
                                                            i = R$id.travelHotelsSearchResultsMapScreen_visitors;
                                                            InputTravelView inputTravelView3 = (InputTravelView) ViewBindings.findChildViewById(p0, i);
                                                            if (inputTravelView3 != null) {
                                                                return new c9g.w(controllerContainerConstraintLayout, frameLayout, coordinatorLayout, inputTravelView, bottomExpandableDialogView, formsActionButton, constraintLayout, mapView, recyclerView, actionsView, smallActionButton, inputTravelView2, basicNavBar, inputTravelView3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
