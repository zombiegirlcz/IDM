package db;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c(1, ua.a.class, "bind", "bind(Landroid/view/View;)Lcom/feature/user/details/impl/databinding/ScreenUserDetailsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R.id.userDetails_button;
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) ViewBindings.findChildViewById(p0, R.id.userDetails_button);
        if (collapsingActionButton != null) {
            i = R.id.userDetails_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, R.id.userDetails_navBar);
            if (navBarWithToolbar != null) {
                i = R.id.userDetails_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, R.id.userDetails_recyclerView);
                if (screenContentRecyclerView != null) {
                    i = R.id.userDetails_tabs;
                    DraggableTabsView draggableTabsView = (DraggableTabsView) ViewBindings.findChildViewById(p0, R.id.userDetails_tabs);
                    if (draggableTabsView != null) {
                        return new ua.a((ControllerContainerCoordinatorLayout) p0, collapsingActionButton, navBarWithToolbar, screenContentRecyclerView, draggableTabsView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
