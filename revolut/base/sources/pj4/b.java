package pj4;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import aw3.u;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
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
        super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenWaitingListV3DashboardBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.waitingListV3Dashboard_actionFooter;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.waitingListV3Dashboard_backgroundImage;
            UIKitImageView uIKitImageView = (UIKitImageView) ViewBindings.findChildViewById(p0, i);
            if (uIKitImageView != null) {
                i = R$id.waitingListV3Dashboard_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.waitingListV3Dashboard_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        return new u((ControllerContainerCoordinatorLayout) p0, actionFooterView, uIKitImageView, navBarWithToolbar, screenContentRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
