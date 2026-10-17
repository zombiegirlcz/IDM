package b6i;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.q implements Function1 {
    public static final t0 f = new t0();

    public t0() {
        super(1, s7i.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.moveMoneyAmount_basicNavBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.moveMoneyAmount_bottomContainer;
            if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                int i2 = R$id.moveMoneyAmount_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                    i2 = R$id.moveMoneyAmount_scheduleButton;
                    LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i2);
                    if (largeActionButton != null) {
                        i2 = R$id.moveMoneyAmount_submitButton;
                        LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i2);
                        if (largeActionButton2 != null) {
                            return new s7i.a(controllerContainerConstraintLayout, basicNavBar, largeActionButton, largeActionButton2);
                        }
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
