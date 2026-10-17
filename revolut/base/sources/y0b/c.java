package y0b;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.retail.advanced_charts.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, r0b.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/advanced_charts/impl/databinding/ScreenAdvancedChartsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.advanced_charts_screen_bottom_recycler_view;
        AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
        if (asyncDiffRecyclerView != null) {
            i = R$id.advanced_charts_screen_chart_recycler_view;
            AsyncDiffRecyclerView asyncDiffRecyclerView2 = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (asyncDiffRecyclerView2 != null) {
                ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                i = R$id.advancedChartsScreen_navBar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                if (basicNavBar != null) {
                    i = R$id.advanced_charts_screen_trade_recycler_view;
                    AsyncDiffRecyclerView asyncDiffRecyclerView3 = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (asyncDiffRecyclerView3 != null) {
                        return new r0b.a(controllerContainerConstraintLayout, asyncDiffRecyclerView, asyncDiffRecyclerView2, controllerContainerConstraintLayout, basicNavBar, asyncDiffRecyclerView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
