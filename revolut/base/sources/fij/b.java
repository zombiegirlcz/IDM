package fij;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.esim.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, wej.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimGetPlanBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenEsimGetPlan_button;
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
        if (twinVerticalButton != null) {
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            i = R$id.screenEsimGetPlan_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenEsimGetPlan_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    i = R$id.screenEsimGetPlan_viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                    if (viewPager2 != null) {
                        return new wej.b(controllerContainerConstraintLayout, twinVerticalButton, navBarWithToolbar, tabs, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
