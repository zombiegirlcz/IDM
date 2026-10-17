package n8i;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, s7i.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyTopupBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenMoveMoneyTopup_bottomContainer;
        if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            i = R$id.screenMoveMoneyTopup_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.screenMoveMoneyTopup_navigationBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.screenMoveMoneyTopup_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        i = R$id.screenMoveMoneyTopup_scheduleButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            i = R$id.screenMoveMoneyTopup_submitButton;
                            LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton2 != null) {
                                return new s7i.d(controllerContainerConstraintLayout, footerTextView, navBarWithToolbar, screenContentRecyclerView, largeActionButton, largeActionButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
