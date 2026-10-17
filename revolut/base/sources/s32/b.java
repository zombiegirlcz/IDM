package s32;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.CenteredFixedTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, m12.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrContainerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.qrContainer_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.qrContainer_tabs;
            CenteredFixedTabsView centeredFixedTabsView = (CenteredFixedTabsView) ViewBindings.findChildViewById(p0, i);
            if (centeredFixedTabsView != null) {
                i = R$id.qrContainer_viewPager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new m12.g((ControllerContainerConstraintLayout) p0, navBarWithToolbar, centeredFixedTabsView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
