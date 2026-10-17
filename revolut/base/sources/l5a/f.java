package l5a;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, q3a.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.transferScreen_navBar;
        AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) ViewBindings.findChildViewById(p0, i);
        if (accountsNavBarContentView != null) {
            i = R$id.transferScreen_navBarWithContainer;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.transferScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new q3a.a(controllerContainerCoordinatorLayout, accountsNavBarContentView, navBarWithContainer, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
