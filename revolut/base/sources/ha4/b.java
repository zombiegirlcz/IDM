package ha4;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.HeaderWithGaugeBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, aw3.j.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerGaugeBarFooterBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.screenCreditRecyclerGaugeBarFooter_footerButtons;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.screenCreditRecyclerGaugeBarFooter_navBar;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.screenCreditRecyclerGaugeBarFooter_navBarContentView;
                HeaderWithGaugeBarContentView headerWithGaugeBarContentView = (HeaderWithGaugeBarContentView) ViewBindings.findChildViewById(p0, i);
                if (headerWithGaugeBarContentView != null) {
                    i = R$id.screenCreditRecyclerGaugeBarFooter_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new aw3.j((ControllerContainerCoordinatorLayout) p0, actionFooterView, navBarWithContainer, headerWithGaugeBarContentView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
