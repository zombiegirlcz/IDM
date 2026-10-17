package wqd;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, hmd.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/spending_analytics/impl/databinding/FlowRevIqHomePagerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.revIQHomeFlow_pagerIndicatorView;
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = (ScrollingPagerIndicatorView) ViewBindings.findChildViewById(p0, i);
        if (scrollingPagerIndicatorView != null) {
            i = R$id.revIQHomeFlow_viewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
            if (viewPager2 != null) {
                return new hmd.e(controllerContainerConstraintLayout, scrollingPagerIndicatorView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
