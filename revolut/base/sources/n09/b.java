package n09;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.learn.shared.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, d09.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/learn/shared/impl/databinding/ScreenLearnHomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.learnHome_navBar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.learnHome_tabs;
            Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
            if (tabs != null) {
                i = R$id.learnHome_viewPager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                if (viewPager2 != null) {
                    return new d09.b(viewPager2, tabs, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
