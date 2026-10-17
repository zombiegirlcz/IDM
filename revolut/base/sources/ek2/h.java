package ek2;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.atm.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, uj2.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/atm/impl/databinding/ScreenAtmDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.atmDetailsScreen_collapsedTitleBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.atmDetailsScreen_collapsedTitleClickArea;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
            if (frameLayout != null) {
                i = R$id.atmDetailsScreen_container;
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) ViewBindings.findChildViewById(p0, i);
                if (controllerContainerCoordinatorLayout != null) {
                    i = R$id.atmDetailsScreen_navigationBar;
                    NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithBigTile != null) {
                        i = R$id.atmDetailsScreen_recyclerView;
                        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                        if (screenContentRecyclerView != null) {
                            return new uj2.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, frameLayout, controllerContainerCoordinatorLayout, navBarWithBigTile, screenContentRecyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
