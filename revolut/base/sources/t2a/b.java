package t2a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.payments.transfers.personalisation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, l2a.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/transfers/personalisation/impl/databinding/TransfersPersonalisationFlowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.transfersPersonalisationFlow_container;
        if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.transfersPersonalisationFlow_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                return new l2a.d((ControllerContainerConstraintLayout) p0, basicNavBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
