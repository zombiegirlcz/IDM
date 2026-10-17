package w7b;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.cobranded.cards.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, p5j.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/cobranded/cards/impl/databinding/CobrandedValueReminderScreenBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCobrandedValueReminder_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.screenCobrandedValueReminder_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.screenCobrandedValueReminder_twinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                if (twinVerticalButton != null) {
                    return new p5j.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, screenContentRecyclerView, twinVerticalButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
