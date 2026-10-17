package ok7;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, cj7.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/insurance/impl/databinding/ScreenCfacInsuranceDocumentsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.screenCFACInsuranceDocuments_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.screenCFACInsuranceDocuments_tabsView;
            FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
            if (fixedTabs != null) {
                i = R$id.screenCFACInsuranceDocuments_viewPager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                if (viewPager2 != null) {
                    return new cj7.b(controllerContainerConstraintLayout, navBarWithToolbar, fixedTabs, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
