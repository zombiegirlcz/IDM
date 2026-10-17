package t5e;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, m4e.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/structured_note/details/impl/databinding/FlowPerformanceTrackerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.flowPerformanceTracker_pager;
        if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.flowPerformanceTracker_tabs;
            FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
            if (fixedTabs != null) {
                i = R$id.flowPerformanceTracker_toolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    return new m4e.b((ControllerContainerConstraintLayout) p0, fixedTabs, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
