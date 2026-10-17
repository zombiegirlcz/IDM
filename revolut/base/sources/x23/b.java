package x23;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, n13.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_order_new/impl/databinding/ScreenCardPersonalisationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cardPersonalisation_footer;
        if (((FooterTextView) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.cardPersonalisation_suggestionsRecyclerView;
            AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (asyncDiffRecyclerView != null) {
                i = R$id.cardPersonalisationView;
                CardPersonalisationView cardPersonalisationView = (CardPersonalisationView) ViewBindings.findChildViewById(p0, i);
                if (cardPersonalisationView != null) {
                    i = R$id.navBarWithToolbar;
                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithToolbar != null) {
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                        i = R$id.twinButton;
                        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                        if (twinVerticalButton != null) {
                            return new n13.b(controllerContainerCoordinatorLayout, asyncDiffRecyclerView, cardPersonalisationView, navBarWithToolbar, twinVerticalButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
