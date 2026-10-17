package nme;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarContentViewSwitcher;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.tab.lifestyle.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, tle.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/tab/lifestyle/impl/databinding/ScreenTabLifestyleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.tabLifestyle_button;
        SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
        if (smallActionButton != null) {
            i = R$id.tabLifestyle_navBarContentSwitcher;
            NavBarContentViewSwitcher navBarContentViewSwitcher = (NavBarContentViewSwitcher) ViewBindings.findChildViewById(p0, i);
            if (navBarContentViewSwitcher != null) {
                i = R$id.tabLifestyle_navBarWithContainer;
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainer != null) {
                    i = R$id.tabLifestyle_pointsContent;
                    AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) ViewBindings.findChildViewById(p0, i);
                    if (accountsNavBarContentView != null) {
                        i = R$id.tabLifestyle_recyclerView;
                        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                        if (screenContentRecyclerView != null) {
                            i = R$id.tabLifestyle_scrollerContent;
                            ScrollerNavBarContentView scrollerNavBarContentView = (ScrollerNavBarContentView) ViewBindings.findChildViewById(p0, i);
                            if (scrollerNavBarContentView != null) {
                                return new tle.a((ControllerContainerCoordinatorLayout) p0, smallActionButton, navBarContentViewSwitcher, navBarWithContainer, accountsNavBarContentView, screenContentRecyclerView, scrollerNavBarContentView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
