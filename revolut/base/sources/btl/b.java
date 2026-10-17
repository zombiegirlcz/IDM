package btl;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.trading.orders.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, srl.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/trading/orders/databinding/FlowRecurringBuyAssetDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.actionsPanel;
        TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) ViewBindings.findChildViewById(p0, i);
        if (twinHorizontalButton != null) {
            i = R$id.screen_transparent_container;
            if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                return new srl.a((ControllerContainerFrameLayout) p0, twinHorizontalButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
