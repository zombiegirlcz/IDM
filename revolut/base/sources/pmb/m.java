package pmb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, xmb.i.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsProductSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.selectFlexibleAccount_actionFooter;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.selectFlexibleAccount_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.selectFlexibleAccount_tabsView;
                DraggableTabsView draggableTabsView = (DraggableTabsView) ViewBindings.findChildViewById(p0, i);
                if (draggableTabsView != null) {
                    i = R$id.selectFlexibleAccount_viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                    if (viewPager2 != null) {
                        return new xmb.i((ControllerContainerCoordinatorLayout) p0, actionFooterView, navBarWithToolbar, draggableTabsView, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
