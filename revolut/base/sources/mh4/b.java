package mh4;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, aw3.n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditToRefinanceSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.creditToRefinanceSelection_actionFooterView;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.creditToRefinanceSelection_bottomRecyclerView;
            AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (asyncDiffRecyclerView != null) {
                i = R$id.creditToRefinanceSelection_footerContainer;
                if (((ControllerContainerLinearLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.creditToRefinanceSelection_gradient;
                    if (((LinearLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.creditToRefinanceSelection_navBarWithToolbar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithToolbar != null) {
                            i = R$id.creditToRefinanceSelection_recyclerView;
                            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                                return new aw3.n((ControllerContainerLinearLayout) p0, actionFooterView, asyncDiffRecyclerView, navBarWithToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
