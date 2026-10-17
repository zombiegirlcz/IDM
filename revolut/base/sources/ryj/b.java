package ryj;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.learn.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, lyj.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/learn/impl/databinding/ScreenGlossaryHomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.glossaryHome_labeledRecyclerViewScroller;
        LabeledVerticalScrollView labeledVerticalScrollView = (LabeledVerticalScrollView) ViewBindings.findChildViewById(p0, i);
        if (labeledVerticalScrollView != null) {
            i = R$id.glossaryHome_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.glossaryHome_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    i = R$id.glossaryHome_viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                    if (viewPager2 != null) {
                        return new lyj.a((ControllerContainerCoordinatorLayout) p0, labeledVerticalScrollView, navBarWithToolbar, tabs, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
