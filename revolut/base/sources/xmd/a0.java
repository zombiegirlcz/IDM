package xmd;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.ui_kit_artboard.PlainLabelView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.q implements Function1 {
    public static final a0 f = new a0();

    public a0() {
        super(1, hmd.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenSetupBudgetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.setupBudget_amount;
        AnimatedNumbersView animatedNumbersView = (AnimatedNumbersView) ViewBindings.findChildViewById(p0, i);
        if (animatedNumbersView != null) {
            i = R$id.setupBudget_calculationDescription;
            PlainLabelView plainLabelView = (PlainLabelView) ViewBindings.findChildViewById(p0, i);
            if (plainLabelView != null) {
                i = R$id.setupBudget_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(p0, i);
                if (constraintLayout != null) {
                    i = R$id.setupBudget_footer;
                    ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
                    if (actionFooterView != null) {
                        i = R$id.setupBudget_navBar;
                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                        if (basicNavBar != null) {
                            i = R$id.setupBudget_recyclerView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(p0, i);
                            if (recyclerView != null) {
                                return new hmd.g((ControllerContainerFrameLayout) p0, animatedNumbersView, plainLabelView, constraintLayout, actionFooterView, basicNavBar, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
