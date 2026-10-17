package c5a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BackgroundContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x0 extends kotlin.jvm.internal.q implements Function1 {
    public static final x0 f = new x0();

    public x0() {
        super(1, q3a.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsTransfersNewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.transferScreen_navigationBar;
        NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
        if (navBarWithContainer != null) {
            i = R$id.transferScreen_navigationBar_background;
            BackgroundContentView backgroundContentView = (BackgroundContentView) ViewBindings.findChildViewById(p0, i);
            if (backgroundContentView != null) {
                i = R$id.transferScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new q3a.e(controllerContainerCoordinatorLayout, navBarWithContainer, backgroundContentView, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
