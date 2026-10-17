package e2j;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.balance.picker.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, x1j.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/balance/picker/impl/databinding/ScreenCurrencyChooserBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.currencyChooser_footerView;
        FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
        if (footerTextView != null) {
            i = R$id.currencyChooser_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.currencyChooser_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new x1j.b((ControllerContainerCoordinatorLayout) p0, footerTextView, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
