package ru5;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.feature.crypto_investments.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, iu5.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto_investments/impl/databinding/ScreenActivityBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.monthTabs;
        Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
        if (tabs != null) {
            i = R$id.navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.slidingContainer;
                    SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) ViewBindings.findChildViewById(p0, i);
                    if (slidingFromTopViewContainer != null) {
                        return new iu5.a(tabs, navBarWithToolbar, slidingFromTopViewContainer, (ControllerContainerCoordinatorLayout) p0, screenContentRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
