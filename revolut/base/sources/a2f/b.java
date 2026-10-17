package a2f;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trade_rev_points.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, q1f.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/trade_rev_points/impl/databinding/ScreenTradeRevPointsAccountRegistrationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.tradeRevPointsAccountRegistration_footerText;
        FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
        if (footerTextView != null) {
            i = R$id.tradeRevPointsAccountRegistration_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.tradeRevPointsAccountRegistration_nextButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    i = R$id.tradeRevPointsAccountRegistration_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new q1f.b(footerTextView, largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
