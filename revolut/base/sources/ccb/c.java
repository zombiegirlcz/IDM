package ccb;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.retail.money_box_amount.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, wbb.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/money_box_amount/databinding/ScreenMoneyBoxInputBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.moneyBoxInput_navBar;
        NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithAvatar != null) {
            i = R$id.moneyBoxInput_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.moneyBoxInput_scheduleButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    i = R$id.moneyBoxInput_submitButton;
                    LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                    if (largeActionButton2 != null) {
                        return new wbb.a((ControllerContainerCoordinatorLayout) p0, navBarWithAvatar, largeActionButton, largeActionButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
