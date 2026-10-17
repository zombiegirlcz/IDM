package oc3;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.cash_topup.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, kb3.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/cash_topup/impl/databinding/ScreenCashTopupLocationsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cashTopUpLocations_bottomView;
        BottomExpandableDialogView bottomExpandableDialogView = (BottomExpandableDialogView) ViewBindings.findChildViewById(p0, i);
        if (bottomExpandableDialogView != null) {
            i = R$id.cashTopUpLocations_fab;
            FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
            if (formsActionButton != null) {
                i = R$id.cashTopUpLocations_locationsRv;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.cashTopUpLocations_map;
                    MapView mapView = (MapView) ViewBindings.findChildViewById(p0, i);
                    if (mapView != null) {
                        i = R$id.cashTopUpLocations_navBar;
                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                        if (basicNavBar != null) {
                            i = R$id.cashTopUpLocations_searchButton;
                            SearchButton searchButton = (SearchButton) ViewBindings.findChildViewById(p0, i);
                            if (searchButton != null) {
                                i = R$id.cashTopUpLocations_smallAction;
                                SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                if (smallActionButton != null) {
                                    return new kb3.a((ControllerContainerCoordinatorLayout) p0, bottomExpandableDialogView, formsActionButton, screenContentRecyclerView, mapView, basicNavBar, searchButton, smallActionButton);
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
