package v44;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, aw3.d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditApplicationDocumentViewerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.creditApplicationDocumentViewerScreen_navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.creditApplicationDocumentViewerScreen_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.creditApplicationDocumentViewerScreen_twinVerticalButton;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                if (twinVerticalButton != null) {
                    return new aw3.d((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, screenContentRecyclerView, twinVerticalButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
