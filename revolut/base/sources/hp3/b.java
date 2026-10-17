package hp3;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.corporate_events.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, xo3.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/corporate_events/impl/databinding/ScreenCorporateEventsHomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.corporateEventsHome_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.corporateEventsHome_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.corporateEventsHome_scrollFab;
                FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
                if (formsActionButton != null) {
                    i = R$id.corporateEventsHome_tabs;
                    FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
                    if (fixedTabs != null) {
                        return new xo3.b((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, screenContentRecyclerView, formsActionButton, fixedTabs);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
