package u7k;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.payment_links.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public static final s f = new s();

    public s() {
        super(1, o7k.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/payments/payment_links/impl/databinding/ScreenPaymentLinkDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.plDetails_recyclerView;
        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
            i = R$id.ptDetails_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                return new o7k.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
