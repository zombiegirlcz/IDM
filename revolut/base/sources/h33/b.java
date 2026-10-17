package h33;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, n13.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_order_new/impl/databinding/ScreenDeliveryToFormBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.deliveryToFormSaveButton;
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) ViewBindings.findChildViewById(p0, i);
        if (collapsingActionButton != null) {
            i = R$id.navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new n13.c((ControllerContainerCoordinatorLayout) p0, collapsingActionButton, navBarWithToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
