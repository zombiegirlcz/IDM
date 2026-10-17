package tne;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.tax_residency.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, gne.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/tax_residency/impl/databinding/ScreenTaxExemptionAmountSelectorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.exemptionAmountSelector_navBar;
        NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithAvatar != null) {
            i = R$id.exemptionAmountSelector_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.exemptionAmountSelector_submitButton;
                FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(p0, i);
                if (footerActionButtonView != null) {
                    return new gne.a((ControllerContainerCoordinatorLayout) p0, navBarWithAvatar, footerActionButtonView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
