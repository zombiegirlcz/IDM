package cie;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.tab.accounts.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, hge.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/tab/accounts/impl/databinding/ScreenTabAccountsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.tab_accounts_accountSelectionContent;
        AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) ViewBindings.findChildViewById(p0, i);
        if (accountsNavBarContentView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            i = R$id.tab_accounts_navBarWithContainer;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.tab_accounts_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.tab_accounts_smallActionButton;
                    SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                    if (smallActionButton != null) {
                        return new hge.b(controllerContainerCoordinatorLayout, accountsNavBarContentView, controllerContainerCoordinatorLayout, navBarWithContainer, screenContentRecyclerView, smallActionButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
