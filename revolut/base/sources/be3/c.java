package be3;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.cashback.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, xc3.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/cashback/impl/databinding/ScreenCashbackWithdrawMetalBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.cashbackWithdrawMetalScreen_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.cashbackWithdrawMetalScreen_navBarWithAvatar;
            NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i2);
            if (navBarWithAvatar != null) {
                i2 = R$id.cashbackWithdrawMetalScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                    return new xc3.b(largeActionButton, navBarWithAvatar, controllerContainerCoordinatorLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
