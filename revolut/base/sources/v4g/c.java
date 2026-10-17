package v4g;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, c4g.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsBaggageSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelFlightsBaggageSelectionScreen_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            i = R$id.travelFlightsBaggageSelectionScreen_footer;
            if (((LinearLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.travelFlightsBaggageSelectionScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.travelFlightsBaggageSelectionScreen_price;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                    if (linearLayout != null) {
                        i = R$id.travelFlightsBaggageSelectionScreen_priceFiat;
                        UIKitTextView uIKitTextView = (UIKitTextView) ViewBindings.findChildViewById(p0, i);
                        if (uIKitTextView != null) {
                            i = R$id.travelFlightsBaggageSelectionScreen_priceLabel;
                            UIKitTextView uIKitTextView2 = (UIKitTextView) ViewBindings.findChildViewById(p0, i);
                            if (uIKitTextView2 != null) {
                                i = R$id.travelFlightsBaggageSelectionScreen_pricePoints;
                                UIKitTextView uIKitTextView3 = (UIKitTextView) ViewBindings.findChildViewById(p0, i);
                                if (uIKitTextView3 != null) {
                                    i = R$id.travelFlightsBaggageSelectionScreen_priceProgress;
                                    ProgressSwitcher progressSwitcher = (ProgressSwitcher) ViewBindings.findChildViewById(p0, i);
                                    if (progressSwitcher != null) {
                                        i = R$id.travelFlightsBaggageSelectionScreen_recyclerView;
                                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                                            return new c4g.c(controllerContainerCoordinatorLayout, largeActionButton, navBarWithToolbar, linearLayout, uIKitTextView, uIKitTextView2, uIKitTextView3, progressSwitcher);
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
