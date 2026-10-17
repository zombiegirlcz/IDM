package e7i;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, s7i.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyAutomationLimitBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.moveMoneyAutomationLimit_confirm;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.moveMoneyAutomationLimit_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                i = R$id.moveMoneyAutomationLimit_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.moveMoneyAutomationLimit_tabs;
                    FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
                    if (fixedTabs != null) {
                        return new s7i.b((ControllerContainerCoordinatorLayout) p0, actionFooterView, basicNavBar, fixedTabs);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
