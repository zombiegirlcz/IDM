package rbc;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.revolutpay.order_tracking.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, rac.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/revolutpay/order_tracking/impl/databinding/ScreenShippingTrackingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.shippingTrackingScreen_navBar;
        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
        if (basicNavBar != null) {
            i = R$id.shippingTrackingScreen_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                return new rac.b(controllerContainerCoordinatorLayout, basicNavBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
