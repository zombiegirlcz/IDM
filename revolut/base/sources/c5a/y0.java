package c5a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y0 extends kotlin.jvm.internal.q implements Function1 {
    public static final y0 f = new y0();

    public y0() {
        super(1, q3a.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsTransfersRev10Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.transferScreen_navigationBar;
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) ViewBindings.findChildViewById(p0, i);
        if (navBarWithContainerHeaderView != null) {
            i = R$id.transferScreen_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                return new q3a.g(controllerContainerConstraintLayout, navBarWithContainerHeaderView, screenContentRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
